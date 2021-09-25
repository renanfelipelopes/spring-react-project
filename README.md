### Aplicação com Java Spring boot no backend e React JS no frontend.

![dash](https://github.com/renanflow/spring-react-project/blob/master/frontend/src/assets/img/dash-vendas.gif)

Webpage application: https://renan-dashvendas.netlify.app/dashboard
Link do video onde explico um pouco de como foi feito: https://www.linkedin.com/feed/update/urn:li:activity:6796926908618571776/

💻 O backend foi dividido em três camadas, que são com controladores REST que conversam com a camada de Serviço, que conversa com a camada de Acesso a Dados <br>
🔁 A troca de informações entre o Front-end e o Back-end é feita através do protocolo HTTP usando o padrão REST com objetos no formato JSON. <br>
🚀 O Back-end disponibiliza uma API de Web Services, e esses Web Services são construídos de acordo com os príncipios do REST. <br><br>
- [x]  Entre a camada de Serviço e os Controladores REST, estão trafegando dados do tipo DTO (Data Transfer Objects) que é um objeto simples para trafegar os dados 
sem que esses objetos estejam atrelados a uma conexão a um banco de dados ou transação. <br>
- [x] O que significa que toda parte de banco de dados, transação, conexão, eu resolvo na camada de Serviço. <br>
- [x]  Os dados estão cadastrados aqui no banco de dados Postgres, e no Postman os objetos já com esses dados em formato JSON. <br>
- [x]  Depois que eu executar o que precisar na camada de Serviço que vão as regras de negócio, operações com o banco de dados, é feito uma cópia das entidades em 
outra pequena camada para os novos objetos que são os DTOs, gerando controladores mais simples. <br>
- [x]  E no Front-end fazemos as requisições desses dados configurados aqui no arquivo requests, e no componente dataTable, acessamos o componente BASE_URL com o 
diretório dos dados. <br>
- [x]  E assim tratamos a exibição desses dados de forma dinâmica, mostrada através dos gráficos, e dessa tabela com as informações do vendedor. <br>
- [x]  O Dashboard então mostra a taxa de sucesso dos negócios fechados que são as quantidades de clientes visitados divido pelos negócios fechados, e no gráfico do 
tipo "rosca" mostra em porcentagem a soma de todas as vendas. <br>
- [x]  E por último, temos a paginação. 
