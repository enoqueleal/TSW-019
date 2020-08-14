package com.tsw019.analyzer;

import java.util.List;

/**
 * 
 * @author Administrador
 *
 * Fake clinic analyzer class
 */
public class ClinicAnalyzer {

	/*
	 * Dummy distance analyze 
	 */
	public String analyzeDistance(int distance) {

		if (distance == 00)	return "alta";

		if (distance <= 05)	return "media";

		return "baixa";

	}
	
	public void analyzeOccupation() {
		//TODO implement occupation analysis
	}
	
	public boolean verifyTreatment(List<String> treatments, String treatment) {
		return treatments.contains(treatment);
	}

}
