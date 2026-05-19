# Exercício — Aplicativo de Quiz com Múltiplas Activities

## Implemente um aplicativo Android que funcione como um pequeno quiz de preferências, utilizando múltiplas telas (Activities) e Intents explícitas.

O aplicativo deve conter 4 telas (Activities):
- Activity 1: Pergunta 1
- Activity 2: Pergunta 2
- Activity 3: Pergunta 3
- Activity 4: Tela de Resultado

### Cada uma das três primeiras Activities deve apresentar:
- Uma pergunta ao usuário;
- Opções de resposta (por exemplo: botões ou RadioButtons);
- Um botão "Próxima" para avançar para a próxima tela.

### As respostas fornecidas pelo usuário ao longo das três perguntas devem ser utilizadas para determinar qual é o super-herói favorito do usuário, dentre as seguintes opções (podem ser outros heróis):
- 🦇 Batman
- 🕷️ Homem-Aranha
- 🛡️ Capitão América

### A Activity de Resultado deve:
- Receber as respostas das telas anteriores;
- Processar essas respostas;
- Exibir o nome do super-herói correspondente ao perfil do usuário.
