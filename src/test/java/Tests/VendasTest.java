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

import org.testng.Assert;

import Pages.InitialPage;
import Pages.VendasPage;
import Tests.AbstractBaseTests.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@CucumberOptions(
        strict = true,
        monochrome = true,
        features = "classpath:Features/VendasTest.feature",
        plugin = {"pretty"}
)

public class VendasTest extends TestBase {
	
	
	public void esperar(long tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
    
    @Given("^realizo o toque no botao vendas$")
    public void tocarBotaoVendas() throws InterruptedException {
    	InitialPage clicavendas = new InitialPage();
    	clicavendas.clicaVendasInicial();
    }

    @When("^tocar no botao para colocar um item para venda$")
    public void tocarBotaoItemVendas() throws InterruptedException {
    	VendasPage clicaitemvendas = new VendasPage();
    	clicaitemvendas.clicaBotaoItemVendas();
    }

    @Then("^posso verificar a mensagem para login$")
    public void verificarTituloVendas() throws InterruptedException {
    	VendasPage verificamsglogin = new VendasPage();
		Assert.assertEquals("Você pode usar seu e-mail ou nome de usuário, ou continuar com sua conta de rede social.", verificamsglogin.capturaMsgLogin());
    }
}
