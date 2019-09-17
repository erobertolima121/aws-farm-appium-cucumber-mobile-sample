Feature: Acessar opcoes de menu da pagina inicial
    O objetivo desta feature e validar as opcoes presentes na pagina inicial do aplicativo

    Background: Acesso a pagina inicial
    		#Dado
        Given que estou na pagina inicial 

    Scenario: Abertura de pagina inicial corretamente
    		#Quando
        When tocar no botao vendas
        #Entao
        Then posso verificar a pagina de vendas 


    #Scenario: Login succeeds
        #Given username is correct
        #Then log out