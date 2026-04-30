document.addEventListener('DOMContentLoaded', function() {


  // ── MOBILE NAV ──
  document.querySelector('.nav-toggle').addEventListener('click', function() {
    document.querySelector('nav').classList.toggle('open');
  });

});

// progress bar
const bar = document.getElementById('progress-bar');
window.addEventListener('scroll', () => {
  const scrollTop = window.scrollY;
  const docHeight = document.documentElement.scrollHeight - window.innerHeight;
  const progress = (scrollTop / docHeight) * 100;
  bar.style.height = progress + '%';
});