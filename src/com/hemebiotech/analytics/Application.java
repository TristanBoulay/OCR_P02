package com.hemebiotech.analytics;

public class Application {

	public static void main(String[] args) {
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
		AnalyticsCounter counter =new AnalyticsCounter(reader);
		counter.processSymptoms() ;
	}

}
