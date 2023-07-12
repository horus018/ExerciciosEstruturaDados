package ex2;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

@SuppressWarnings("deprecation")
public class ManipuladorCSV {
	private ArrayList<Passageiro> listaPassageiros = new ArrayList<>();

	public List<Passageiro> lerArquivo() {

		try {
			Reader leitorArquivo = new FileReader("passageiros.csv");
			CSVFormat configCSV = CSVFormat.Builder.create()
					.setHeader("iban", "nome", "sobrenome", "email", "genero", "saldo").setSkipHeaderRecord(true)
					.build().withTrim();
			CSVParser interpretadorCSV = configCSV.parse(leitorArquivo);
			List<CSVRecord> records = interpretadorCSV.getRecords();

			for (CSVRecord record : records) {
				Passageiro cliente = new Passageiro(Integer.parseInt(record.get(0)), record.get(1),
						Integer.parseInt(record.get(2)), record.get(3));
				listaPassageiros.add(cliente);
			}

		} catch (IOException e) {
			System.out.println("Erro ao abrir arquivo CSV");
		}

		return listaPassageiros;
	}

	public ArrayList<Passageiro> getListaPassageiros() {
		return listaPassageiros;
	}

}