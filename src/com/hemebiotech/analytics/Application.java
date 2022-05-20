package com.hemebiotech.analytics;

public class Application {

	public static void main(String[] args) {
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
		WriteSymptomDataToFile writer = new WriteSymptomDataToFile("result.out");
		AnalyticsCounter counter = new AnalyticsCounter(reader, writer);
		counter.processSymptoms();

	}

}
