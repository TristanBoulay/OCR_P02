package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadAndAdd {
	public List<String> readAndAdd(String filename) throws Exception {
		BufferedReader reader = new BufferedReader (new FileReader(filename));
		String line = reader.readLine();
		List<String> symptoms = new ArrayList<>();



		while (line != null) {
			symptoms.add(line);
			line = reader.readLine();	
		}
		reader.close();
		
		return symptoms;
	}

}
