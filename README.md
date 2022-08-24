# api-contabancaria-factory


## Desenvolvendo uma API REST, uma aplicação que possui endpoints de listagem, cadastro, atualização e deleção de contas bancárias. Uma API e uma factory, pois o usuário pode fazer depósitos e saques.

### Funcionalidades:
1- Exibi de todas as contas;
2- Exibi de uma conta específica;
3- Cadastra de uma nova conta;
4- Deleta conta;
5- Atualiza o valor atual caso tenha um depósito;
6- Atualizao valor atual caso tenha um saque;

### Especificações:
1- A conta bancária possui:
id;
numero de conta;
agencia;
nome do usuario;
valor atual da conta;
valor final;
valor fornecido para saque ou deposito (valor a ser acrescido ou subtraído no valor final);
tipo de serviço (saque ou depósito);
2- A aplicação contém 1 tratamento de exceção, utilizando o Exception Handler
3- A aplicação contém o Factory Patterns.

