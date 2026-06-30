/* ════════════════════════════════════════════════════════════
   CONTEÚDO EDITÁVEL — Features, Vantagens e FAQ
   ────────────────────────────────────────────────────────────
   Para ADICIONAR um item: copie um objeto existente do array,
   cole no final (antes do "]") e troque os textos.

   Para REMOVER um item: apague o objeto inteiro (de "{" até "},").

   Para ALTERAR um item: edite apenas o texto entre aspas.

   IMPORTANTE: sempre edite os dois idiomas (pt e en) juntos,
   mantendo a mesma ordem dos itens nos dois arrays.
   ════════════════════════════════════════════════════════════ */

const siteContent = {

  // ── FEATURES (seção com o mockup do app) ──────────────────
  // icon: emoji exibido antes do título
  features: {
    pt: [
      {
        icon: "📅",
        title: "Planeje os momentos futuros",
        desc: "Organize encontros, viagens, aniversários e eventos importantes no calendário compartilhado do casal."
      },
      {
        icon: "🔔",
        title: "Viva os momentos agora",
        desc: "Receba lembretes automáticos e notificações para que nenhuma data especial passe despercebida."
      },
      {
        icon: "📸",
        title: "Reviva os momentos passados",
        desc: "Registre memórias e detalhes dos melhores capítulos do seu relacionamento."
      },
      {
        icon: "💑",
        title: "Feito para dois",
        desc: "O DatePlan é desenvolvido exclusivamente para casais — um espaço privado e compartilhado onde os seus momentos pertencem apenas a vocês dois."
      }
    ],
    en: [
      {
        icon: "📅",
        title: "Plan the moments ahead",
        desc: "Organize dates, trips, anniversaries, and important events in your shared couple calendar."
      },
      {
        icon: "🔔",
        title: "Live the moments now",
        desc: "Get automatic reminders and notifications so no special date goes unnoticed."
      },
      {
        icon: "📸",
        title: "Relive the moments past",
        desc: "Record memories and details from the best chapters of your relationship."
      },
      {
        icon: "💑",
        title: "Built for two",
        desc: "DatePlan is designed exclusively for couples — a private, shared space where your moments belong only to you two."
      }
    ]
  },

  // ── VANTAGENS (seção "Focused on outcomes") ────────────────
  // highlight: true deixa o card em destaque (fundo escuro)
  advantages: {
    pt: [
      {
        icon: "📅",
        title: "Nunca perca uma data",
        desc: "Lembretes inteligentes e um calendário compartilhado garantem que cada aniversário, dia especial e momento planejado receba a atenção que merece.",
        highlight: true
      },
      {
        icon: "🔒",
        title: "Privacidade por design",
        desc: "Seu relacionamento é seu. O DatePlan mantém seus momentos, memórias e planos completamente privados — só entre vocês dois.",
        highlight: false
      },
      {
        icon: "✨",
        title: "Simples e intuitivo",
        desc: "Sem curva de aprendizado. O DatePlan sai do caminho para que você foque no que importa — passar tempo de qualidade juntos.",
        highlight: false
      },
      {
        icon: "💾",
        title: "A sua história, preservada",
        desc: "Construa uma linha do tempo do seu relacionamento. Do primeiro encontro a cada marco importante, a sua história vive em um lugar especial.",
        highlight: false
      }
    ],
    en: [
      {
        icon: "📅",
        title: "Never miss a date",
        desc: "Smart reminders and a shared calendar mean every anniversary, special day, and planned moment gets the attention it deserves.",
        highlight: true
      },
      {
        icon: "🔒",
        title: "Private by design",
        desc: "Your relationship is yours. DatePlan keeps your moments, memories, and plans completely private — just between the two of you.",
        highlight: false
      },
      {
        icon: "✨",
        title: "Simple and intuitive",
        desc: "No learning curve. DatePlan gets out of the way so you can focus on what matters — spending quality time together.",
        highlight: false
      },
      {
        icon: "💾",
        title: "Your story, preserved",
        desc: "Build a timeline of your relationship. From the first date to every milestone, your story lives in one beautiful place.",
        highlight: false
      }
    ]
  },

  // ── FAQ ─────────────────────────────────────────────────────
  faq: {
    pt: [
      {
        q: "Meu parceiro(a) precisa criar uma conta também?",
        a: "Sim — o DatePlan é feito para dois. Ambos criam uma conta e se conectam dentro do app para compartilhar o calendário, memórias e momentos juntos."
      },
      {
        q: "Meus dados são privados e seguros?",
        a: "Com certeza. Seus momentos, memórias e planos são privados apenas para o casal. Não compartilhamos seus dados com terceiros e levamos sua privacidade muito a sério."
      },
      {
        q: "O DatePlan está disponível no iOS?",
        a: "O DatePlan está disponível atualmente no Android via Google Play. Uma versão para iOS está a caminho — fique ligado!"
      },
      {
        q: "Posso usar o DatePlan em relacionamentos à distância?",
        a: "Sim! O DatePlan funciona perfeitamente para casais à distância. Planeje visitas futuras, celebre aniversários e mantenha o calendário compartilhado sincronizado — onde quer que estejam."
      },
      {
        q: "Como começar?",
        a: "Baixe o DatePlan no Google Play, crie sua conta e convide seu parceiro(a). Em minutos vocês já estarão planejando o primeiro momento juntos."
      }
    ],
    en: [
      {
        q: "Does my partner need to create an account too?",
        a: "Yes — DatePlan is built for two. Both partners create an account and connect with each other inside the app to share a calendar, memories, and moments together."
      },
      {
        q: "Is my data private and secure?",
        a: "Absolutely. Your moments, memories, and plans are private to your couple only. We don't share your data with third parties and take your privacy seriously."
      },
      {
        q: "Is DatePlan available on iOS?",
        a: "DatePlan is currently available on Android via Google Play. An iOS version is on the way — stay tuned!"
      },
      {
        q: "Can I use DatePlan in long-distance relationships?",
        a: "Yes! DatePlan works perfectly for long-distance couples. Plan future visits, celebrate anniversaries, and keep your shared calendar synced — no matter where you are."
      },
      {
        q: "How do I get started?",
        a: "Simply download DatePlan from Google Play, create your account, and invite your partner. You'll be planning your first moment together in minutes."
      }
    ]
  }
};


/* ════════════════════════════════════════════════════════════
   RENDERIZAÇÃO — não precisa mexer aqui
   ════════════════════════════════════════════════════════════ */

function renderFeatures(lang) {
  const items = siteContent.features[lang];
  const leftCol  = document.querySelector('.feat-left');
  const rightCol = document.querySelector('.feat-right');
  if (!leftCol || !rightCol) return;

  leftCol.innerHTML = '';
  rightCol.innerHTML = '';

  items.forEach((item, i) => {
    const card = document.createElement('div');
    card.className = 'feat-card reveal visible';
    card.innerHTML = `
      <h3>${item.icon} ${item.title}</h3>
      <p>${item.desc}</p>
    `;
    // Divide os itens: pares na esquerda, ímpares na direita
    (i % 2 === 0 ? leftCol : rightCol).appendChild(card);
  });
}

function renderAdvantages(lang) {
  const items = siteContent.advantages[lang];
  const grid = document.querySelector('.adv-grid');
  if (!grid) return;

  grid.innerHTML = '';

  items.forEach(item => {
    const card = document.createElement('div');
    card.className = 'adv-card reveal visible' + (item.highlight ? ' highlight' : '');
    card.innerHTML = `
      <div class="adv-visual">${item.icon}</div>
      <h3>${item.title}</h3>
      <p>${item.desc}</p>
    `;
    grid.appendChild(card);
  });
}

function renderFaq(lang) {
  const items = siteContent.faq[lang];
  const list = document.querySelector('.faq-list');
  if (!list) return;

  list.innerHTML = '';

  items.forEach(item => {
    const faqItem = document.createElement('div');
    faqItem.className = 'faq-item reveal visible';
    faqItem.innerHTML = `
      <button class="faq-q" onclick="toggleFaq(this)">
        <span>${item.q}</span>
        <span class="icon">+</span>
      </button>
      <div class="faq-a">${item.a}</div>
    `;
    list.appendChild(faqItem);
  });
}

function renderDynamicContent(lang) {
  renderFeatures(lang);
  renderAdvantages(lang);
  renderFaq(lang);
}
