📱 Projeto: Quiz de Personalidade - Qual é o seu Herói?
Objetivo: Desenvolver um aplicativo Android nativo utilizando múltiplas Activities e navegação via Intents Explícitas.

⚙️ Estrutura do Aplicativo
O app é composto por 4 telas principais (Activities):

Telas 1, 2 e 3 (O Quiz):

Exibem perguntas de múltipla escolha para mapear o perfil do usuário (utilizando componentes como RadioGroup e RadioButton).

Possuem um botão de ação para registrar a resposta e avançar para a próxima etapa.

Tela 4 (Resultado):

Recebe e processa os dados transmitidos pelas Activities anteriores via Intent.putExtra().

Calcula a pontuação final e exibe o super-herói que mais combina com o jogador.

🦸‍♂️ Resultados Possíveis
Com base nas decisões tomadas durante o quiz, o usuário descobrirá com qual destes heróis tem mais afinidade:

🔱 Aquaman

⚡ Flash

🏹 Arqueiro Verde

🛠️ Requisitos Técnicos
Uso de Intents Explícitas para a transição entre telas.

Passagem de parâmetros entre Activities para acúmulo de pontuação.
