package com.tsw019.steps;

import static com.tsw019.analyzer.ClinicAnalyzer.*;
import static org.junit.Assert.*;

import cucumber.api.java.en.*;

public class Steps {
	
	int distancia;

	@Given("^O paciente precisa de tratamento$")
	public void dado_que_o_paciente_precisa_de_tratamento() {
		
		System.out.println();
		System.out.println("O paciente precisa de tratamento");
		
	}

	@When("^A clinica esta a \"(.*)\" KM de distancia$")
	public void quando_a_clinica_esta_a(int distancia) {
		
		this.distancia = distancia;
		
		System.out.println("A clínica está a "+ distancia + "KM de distância ");
		
	}

	@Then("^Clinica constara na lista com prioridade \"(.*)\"$")
	public void entao__a_clinica_constara_na_lista_com_prioridade(String prioridade) {
		
		String prioridadeRetornada = analyzeDistance(distancia);
		
		System.out.println("Clínica constará na lista com prioridade " + prioridadeRetornada);
		
		assertEquals(prioridade, prioridadeRetornada);
		
	}

}