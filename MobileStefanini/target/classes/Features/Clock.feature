#language: pt
#enconding: UTF-8

Funcionalidade: Clock mobile

 Eu como usuario gostaria de adicionar um novo alarme para que eu acorde mais cedo no dia seguinte

Cenario: Adicionar novo alarme

	
	Dado que o usuario acione o menu alarme
	Quando o usuario acionar o botao adicionar alarme
	E configurar a hora para "4:25", "AM"
	Entao o app adiciona um novo alarme com as informacoes: 
		
		|Repeat					 |
		|Default (Cesium)|
		|Delete          |
		|Label           |
		
	
	

	