package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {

	private final String outputFile;
	
	
	
	public WriteSymptomDataToFile(String outputFile) {

		this.outputFile = outputFile;
	}

	public void write(Map<String, Integer> occurrenceSymptoms) {
		try {
			FileWriter writer = new FileWriter(outputFile);
			for (Map.Entry<String, Integer> entry : occurrenceSymptoms.entrySet()) {
				String key = entry.getKey();
				String value = entry.getValue().toString();
				String line = key + " : " + value;
				System.out.println(line);
				writer.write(line);
				writer.write(System.getProperty("line.separator"));
			}
			writer.close();
		} catch (Exception e) {
			System.out.println("impossible d'ecrire dans le fichier de symptomes. Cause de l'erreur: " + e.getMessage());
		}
	}

}


