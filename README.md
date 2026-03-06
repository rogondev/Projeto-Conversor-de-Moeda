Conversor de Moedas - Challenge Java

Seja bem-vindo ao meu primeiro projeto de conversão de moedas! Este software foi desenvolvido como parte do desafio Oracle Next Education (ONE). O objetivo é criar uma ferramenta que consulta valores reais de mercado e faz o cálculo de conversão instantaneamente pelo terminal.

🎯 O Desafio
O objetivo principal era construir um programa que pudesse:

Ler dados de uma API de taxas de câmbio.

Transformar arquivos JSON em objetos Java.

Oferecer um menu interativo para o usuário.

Realizar cálculos matemáticos baseados na cotação atual.

🛠️ O que eu usei no projeto?
Para fazer o código funcionar, utilizei as seguintes ferramentas:

Java (JDK 17+): A linguagem principal.

Gson (Google): Uma biblioteca essencial para "traduzir" o que o site da API fala (JSON) para o que o Java entende (Objetos/Records).

HttpClient: O motor que faz a conexão entre o meu computador e a internet.

ExchangeRate-API: O serviço que fornece os valores das moedas em tempo real.

📂 Estrutura do Código
Para manter tudo organizado, dividi o projeto em três partes principais:

Main.java: É o coração do programa. Aqui fica o menu, o Scanner que lê o que você digita e a lógica que faz a conta final.

ConsultaMoeda.java: É o nosso "buscador". Ela vai até a internet, acessa a API e traz os dados brutos.

Moeda.java (Record): É o molde. Ele serve para guardar apenas as informações que nos interessam (como o nome da moeda e o valor da taxa).

🚀 Como testar na sua máquina
Se você quiser rodar este projeto, siga estes passos:

Clone o repositório:

Bash
git clone https://github.com/seu-usuario/conversor-de-moedas.git
Importe no IntelliJ: Abra a pasta do projeto no seu IntelliJ IDEA.

Adicione o Gson: Certifique-se de que o arquivo .jar do Gson está nas bibliotecas do projeto (File > Project Structure > Libraries).

Coloque sua Chave: No arquivo ConsultaMoeda.java, insira sua chave da API no endereço da URL.

Dê o Play! Execute a classe Main e divirta-se convertendo!

🧠 O que eu aprendi
Neste desafio, saí do básico de lógica de programação e aprendi a:

Trabalhar com bibliotecas externas (Gson).

Consumir dados reais da internet via HTTP.

Organizar meu código seguindo o princípio de responsabilidade única.

Tratar erros e exceções (para o programa não fechar se o Wi-Fi cair!).

🤝 Contato
Se tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato:

Meu LinkedIn: (https://www.linkedin.com/in/roogon/)

Meu E-mail: rogoonn@gmail.com
