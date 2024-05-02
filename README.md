# Lab


Laboratório de Estudo


Registra Usuário e senha, cria uma conta com os 2 dados, usuário tem opções como:
depositar, sacar e ver informações da conta, fechar conta.
		
Ao Depositar, é executado uma função assincrona que adiciona parte do valor depositado 
de 10 em 10 minutos ao saldo da conta.
		
Ao Sacar, é informado a mesma função assincrona que o saldo mudou, fazendo imediatamente ela parar de executar,
porém imediatamente ela volta a ser executada com o novo valor do saldo da conta.
		
O moneyRenderer gira em torno do saldo atual da conta, toda vez que ocorrer mudanças o processo irá parar
e recomeçar com o novo saldo.

O processo do moneyRenderer é assincrono, então o programa tem que continuar rodando, possibilitando o usuário a realizar ações.