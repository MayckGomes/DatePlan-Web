const translations = {
  en: {
    // Hero
    "hero.cta":       "Get Started on Google Play",
    "hero.learn":     "Learn More",
    "hero.headline":  "We don't plan dates.<br>We build <em>memories.</em>",
    "hero.sub":       "Plan, live, and relive the moments that make your relationship special — all in one place.",

    // Features
    "features.title":   "Everything your relationship deserves.",

    // Advantages
    "adv.title":    "Focused on your relationship,<br>not just features.",

    // FAQ
    "faq.title":  "Frequently asked<br>questions.",

    // Footer
    "footer.copy": "© 2025 DatePlan · Planning moments together 💕 · Made with ❤️",
    "footer.download": "Download",
    "footer.features": "Features",
    "footer.faq":      "FAQ",
    "footer.privacy":  "Privacy Policy",
    "footer.terms":    "Terms of Use",
  },

  pt: {
    // Hero
    "hero.cta":       "Baixar no Google Play",
    "hero.learn":     "Saiba Mais",
    "hero.headline":  "Não planejamos encontros.<br>Construímos <em>memórias.</em>",
    "hero.sub":       "Planeje, viva e reviva os momentos que tornam seu relacionamento especial — tudo em um só lugar.",

    // Features
    "features.title":   "Tudo que o seu relacionamento merece.",

    // Advantages
    "adv.title":    "Focado no seu relacionamento,<br>não apenas em recursos.",

    // FAQ
    "faq.title":  "Perguntas<br>frequentes.",

    // Footer
    "footer.copy": "© 2025 DatePlan · Planejando momentos juntos 💕 · Feito com ❤️",
    "footer.download": "Baixar",
    "footer.features": "Recursos",
    "footer.faq":      "FAQ",
    "footer.privacy":  "Política de Privacidade",
    "footer.terms":    "Termos de Uso",
  }
};

const pageMeta = {
  pt: {
    title: "DatePlan - App para Casais | Planeje Momentos Especiais a Dois",
    description: "DatePlan é o app para casais organizarem compromissos, datas especiais e memórias juntos. Calendário compartilhado, lembretes automáticos e privacidade total. Grátis no Google Play."
  },
  en: {
    title: "DatePlan - Couples App | Plan Special Moments Together",
    description: "DatePlan is the app for couples to organize commitments, special dates, and memories together. Shared calendar, automatic reminders, and full privacy. Free on Google Play."
  }
};

function setLanguage(lang) {
  document.querySelectorAll('[data-i18n]').forEach(el => {
    const key = el.getAttribute('data-i18n');
    if (translations[lang]?.[key]) {
      el.innerHTML = translations[lang][key];
    }
  });

  // Re-render dynamic sections (features, advantages, FAQ) in the new language
  if (typeof renderDynamicContent === 'function') {
    renderDynamicContent(lang);
  }

  // Update active state on lang buttons
  document.querySelectorAll('.lang-btn').forEach(btn => {
    btn.classList.toggle('active', btn.getAttribute('data-lang') === lang);
  });

  // Update title and meta description for SEO consistency
  if (pageMeta[lang]) {
    document.title = pageMeta[lang].title;
    const metaDesc = document.querySelector('meta[name="description"]');
    if (metaDesc) metaDesc.setAttribute('content', pageMeta[lang].description);
  }

  localStorage.setItem('lang', lang);
  document.documentElement.setAttribute('lang', lang === 'pt' ? 'pt-BR' : 'en');
}

function initLanguage() {
  const saved   = localStorage.getItem('lang');
  const browser = navigator.language.startsWith('pt') ? 'pt' : 'en';
  setLanguage(saved || browser);
}
