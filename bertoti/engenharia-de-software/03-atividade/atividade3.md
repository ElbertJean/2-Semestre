## Atividade 3
<p><b>Arquitetura, slides 24 - 29: </b>Explicar sobre cada arquitetura</p>
<hr/>
<p><b>Arquitetura de camadas: </b>Uma arquitetura de camadas é um modelo de organização de sistemas de software em diferentes níveis de abstração, com cada camada sendo responsável por um conjunto específico de funcionalidades. Geralmente utilizado para sistemas que não precisam ser escalados, simples e não precisa de uma máquina potente para funcionamento.</p>
<p><b>Um ponto forte: </b>Simplicidade, fácil de criar e para realizar manutenção no sistema, não necessita de desenvolvedores experientes para realizar as manutenções.</p>
<p><b>Um ponto fraco: </b>Tolerança a falha, pois se acontecer alguma falha no sistema, pode ocorrer falhas em cascata, fazendo todo o sistema quebrar.</p><br/>

<hr/>
<p><b>Arquitetura Pipeline: </b>Arquitetura de processamento de dados que organiza e executa uma série de etapas em sequência, onde a saída de uma etapa se torna a entrada da próxima</p>
<p>Anotações sobre a explicação do professor: É processar coisas sequencialmente. Utilizado bastante em aplicações de ciência de dados. Ex: Uma grande fonte de dados que precisa deixar os dados anônimos na plataforma (dados sensiveis), extrair o dado, transformar o dado e carregar o dado, Ex: Proteger senhas, CPF, checkout. ETL</p>
<p><b>Um ponto forte: </b>Baixo custo, pois é fácil de realizar manutenção e também o projeto acaba sendo mais barato.</p>
<p><b>Um ponto fraco: </b>Tolerança a falhas, pois se um método quebrar, o sistema todo pode quebrar por conta de uma resposta de nível de acoplamento grande.</p><br/>

<hr/>
<p><b>Arquitetura MicroKernel: </b>É um tipo de kernel de sistema operacional que contém apenas as funcionalidades essenciais, com a maioria dos serviços sendo executados como processos de usuário. Isso torna o sistema mais modular e fácil de manter, mas pode afetar ligeiramente o desempenho devido à comunicação entre processos.</p>
<p><b>Anotações sobre a explicação do professor:</b> Arquitetura utilizada no sistema operacional, onde tem um sistema principal e diversos plugins do sistema. Ex plugins: Interface gráfica./p>
<p><b>Um ponto forte: </b>Custo Geral - A arquitetura MicroKernel permite a redução dos custos gerais de desenvolvimento e manutenção de sistemas, devido à sua modularidade e capacidade de reutilização de componentes.</p>
<p><b>Um ponto fraco: </b>Tolerância ao Erro - A tolerância ao erro pode ser comprometida, pois a comunicação entre os diferentes componentes do sistema através de processos de usuário pode aumentar a complexidade e introduzir pontos potenciais de falha.</p><br/>

<hr/>
<p><b>Arquitetura Service-Based: </b></p>
<p><b>Anotações da explicação do professor:</b> Utilizado para software de serviços. Seria um update da arquitetura de camadas.<br/>
Estilo arquitetônico de software onde as funcionalidades do sistema são implementadas como serviços independentes e interoperáveis. Cada serviço é uma unidade de software autônoma que realiza uma função específica e se comunica com outros serviços por meio de interfaces bem definidas. Esta abordagem facilita a construção de sistemas modulares e escaláveis, onde novos serviços podem ser adicionados ou atualizados sem afetar o sistema como um todo.</p>
<p><b>Um ponto forte: </b>Testabilidade - Como os serviços são independentes, é mais fácil testar cada um deles separadamente, garantindo a qualidade do software como um todo. Isso facilita a identificação e correção de erros em um ambiente de desenvolvimento e teste.</p>
<p><b>Um ponto fraco: </b>Elasticidade - Com a arquitetura service-based, podemos adicionar mais partes conforme necessário. Porém, à medida que o sistema cresce, coordenar essas partes pode ficar mais complexo, afetando a capacidade de resposta em momentos de grande demanda.</p><br/>

<hr/>
<p><b>Arquitetura Event-Driven (Orientado por eventos): </b>É um estilo arquitetônico em que o fluxo de dados e controle é determinado pela ocorrência de eventos e pela reação a esses eventos. Neste modelo, os componentes do sistema se comunicam através da emissão e captura de eventos, permitindo uma comunicação assíncrona e desacoplada entre eles.</p>
<p><b>Anotações da explicação do professor: Exemplo do pix: </b>m exemplo de arquitetura Event-Driven é a notificação de pagamento. Quando um usuário realiza um pagamento, um evento de pagamento é gerado e propagado através do sistema. Diferentes componentes, como o banco do pagador e do recebedor, podem reagir a esse evento, atualizando seus respectivos registros e notificando os usuários envolvidos.</p>
<p><b>Um ponto forte: </b>Escalabilidade - altamente escalável, pois permite que os componentes do sistema sejam adicionados ou removidos facilmente, respondendo dinamicamente ao aumento ou diminuição da carga de eventos.</p>
<p><b>Um ponto fraco: </b>Simplicidade - A complexidade pode aumentar devido à natureza assíncrona e desacoplada da comunicação entre os componentes. Isso pode tornar a compreensão e manutenção do sistema mais difícil, necessitando assim de desenvolvedores mais experientes para a realização da manutenção ou melhorias no projeto.</p><br/>

<hr/>
<p><b>Arquitetura Microservices: </b>É um modelo de desenvolvimento de software onde uma aplicação é dividida em pequenos serviços independentes, cada um responsável por uma função específica. Esses serviços se comunicam entre si através de protocolos leves, como HTTP, e podem ser desenvolvidos, implantados e escalados de forma independente. Isso proporciona maior flexibilidade, agilidade e facilita a manutenção contínua da aplicação. No entanto, a gestão da comunicação entre os serviços e o monitoramento são desafios importantes.</p>
<p><b>Um ponto forte: </b> Escalabilidade, pois para inserir um novo microserviço, ele não necessita dos outros microserviços existestes para ser atrelado, sendo assim, ficando mais fácil para fazer a implementação sem causar conflitos com os demais existentes.</p>
<p><b>Um ponto fraco: </b>Alto custo, pois para realizar a manutenção dos microserviços, necessita de desenvolvedores mais experientes.</p>

<p><b></b></p>

