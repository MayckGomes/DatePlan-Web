// ── Starfield
(function () {
  const container = document.getElementById('stars');
  for (let i = 0; i < 120; i++) {
    const s = document.createElement('span');
    const size = Math.random() * 2.5 + 0.5;
    s.style.cssText = `
      width:${size}px; height:${size}px;
      top:${Math.random() * 100}%; left:${Math.random() * 100}%;
      --d:${(Math.random() * 4 + 2).toFixed(1)}s;
      --delay:-${(Math.random() * 6).toFixed(1)}s;
      --op:${(Math.random() * 0.6 + 0.2).toFixed(2)};
    `;
    container.appendChild(s);
  }
})();

// ── FAQ accordion
function toggleFaq(btn) {
  const item = btn.closest('.faq-item');
  const isOpen = item.classList.contains('open');
  document.querySelectorAll('.faq-item.open').forEach(el => el.classList.remove('open'));
  if (!isOpen) item.classList.add('open');
}

// ── Init language + dynamic content (features, advantages, FAQ)
// renderDynamicContent() is called inside setLanguage(), called by initLanguage()
initLanguage();

// ── Scroll reveal (applied after dynamic content exists in the DOM)
const observer = new IntersectionObserver((entries) => {
  entries.forEach(e => {
    if (e.isIntersecting) {
      e.target.classList.add('visible');
      observer.unobserve(e.target);
    }
  });
}, { threshold: 0.12 });

document.querySelectorAll('.reveal').forEach(el => observer.observe(el));
