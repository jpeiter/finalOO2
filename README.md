# Trabalho Final da Disciplina de Programação Orientada a Objetos II

Data final de entrega: 05/12/2018.

## **Descrição do Problema:**

João das Neves, o proprietário de uma loja para venda de artesanato
localizada ao norte, teve um aumento considerável em suas vendas, devido à
aproximação do inverno e o número crescente de turistas na sua região.
Portando, sua empresa necessita de um sistema para controlar as vendas de
produtos de sua loja. Lembrando que, o sr. Neves é um herdeiro muito rico e
paga bem pelo desenvolvimento do sistema. O valor pago por cada
funcionalidade desenvolvida encontra-se no final desse documento.
A principal funcionalidade solicitada pelo sr. Neves é o controle de vendas e recebimentos. Além disso, foi solicitado o controle das despesas da empresa.

### **O sistema deverá funcionar da seguinte maneira**:

- **Usuários:** 
	- Somente usuários autenticados podem acessar o sistema. Criar um CRUD de usuários. O proprietário da empresa preza por segurança, portanto a senha do usuário deve ser salva criptografada ao ser armazenada no banco de dados (não vale MD5 =) ).  
- **Sistema:**
  - Após autenticar será exibida a tela principal com acesso aos menus.
  - Todos os CRUDs básicos devem ter as funções de Listar, Cadastrar, Editar e Remover.
- **Tela de Vendas:**
  - O usuário deverá selecionar o cliente, a forma de pagamento (Crédito, Débito, Dinheiro, etc).
  - O usuário deverá selecionar os produtos comprados pelo cliente e adicionar em uma lista (deverá ser possível alterar a quantidade e remover itens antes de finalizar a venda).
  - O usuário poderá filtrar os produtos por categoria para facilitar a busca.
  - Ao clicar em Finalizar venda, deverá ser salva a venda e os produtos vendidos ao cliente. Automaticamente será criada uma conta a receber no valor total da venda e o sistema deverá exibir o recibo da venda (relatório).
  - Juntamente com a venda deve ser armazenado o usuário que realizou a mesma, pois ele irá receber uma comissão ao final de cada mês.
- **Contas a Receber** (A conta a receber é necessária pois futuramente será possível parcelar as vendas):
  - Criar apenas listagem e uma tela para visualizar individualmente uma conta. Não é necessário Editar ou Remover uma Conta a Receber.
  - Na tela de listagem trazer apenas as contas do dia.
  - Permitir filtrar as contas de apenas um cliente.
  - Relatório de comissão dos usuários (filtrar por período de data).
- **Contas a Pagar:**
	- Criar um CRUD para contas a pagar.
	- Trazer na tela de listagem apenas as contas não pagas e vencidas até a data atual (na tela de listagem colocar dois campos para o usuário filtrar por intervalo de data e se está paga).

### O sr. Neves também solicitou alguns relatórios e gráficos para o sistema:

- **Relatórios:** 
	- Relatório de Contas a Receber (permitir filtrar por datas).
	- Relatório de Vendas (contendo cabeçalho, itens vendidos e valor total, permitir filtrar por datas).
	- Relatório de 2ª via do Recibo da Venda.
- **Gráficos:**
	- Produtos mais vendidos de cada mês (barra).
	- Vendedores e valores de comissão (filtro de datas) (Pizza).
	- Valores recebidos em cada tipo de recebimento, agrupado por mês (permitir filtro de datas, Barra).
	- Valores pagos em cada tipo de recebimento, agrupado por mês.
	- Entradas x Saídas por data (permitir filtro de datas, gráfico de linhas).


 A modelagem do banco é de responsabilidade do desenvolvedor do sistema. Abaixo serão listados alguns exemplos de entidades e campos, entretanto o desenvolvedor deverá normalizar.

**Usuário:** {nome, cpf, salário, comissão, foto, email, senha}
**Cliente:** {nome, cpf, CIDADE, CONTATOS, endereço, cep}
**Categoria:** {descrição}
**Produto:** {nome, valor, descrição, CATEGORIA}
**Venda:** {número do pedido, data, CLIENTE, USUARIO}
**Venda Produto:** {PRODUTO, VENDA, quantidade, valor}
**Conta Receber:** {VENDA, data, valor, número_recibo, TIPO_RECEBIMENTO}
**Fornecedor:** {nome, cnpj, CIDADE, telefone, endereço}
**Conta Pagar:** {FORNECEDOR, data_vencimento, data_pagamento, valor, valor pago, TIPO_PAGAMENTO, USUARIO}

## Avaliação*:

| Descrição da Funcionalidade                                             | Valor     |
|-------------------------------------------------------------------------|-----------|
| CRUDs Simples                                                           | 1.500,00  |
| Venda                                                                   |  2.000,00 |
| Conta receber                                                           | 500,00    |
| Conta Pagar                                                             | 1.000,00  |
| Criptografia da senha do usuário                                        | 500,00    |
| Relatórios                                                              | 1.750,00  |
| Gráficos                                                                | 1.750,00  |
| Organização do Código, Aparência das Telas**, Models, DAOs, Controllers | 1.000,00  |
| ***TOTAL***                                                             | ***10.000,00*** |

#### *Obs.: O valor de cada um dos itens está ligado à apresentação oral das funcionalidades do sistema. Na qual o aluno deverá defender o código desenvolvido em cada módulo do trabalho. 
#### **Obs. 2: Não esqueçam, vocês cursaram IHC, então cuidar questões de usabilidade, marcar campos obrigatórios, etc.

## ***Nova funcionalidade: 
- O sistema deverá contar com controle de autorização para diferentes perfis de usuários.
- Usuários administradores (ADMIN) terão controle total do sistema.
- Usuários vendedores (VENDEDOR) poderão apenas realizar vendas, não sendo permitido o acesso ao cadastro de categorias, produtos, usuários, etc.
- Usuários do financeiro (FINANCEIRO) podem visualizar contas a receber, ter acesso ao CRUD de contas a pagar e visualizar as vedas (não podem editar, alterar ou remover uma venda)
