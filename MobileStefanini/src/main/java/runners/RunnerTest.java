package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"}, // formata a saida no console
		features = {"src\\main\\resources\\Features"}, //local onde est�o localizadas as features
		glue = "steps", // local onde est�p localizadas as steps
		snippets = SnippetType.CAMELCASE, // define o padr�o de leitura de m�todos para o cucumber (l� nas steps)
		monochrome = true, // melhora a formata��o do console
		dryRun = false // ao executar a feture, ser� an�lisada se ela est� implementada, caso n�o esteja ser� gerado seus m�todos padr�o
		)
public class RunnerTest {

}
