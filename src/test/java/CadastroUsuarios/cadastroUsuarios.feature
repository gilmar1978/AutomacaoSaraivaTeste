#language: pt


Funcionalidade: Cadastro de usuários 
 Eu como usuario final
 Quero realizar o cadastro de novos usuários
 Para que seja possivel adquirir produtos Saraiva
  
  
Esquema do Cenário: Cadastro

Dado que eu estou acessando o portal
Quando clico no link cadastre se 
E clico no botão Entrar ou cadastre se  
E clico no botão cadastrar 
E preencho o campo nome  "<nome>"
E preencho o campo sobrenome "<SobreNome>"
E preencho o campo email "<Email>"
E preencho o campo senha "<Senha>"
E preencho o campo confirme a senha "<ConfirmaSenha>"
E preencho o campo CPF "CPF"
E seleciono Sexo 
E preencho o campo data de nascimento "<DataNascimento>"
E preencho o campo telefone "<Telefone>"
E seleciono país
E preencho o campo CEP "<CEP>"
E preencho o campo numero "<Numero>"
E preencho o campo telefone para contato "<TelefoneContato>"
E escolho em receber ou não email com promoções
E clico no botao finalizar cadastro Finalizar cadastro
Então valido cadastro realziado com sucesso


Exemplos: 
   |Nome	   |SobreNome |Email       |Senha   |ConfirmaSenha|CPF        |DataNascimento|Telefone   |CEP			|Numero|TelefoneContato|			
   |Evair    |Aparecido |abc@abc.com |12345678| 12345678    |83569863034| 25051995     |11963254521|05001000|  55  | 11996587458   |             |












































#Feature: 
  #Eu como usuario final
  #Quero realizar o cadastro de novos usuários
  #Para que seja possivel armazenar e gerenciar seus dados
#
  #Scenario Outline: Cadastro de usuario
    #Given que eu estou acessando o portal
  #	When preencho o nome "<nome>"
    #And preencho o email "<email>"
    #And preencho a senha "<senha>"
    #And clico em cadastrar 
     #
   #
    #Examples: 
      #|nome	 |email 										 | senha    |
      #|		   |gilmar@hotmail.com			   | Teste123 |