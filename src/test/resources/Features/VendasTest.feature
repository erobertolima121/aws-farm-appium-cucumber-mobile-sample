Feature: Acessar e validar a tela de vendas
    O objetivo desta feature e validar as opcoes presentes na tela de vendas do app
    
    Background:
    		#Dado
        Given realizo o toque no botao vendas   

    Scenario: Acesso a tela de vendas
    		#Quando
        When tocar no botao para colocar um item para venda
        #Entao
        Then posso verificar a mensagem para login