package Pages;

import java.util.List;

import org.openqa.selenium.By;

import Tests.AbstractBaseTests.TestBase;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class InitialPage extends TestBase {

	public String verificaInicial() throws InterruptedException {
		MobileElement pageinicial = driver.findElement(MobileBy.className("android.widget.TextView"));
		String inicial = pageinicial.getText();
		return inicial;
	}
	
	public void clicaVendasInicial() throws InterruptedException {
		List<MobileElement> elementosencontrados = driver.findElements(By.className("android.widget.TextView"));
		elementosencontrados.get(1).click();
	}
	
	public String capturaTituloPagina() throws InterruptedException {
		MobileElement capturatitulo = driver.findElement(MobileBy.className("android.widget.TextView"));
		String titulopagina = capturatitulo.getText();
		return titulopagina;
	}
}
