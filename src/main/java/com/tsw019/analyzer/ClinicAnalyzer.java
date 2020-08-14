package com.tsw019.analyzer;

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
	public static String analyzeDistance(int distance) {

		if (distance == 00)	return "alta";

		if (distance <= 05)	return "media";

		return "baixa";

	}

}
