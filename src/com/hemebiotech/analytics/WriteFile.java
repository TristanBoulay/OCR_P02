package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Map;

public class WriteFile {
	public void writeFile(Map<String, Integer> symptomHash) throws Exception {
		FileWriter writer = new FileWriter("result.out");
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
