package Pages;

import java.util.List;

import Tests.AbstractBaseTests.TestBase;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class VendasPage extends TestBase {
	
	public void clicaBotaoItemVendas() throws InterruptedException {
		List<MobileElement> elementosencontrados = driver.findElements(MobileBy.id("com.ebay.mobile:id/button_list_an_item"));
		elementosencontrados.get(0).click();
	}
	
	public String capturaMsgLogin() throws InterruptedException {
		MobileElement capturamsglogin = driver.findElement(MobileBy.id("com.ebay.mobile:id/text_google_sign_in_greeting"));
		String msglogin = capturamsglogin.getText();
		return msglogin;
	}
}
