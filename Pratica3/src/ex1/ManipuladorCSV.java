 package ex1;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

@SuppressWarnings("deprecation")
public class ManipuladorCSV {
	private ArrayList<Cliente> listaClientes = new ArrayList<>();
	
	
	public List<Cliente> lerArquivo() {
		

		try {
			Reader leitorArquivo = new FileReader("clientes-banco.csv");
			CSVFormat configCSV = CSVFormat.Builder.create()
					.setHeader("iban", "nome", "sobrenome", "email", "genero", "saldo").setSkipHeaderRecord(true)
					.build().withTrim();
			CSVParser interpretadorCSV = configCSV.parse(leitorArquivo);
			List<CSVRecord> records = interpretadorCSV.getRecords();

			for (CSVRecord record : records) {
				Cliente cliente = new Cliente(record.get(0), record.get(1), record.get(2), record.get(3), record.get(4), new BigDecimal(record.get(5)));
				listaClientes.add(cliente);
			}

		} catch (IOException e) {
			System.out.println("Erro ao abrir arquivo CSV");
		}

		return listaClientes;
	}


	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}


}