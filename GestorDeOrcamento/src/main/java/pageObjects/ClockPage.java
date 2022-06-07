package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ClockPage {


	public ClockPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
//	MobileElement botaoExpandir = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@resource-id='com.google.android.deskclock:id/arrow'][1]"));
//	botaoExpandir.click();
//	Thread.sleep(2000);

//	x-path
//	//tag[@atrib="atributeName"]
//	//div[@class="nomeClasseHtml"]

//	mobile
//	//class[@atibuto="nomeClasse"]
//		android.widget.TextView[@text="8:30 AM"]

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ALARM']")
	private MobileElement botaoAlarme;

	@AndroidFindBy(accessibility = "Add alarm")
	private MobileElement botaoAddAlarm;

	@AndroidFindBy(id = "android:id/button1")
	private MobileElement botaoOK;

	@AndroidFindBy(id = "com.google.android.deskclock:id/edit_label")
	private MobileElement campoLabel;

	@AndroidFindBy(xpath = "//android.widget.EditText[@class='android.widget.EditText']")
	private MobileElement campoEditText;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Default (Cesium)']")
	private MobileElement comboBox;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Barium']")
	private MobileElement opcaoCombo;

	@AndroidFindBy(xpath = "//android.widget.Switch[@text='ON'][1]")
	private MobileElement switchAlarme;

	@AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Repeat']")
	private MobileElement checkBox;

	public void acessarMenuAlarme() throws Exception {
//		x-path
		// MobileElement botaoAlarme = (MobileElement)
		// driver.findElementByXPath("//android.widget.TextView[@text='ALARM']");

//		MobileElement botaoAlarme = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='ALARM']"));

		botaoAlarme.click();
	}

	public void acionarBotaoNovoAlarme() throws Exception {
//		accessibilityId => content desc
//		MobileElement botaoAddAlarm = (MobileElement) driver.findElement(MobileBy.AccessibilityId("Add alarm"));
		botaoAddAlarm.click();
	}

	public void acionarBotaoOk() throws Exception {
//		id
//		MobileElement botaoOk = (MobileElement) driver.findElement(MobileBy.id("android:id/button1"));

		botaoOK.click();
	}

	public void interagirComEditText() throws Exception {

		acessarMenuAlarme();
		acionarBotaoNovoAlarme();

//		MobileElement campoLabel = (MobileElement) driver.findElement(MobileBy.id("com.google.android.deskclock:id/edit_label"));
		campoLabel.click();

//		MobileElement campoEditText = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.EditText[@class='android.widget.EditText']"));
		campoEditText.sendKeys("acorda jamelão!");
	}

	public void interagirComCombo() throws Exception {
		acessarMenuAlarme();
		acionarBotaoNovoAlarme();

//		MobileElement comboBox = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Default (Cesium)']"));
		comboBox.click();

//		MobileElement opcaoCombo = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Barium']"));
		opcaoCombo.click();
	}

	public void interagirComSwitch() throws Exception {
		acessarMenuAlarme();
		acionarBotaoNovoAlarme();

//		MobileElement switchAlarme = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.Switch[@text='ON'][1]"));
		switchAlarme.click();

		assertEquals("false", switchAlarme.getAttribute("checked"));
	}

	public void interagirComCheckBox() throws Exception {
		acessarMenuAlarme();
		acionarBotaoNovoAlarme();

//		MobileElement checkBox = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.CheckBox[@text='Repeat']"));
		checkBox.click();

		assertEquals("true", checkBox.getAttribute("checked"));

	}

	public void clicarNaHora(String hora) throws Exception {

//		accessibilityId => content desc
		MobileElement clickHora = (MobileElement) driver.findElement(MobileBy.AccessibilityId(hora));
		clickHora.click();
	}

	public void clicarNoMinuto(String minuto) throws Exception {

//		accessibilityId => content desc
		MobileElement clickMinuto = (MobileElement) driver.findElement(MobileBy.AccessibilityId(minuto));
		clickMinuto.click();
	}

	public void selecionarPeriodo(String periodo) throws Exception {
		String periodoModificado = periodo.toLowerCase();
//		accessibilityId => content desc
		MobileElement clickPeriodo = (MobileElement) driver.findElement(MobileBy.id("android:id/" + periodoModificado + "_label"));
		clickPeriodo.click();

	}

	public void validarInformacoes(List<String> dados) {
		MobileElement infos;
		
		for (String info : dados) {
			infos = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='"+info+"']"));
			System.out.println("Infos tela: "+ infos.getText());
			assertEquals(info, infos.getText());
		}
		
	}
	


}
