package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"}, // formata a saida no console
		features = {"src\\main\\resources\\Features"}, //local onde estão localizadas as features
		glue = "steps", // local onde estãp localizadas as steps
		snippets = SnippetType.CAMELCASE, // define o padrão de leitura de métodos para o cucumber (lá nas steps)
		monochrome = true, // melhora a formatação do console
		dryRun = false // ao executar a feture, será análisada se ela está implementada, caso não esteja será gerado seus métodos padrão
		)
public class RunnerTest {

}
