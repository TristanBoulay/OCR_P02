package com.hemebiotech.analytics;

public class Application {

	public static void main(String[] args) {
		ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
		ISymptomWriter writer = new WriteSymptomDataToFile("result.out");
		AnalyticsCounter counter = new AnalyticsCounter(reader, writer);
		counter.processSymptoms();

	}

}
