document.addEventListener("DOMContentLoaded", function () {
  const ratingContainer = document.getElementById("rating-container");
  const ratingValue = document.getElementById("rating-value");
  const submitBtn = document.getElementById("submit-btn");

  // Adiciona 5 estrelas ao rating-container
  for (let i = 1; i <= 5; i++) {
    const star = document.createElement("span");
    star.innerHTML = "&#9733;";
    star.setAttribute("data-value", i);
    star.addEventListener("click", handleStarClick);
    ratingContainer.appendChild(star);
  }

  // Função para lidar com o clique em uma estrela
  function handleStarClick(event) {
    const clickedValue = parseInt(event.target.getAttribute("data-value"));
    updateRating(clickedValue);
  }

  // Função para atualizar a exibição da avaliação
  function updateRating(value) {
    const stars = ratingContainer.querySelectorAll("span");
    stars.forEach((star, index) => {
      if (index < value) {
        star.classList.add("active");
      } else {
        star.classList.remove("active");
      }
    });
    ratingValue.innerText = value;
  }

  // submit avaliacao...
  submitBtn.addEventListener("click", function () {
    const currentRating = parseInt(ratingValue.innerText);
    alert(`Avaliação enviada: ${currentRating}`);
  });
});
