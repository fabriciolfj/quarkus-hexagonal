# Arquitetura hexagonal

## Domain
- Camada onde sua uníca preocupação e resolver problemas do dominío de negócio
- Não pode envolver frameworks nessa camada.
- Todas as outras camadas dependem dessa, ou seja, essa é o centro da aplicação


### Uso do DDD para construção do domínio

#### Entidade
- Possui uma identidade
- Representa um problema do mundo real
- Deve-se ser construida com apoio de especialistas do domínio de negócio
- São mutáveis

#### Value objects (VO)
- São imutários
- Auxiliam na representatividade da entidade
- Quanto mais rica forem, mas claro será a representação do problema de negócio que querem resolver. Exemplo:
  - Em vez de representar o endereço como uma String, crie uma objeto Endereco com os respectivos atributos 

#### aggregate
- Em algumas situações, o dominio faz sentido quando este é composto por um conjunto de entidades
- Esse conjunto chamamos de agregado e a classe que acumula as entidades é chamada de agregado raiz
- Nessa situação quando formos salvar tal agregado, faz sentido salvar como um todo (existem recursos como hibernate, usando cascate, transaction spring data e etc)
- A alteração de um agragado, faz pelo acesso da classe raiz ou agregado raiz. Exemplo:
  - Tenho a entidade Pessoa, Documento e Endereço
  - O agregado raiz e Pessoa, 
  - Caso queira que alterar algum Documento, tenho que carregar pessoa com seus agregados e posteriormente modificar a entidade Documento.

#### Serviço de dominio
- Executam tarefas restritas ao dominio, ou seja, classes que executam operações que não está vinculada a uma regra na entidade mas essa está envolvida.
  - Exemplo: Na classe Pessoa não faz sentido receber uma lista de pessoas e efetuar um filtro, pode delegar a uma classe de serviço do dominio.
- Classe de serviço de domínio chamam apenas entidades ou orquestram chamadas a entidades 

### Regras de negócio
- Depois de mapeadas as nossas entidades e os serviços que operam os dados, entram em jogo a implementação das regras de negócio ou domínio.
- Podemos classificar as regras de negócio como políticas ou especificações, conforme detalhado abaixo.

#### Policy (políticas)
- Realiza alguma ação ou procedimento sobre o dado. Por exemplo: o documento da pessoa precisa ser transformado em um formato ou validar a entrada de algum dado.

#### Especificações
- São condições para garantir um objeto válido

### Caso de uso e ports

#### Caso de uso
- técnica para definir metas ou meios de comportamentos para cumpri-las em um software.
- fazem pontos entre aplicação e o dominío
- são abstrações onde a portas de entrada os implementarão

#### Porta de entrada (input ports)
- atores condutores são que enviam solicitações ao aplicativo, enquanto atores orientados representam os componentes externos acessados pelo aplicativo.
- a portas de entradas, permitem o fluxo de comunicação entre esses atores e o dominio.
- são implementações do caso de uso
- Não detem nenhuma regra do dominio, apenas orquestra as chamadas do mesmo e portas de saída.

#### Porta de saida (output ports)
- representa a intenção do aplicativo de lidar com dados externos.
- são atores e operações orientadas
- são interfaces e quem as implementação são os adapters de saída

### Adapters input (adaptadores de entrada)
- São como protocolo de comunicação remota
- realiza operações de condução
- quem usa ou chama esse adapters, são conhecidos como atores primários
- caso aja necessidade de-se criar uma camada anticorrupção (design novo não ser influenciado pelo design legado), colocamos dentro dos adapters
