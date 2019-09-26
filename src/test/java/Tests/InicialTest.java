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

import Hooks.LerDocumentos;
import Pages.InitialPage;
import Tests.AbstractBaseTests.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@CucumberOptions(
        strict = true,
        monochrome = true,
        features = "classpath:Features/InicialTest.feature",
        plugin = {"pretty"}
)

public class InicialTest extends TestBase {
	
	
	public void esperar(long tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
	
    @Given("^que estou na pagina inicial$")
    public void paginaInicial() throws InterruptedException {
    	InitialPage initialPage = new InitialPage();
		Assert.assertEquals("Pesquise o que quiser", initialPage.verificaInicial());
		}

    @When("^tocar no botao vendas$")
    public void tocarBotaoVendas() throws InterruptedException {
    	InitialPage clicavendas = new InitialPage();
    	clicavendas.clicaVendasInicial();
    }

    @Then("^posso verificar a pagina de vendas$")
    public void verificarTituloVendas() throws InterruptedException {
    	InitialPage verificatitulo = new InitialPage();
		Assert.assertEquals("Vendas", verificatitulo.capturaTituloPagina());
		driver.resetApp();
    }
    
    @When("^tocar no botao ofertas$")
    public void tocarBotaoOfertas() throws Exception {
    	InitialPage clicaofertas = new InitialPage();
    	clicaofertas.clicaOfertasInicial();
    	LerDocumentos lerdoc = new LerDocumentos();
    	System.out.println(lerdoc.lerdoctxt());
    	LerDocumentos lerallcsv = new LerDocumentos();
    	System.out.println(lerallcsv.leralldoccsv());
    }

    @Then("^posso verificar a pagina de ofertas$")
    public void verificarTituloOfertas() throws InterruptedException {
    	InitialPage tituloofertas = new InitialPage();
		Assert.assertEquals("Ofertas", tituloofertas.capturaTituloPagina());
    }

}
