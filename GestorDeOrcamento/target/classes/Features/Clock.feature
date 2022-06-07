#language: pt
#enconding: UTF-8

Funcionalidade: Gestor de Orcamento - Despesas
	Eu enquanto usuario necessito organizar minhas financas para que eu consiga cortar gastos desnecessários e poupar dinheiro	
		
	1- A criação, edição e exclusão de uma transação/despesa deve estar de acordo com o esperado
	2- A Tela de despesas deve mostrar a soma de todas transações listadas
	
Cenario: Adicionar novo alarme
	
	
	
	
	Dado que o usuario acione o menu alarme
	Quando o usuario acionar o botao adicionar alarme
	E configurar a hora para "4:25", "AM"
	Entao o app adiciona um novo alarme com as informacoes: 
		
		|Repeat					 |
		|Default (Cesium)|
		|Delete          |
		|Label           |
		
	
	

	