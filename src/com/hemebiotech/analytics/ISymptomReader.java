package com.hemebiotech.analytics;

import java.util.List;

/**
 * 
 * @author tristanboulay
 * Cette interface permet de lire des symptomes
 *
 */
public interface ISymptomReader {

	/**
	 * 
	 * @return {@link List} retourne une liste de symptomes.
	 * 
	 */
	List<String> getSymptoms();

}
