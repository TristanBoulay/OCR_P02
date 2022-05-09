package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	private final ISymptomReader reader;

	public AnalyticsCounter(ISymptomReader reader) {
		this.reader = reader;
	}

	// AnalyticsCounter counter = new AnalyticsCounter(sourceFile, targetFile);
	// counter.processSymptoms();
	public void processSymptoms() {
		CountOccurrence analyticsSymptoms = new CountOccurrence();
		WriteFile analyticsSymptomsListed = new WriteFile();
		List<String> symptoms = reader.getSymptoms();
		Map<String, Integer> symptomHashReturned = analyticsSymptoms.countOccurrence(symptoms);
		try {
			analyticsSymptomsListed.writeFile(symptomHashReturned);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
