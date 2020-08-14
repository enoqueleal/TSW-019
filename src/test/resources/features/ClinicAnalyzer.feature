Feature: Ordenar as Clinicas conforme o SLA

Scenario Outline: Verificar se a clinica esta ate 15 KM da casa do paciente

Given O paciente precisa de tratamento

When A clinica esta a "<KM distancia paciente>" KM de distancia

Then Clinica constara na lista com prioridade "<Relevancia na lista>"

Examples:                      		
| KM distancia paciente	|	Relevancia na lista	|
| 00										|	alta		 						|
| 05										|	media								|
| 10										|	baixa								|