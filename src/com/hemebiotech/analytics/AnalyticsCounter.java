package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
		String symptom = reader.readLine();
		List<String> symptoms = new ArrayList<>();

		

		while (symptom != null) {
			symptoms.add(symptom);
			symptom = reader.readLine();	
		}
		reader.close();
		Map<String, Integer> symptomHash = new TreeMap<String, Integer>();
		for ( String item : symptoms) {
			if (!symptomHash.containsKey(item)) {
				symptomHash.put(item, 1);
			} else if (symptomHash.containsKey(item)) { 
				Integer numberOfTime = symptomHash.get(item);
				symptomHash.put(item, numberOfTime + 1);
			}
		}
		FileWriter writer = new FileWriter ("result.out");
		for (Map.Entry<String, Integer> entry : symptomHash.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue().toString();
			String line = key + " : " + value;
			System.out.println(line);
			writer.write(line);
			writer.write(System.getProperty("line.separator"));
		}
		writer.close();
	}
}
