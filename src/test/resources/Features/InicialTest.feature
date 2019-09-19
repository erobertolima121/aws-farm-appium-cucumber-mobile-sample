Feature: Acessar opcoes de menu da pagina inicial
    O objetivo desta feature e validar as opcoes presentes na pagina inicial do aplicativo
    
    Background:
    		#Dado
        Given que estou na pagina inicial  

    Scenario: Acesso a tela de vendas
    		#Quando
        When tocar no botao vendas
        #Entao
        Then posso verificar a pagina de vendas 

    Scenario: Acesso a tela de ofertas
        #Quando
        When tocar no botao ofertas
        #Entao
        Then posso verificar a pagina de ofertas