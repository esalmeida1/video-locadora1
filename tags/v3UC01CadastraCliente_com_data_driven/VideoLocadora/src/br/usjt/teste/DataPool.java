package br.usjt.teste;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class DataPool {

	public ArrayList<CasoDeTeste> carregaMassaTeste() throws Exception {
		CasoDeTeste ct = null;
		ArrayList<CasoDeTeste> massaDeTeste = new ArrayList<CasoDeTeste>();
		BufferedReader CSVFile = new BufferedReader(
				new FileReader(
						"f:/projetos2011/asr/treinamento/automacao de teste/estudo de caso/massa de teste 2.csv"));

		String dataRow = CSVFile.readLine(); // Read first line.
		// The while checks to see if the data is null. If
		// it is, we've hit the end of the file. If not,
		// process the data.
		int linha = 1;

		while (dataRow != null) {
			String[] dataArray = dataRow.split(";");
			ct = new CasoDeTeste();
			if (linha > 1) { // despreza a primeira linha
				ct.setId(dataArray[1]); // despreza o indice 0 do vetor
				ct.setSenha(dataArray[2]);
				ct.setCpf(dataArray[3]);
				ct.setNome(dataArray[4]);
				ct.setEndereco(dataArray[5]);
				ct.setTelefone(dataArray[6]);
				ct.setResultadoEsperado(dataArray[7]);
				System.out.println(ct.getId());
				for (String item : dataArray) {
					
					System.out.print(item + "\t");
				}
				System.out.println(); // Print the data line.
				massaDeTeste.add(ct);
			}
			linha++;
			dataRow = CSVFile.readLine(); // Read next line of data.
		}
		// Close the file once all data has been read.
		CSVFile.close();

		// End the printout with a blank line.
		System.out.println();
		return massaDeTeste;
	} // main()
} // CSVRead
