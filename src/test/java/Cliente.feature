#language: pt
Funcionalidade: Adicionar e Remover Clientes

  Contexto:
    Dado que estou na homepage do grocerycrud
    Quando altero o valor da combo Select version para 'Bootstrap V4 Theme'
    E clico no botao Add Customer
    E digito o valor 'Teste Sicredi' no campo Name
    E digito o valor 'Teste' no campo Last name
    E digito o valor 'Matheus' no campo ContactFirstName
    E digito o valor '51 9999-9999' no campo Phone
    E digito o valor 'Av Assis Brasil, 3970' no campo AddressLine1
    E digito o valor 'Torre D' no campo AddressLine2
    E digito o valor 'Porto Alegre' no campo City
    E digito o valor 'RS' no campo State
    E digito o valor '91000-000' no campo PostalCode
    E digito o valor 'Brasil' no campo Country
    E clico na opção Fixter no combo chosen-select
    E digito o valor 200 no campo CreditLimit
    E clico no botão  Save
    E quando vejo a mensagem 'Your data has been successfully stored into the database. Edit Customer or Go back to list'
    E clico no link Go back to list
		
  Cenario: deletar customer da lista
    
    E clico na lupa
    E digito o conteudo do Name 'Teste Sicredi'
    E clico no checkbox abaixo de Actions
    E clico no botao Delete
    E apresenta a mensagem Are you sure that you want to delete this 1 item?
    E clico no proximo botao Delete 
    Entao deve apresentar 'Your data has been successfully deleted from the database.'
    
