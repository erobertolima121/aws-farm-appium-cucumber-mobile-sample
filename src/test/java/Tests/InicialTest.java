/*
 * Copyright 2014-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;

import Tests.AbstractBaseTests.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

@CucumberOptions(
        strict = true,
        monochrome = true,
        features = "classpath:InicialTest",
        plugin = {"pretty"}
)
public class InicialTest extends TestBase {
	
	public void esperar(long tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

    @Given("^que estou na pagina inicial$")
    public void paginaInicial() throws InterruptedException {
    	MobileElement pageinicial = driver.findElement(MobileBy.className("android.widget.TextView"));
		String inicial = pageinicial.getText();
		Assert.assertEquals("Pesquise o que quiser", inicial);
		}

    @When("^tocar no botao vendas$")
    public void tocarBotaoVendas() throws InterruptedException {
    	List<MobileElement> elementosencontrados = driver.findElements(By.className("android.widget.TextView"));
		elementosencontrados.get(1).click();
    }

    @Then("^posso verificar a pagina de vendas$")
    public void verificarTituloVendas() throws InterruptedException {
    	MobileElement pagevenda = driver.findElement(MobileBy.className("android.widget.TextView"));
		String venda = pagevenda.getText();
		Assert.assertEquals("Vendas", venda);
    }
}
