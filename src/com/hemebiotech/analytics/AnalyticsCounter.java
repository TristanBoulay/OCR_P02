package com.hemebiotech.analytics;


import java.util.List;
import java.util.Map;


public class AnalyticsCounter {
	
	
	
	public static void main(String args[])  {
		ReadAndAdd analytics = new ReadAndAdd();
		CountOccurrence analyticsSymptoms = new CountOccurrence();
		WriteFile analyticsSymptomsListed = new WriteFile();
		
		try {
			List<String> symptomsReturned = analytics.readAndAdd("symptom.txt");
			Map<String, Integer>symptomHashReturned = analyticsSymptoms.countOccurrence(symptomsReturned);
			analyticsSymptomsListed.writeFile(symptomHashReturned);
		} catch (Exception e) {
			System.out.println("une erreur s'est produite lors du decompte des symptoms: " + e.getMessage());
		}
	}

	
	
	
	
}


