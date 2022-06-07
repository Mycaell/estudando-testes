package steps;

import static utils.Utils.driver;

import java.util.List;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ClockPage;

public class ClockSteps {
	
	ClockPage clock = new ClockPage(driver);
	

	@Dado("que o usuario acione o menu alarme")
	public void acionarOMenuAlarme() throws Exception {
		clock.acessarMenuAlarme();
	}

	@Quando("o usuario acionar o botao adicionar alarme")
	public void oUsuarioAcionarOBotaoAdicionarAlarme() throws Exception {
		clock.acionarBotaoNovoAlarme();
	}

	@Quando("configurar a hora para {string}, {string}")
	public void configurarAHoraPara(String hora, String periodo) throws Exception {
		
		String tempo[] = hora.split(":");
		
		String horas = tempo[0];
		String minutos = tempo[1];
		
		clock.clicarNaHora(horas);
		clock.clicarNoMinuto(minutos);
		clock.selecionarPeriodo(periodo);
		
		clock.acionarBotaoOk();
	}

	
	@Entao("o app adiciona um novo alarme com as informacoes:")
	public void oAppAdicionaUmNovoAlarmeComAsInformacoes(List<String> dados) {
		clock.validarInformacoes(dados);
	}


	
}
