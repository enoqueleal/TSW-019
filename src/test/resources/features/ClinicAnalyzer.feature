#language:pt

Funcionalidade: Ordenar as Clinicas conforme o SLA

Esquema do Cenario: Verificar se a clinica esta ate 15 KM da casa do paciente

Dado O paciente precisa de tratamento

Quando A clinica esta a "<KM distancia paciente>" KM de distancia

Entao Clinica constara na lista com prioridade "<Relevancia na lista>"

Exemplos:                      		
| KM distancia paciente | Relevancia na lista |
| 00                    | alta                |
| 05                    | media               |
| 10                    | baixa               |
