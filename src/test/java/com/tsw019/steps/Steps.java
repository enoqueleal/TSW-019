package com.tsw019.steps;

import com.tsw019.analyzer.ClinicAnalyzer;
import static org.junit.Assert.*;

import cucumber.api.java.Before;
import cucumber.api.java.pt.*;

public class Steps {
	
	int distancia;
	ClinicAnalyzer clinicAnalyzer;
	
	@Before
	public void init(){
		clinicAnalyzer = new ClinicAnalyzer();
	}

	@Dado("^O paciente precisa de tratamento$")
	public void dado_que_o_paciente_precisa_de_tratamento() {
		
		//TODO Implementar a consulta para carregar a lista de clínicas disponíveis
		System.out.println("\nO paciente precisa de tratamento");
		
	}

	@Quando("^A clinica esta a \"(.*)\" KM de distancia$")
	public void quando_a_clinica_esta_a(int distancia) {
		
		this.distancia = distancia;
		
		System.out.println("A clínica está a "+ distancia + " KM de distância ");
		
	}

	@Entao("^Clinica constara na lista com prioridade \"(.*)\"$")
	public void entao_a_clinica_constara_na_lista_com_prioridade(String prioridade) {
		
		String prioridadeRetornada = clinicAnalyzer.analyzeDistance(distancia);
		
		System.out.println("Clínica constará na lista com prioridade " + prioridadeRetornada);
		
		assertEquals(prioridade, prioridadeRetornada);
		
	}

}
