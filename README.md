# DatePlan Web 💻

Landing page oficial do [DatePlan](https://play.google.com/store/apps/details?id=mayckgomes.com.dateplan), app para casais planejarem, viverem e reviverem seus momentos juntos.

---

## Por que este projeto foi criado?

O DatePlan nasceu como um app Android para casais e, com o crescimento do projeto, surgiu a necessidade de uma presença na web — um endereço público onde qualquer pessoa pudesse descobrir o app, entender o que ele faz e ser direcionada para o Google Play.

A primeira versão do site foi construída com **Kotlin Multiplatform (KMP) + Compose Multiplatform (CMP) compilado para WASM**. A escolha fazia sentido técnico no contexto do ecossistema KMP, mas trouxe um problema prático inaceitável para uma landing page: **um loading inicial obrigatório** enquanto o runtime WASM era baixado e inicializado pelo navegador, mesmo o conteúdo sendo completamente estático.

Para uma landing page cujo único objetivo é converter visitantes em usuários do app, esse loading significa:

- Primeira impressão ruim — o visitante vê um spinner antes de qualquer conteúdo
- SEO comprometido — crawlers do Google e leitores de IA (ChatGPT, Perplexity, Gemini) não executam WASM
- Bundle de MBs para um conteúdo que caberia em KBs
- Complexidade desnecessária de build e deploy para algo que não precisa compartilhar lógica com o app

A decisão foi **migrar para HTML + CSS + JS puro**, eliminando o loading completamente, com deploy direto no Netlify sem nenhuma etapa de build.

---

## ⚠️ Este projeto foi desenvolvido com auxílio de Inteligência Artificial.

Entenda a abordagem e o processo de desenvolvimento: [link para o postPost](https://linkedin.com/in/mayckgomes)
---

## Objetivos do projeto

- **Zero loading** — o site renderiza instantaneamente, sem runtime, sem bundle pesado
- **SEO e AEO** — indexável por Google e legível por modelos de IA via JSON-LD estruturado
- **Internacionalização PT/EN** — detecção automática pelo idioma do navegador, preferência salva no `localStorage`
- **Fácil manutenção** — features, vantagens e FAQ editáveis em um único arquivo (`content.js`), sem tocar em HTML ou CSS
- **Identidade visual fiel ao app** — fonte Alexandria, vermelho `#FF0000`, fundo escuro no hero, tipografia e espaçamento alinhados com o design do DatePlan

---

## Estrutura do projeto

```
dateplan-web/
│
├── index.html          # Estrutura da página (não editar para conteúdo)
├── styles.css          # Todo o CSS (tokens, layout, componentes, responsivo)
│
├── content.js          # CONTEÚDO EDITÁVEL — features, vantagens e FAQ
├── i18n.js             # Traduções PT/EN e lógica de troca de idioma
├── main.js             # Inicialização: starfield, FAQ accordion, scroll reveal
│
├── app-screenshot.png  # Screenshot do app exibida no mockup de celular
├── favicon.ico         # Ícone do site
├── apple-touch-icon.png# Ícone para iOS
├── banner.png          # Imagem 1200×630 para Open Graph / WhatsApp
│
├── privacy-policy.html # Política de Privacidade
└── terms-of-use.html   # Termos de Uso
```

---

## Como editar o conteúdo

Todo o conteúdo dinâmico da página fica em **`content.js`**. Não é necessário tocar em HTML ou CSS para adicionar, editar ou remover itens.

### Adicionar uma feature

```js
// Em siteContent.features.pt (e o equivalente em .en):
{
  icon: "🗓️",
  title: "Novo título da feature",
  desc: "Descrição da feature."
},
```

### Remover uma feature

Apague o objeto inteiro — do `{` até o `},` — no array correspondente. Faça o mesmo no array do outro idioma para manter a paridade.

### Adicionar uma pergunta no FAQ

```js
// Em siteContent.faq.pt (e o equivalente em .en):
{
  q: "Pergunta aqui?",
  a: "Resposta aqui."
},
```

### Card de vantagem em destaque (fundo escuro)

Defina `highlight: true` no objeto para que o card use o estilo escuro:

```js
{
  icon: "🔥",
  title: "Destaque",
  desc: "Este card terá fundo escuro.",
  highlight: true
}
```

---

## Internacionalização

O arquivo `i18n.js` contém as traduções dos textos fixos da página (títulos de seção, botões, footer). O conteúdo dinâmico (features, vantagens, FAQ) é traduzido diretamente no `content.js` via arrays separados por idioma (`pt` e `en`).

**Lógica de detecção:**

1. Verifica se há uma preferência salva no `localStorage`
2. Se não houver, detecta o idioma do navegador (`navigator.language`)
3. Navegadores em português → PT-BR; demais → EN
4. A preferência é salva ao clicar nos botões PT / EN no header

---

## SEO e leitura por IA

O `<head>` do `index.html` contém três blocos de **JSON-LD (Schema.org)**:

| Tipo | Finalidade |
|---|---|
| `SoftwareApplication` | Descreve o app para o Google (categoria, SO, features, preço) |
| `FAQPage` | Faz as perguntas do FAQ aparecerem como rich snippets no Google e serem citadas por IAs |
| `Organization` | Vincula o site à Play Store como fonte oficial |

O HTML base está em **PT-BR** (idioma primário do público-alvo), garantindo que crawlers e modelos de IA que não executam JS leiam o conteúdo correto. A troca para EN acontece via JS após o carregamento.

---

## Deploy (Netlify)

O site não tem etapa de build — é HTML estático puro.

**Deploy manual (arrastar e soltar):**
1. Acesse [app.netlify.com](https://app.netlify.com)
2. Arraste a pasta `dateplan-landing/` para a área de deploy
3. Pronto

**Via Git (recomendado):**
1. Suba a pasta para um repositório GitHub
2. Conecte o repositório no Netlify
3. Build command: *(deixar vazio)*
4. Publish directory: `.` (raiz do repositório)

**Arquivos que ainda precisam ser criados e adicionados à pasta:**

| Arquivo | Dimensões | Uso |
|---|---|---|
| `favicon.ico` | 32×32 | Ícone na aba do navegador |
| `apple-touch-icon.png` | 180×180 | Ícone em iPhones (salvar na tela inicial) |
| `banner.png` | 1200×630 | Preview no WhatsApp, Twitter e LinkedIn |

---

## Tecnologias

| | |
|---|---|
| HTML5 | Estrutura semântica |
| CSS3 | Layout (Grid, Flexbox), animações, variáveis CSS |
| JavaScript (ES6+) | i18n, renderização dinâmica, interações |
| Google Fonts | Fonte Alexandria |
| Netlify | Hospedagem |
| Schema.org JSON-LD | SEO estruturado e leitura por IA |

---

## Relacionado

- **App Android:** [Google Play](https://play.google.com/store/apps/details?id=mayckgomes.com.dateplan)
- **Backend API:** `dateplan-api-v2` (Spring Boot + PostgreSQL, hospedado em OCI ARM)
