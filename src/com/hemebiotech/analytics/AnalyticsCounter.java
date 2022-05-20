package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	private final ISymptomReader reader;
	private final ISymptomWriter writer;


	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		this.reader = reader;
		this.writer = writer;		
	}	

	
	public void processSymptoms() {
		List<String> symptoms = reader.getSymptoms();
		Map<String, Integer> occurrence = countOccurrence(symptoms);
		writer.write(occurrence);
	}

	private Map<String, Integer> countOccurrence(List<String> symptoms) {

		Map<String, Integer> symptomHash = new TreeMap<String, Integer>();
		for (String item : symptoms) {
			if (!symptomHash.containsKey(item)) {
				symptomHash.put(item, 1);
			} else if (symptomHash.containsKey(item)) {
				Integer numberOfTime = symptomHash.get(item);
				symptomHash.put(item, numberOfTime + 1);
			}
		}
		return symptomHash;
	}
}
