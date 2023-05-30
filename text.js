
// Funzione chiamata quando il bottone "Reset" viene cliccato
function resetForm() {
    document.getElementById("myForm").reset(); // Resetta il form
  }
  
  // Ascoltatore di eventi per il caricamento della pagina
  document.addEventListener("DOMContentLoaded", function() {
    // Aggiungi l'ascoltatore di eventi per il bottone "Reset"
    var resetButton = document.querySelector("button[type='button']");
    resetButton.addEventListener("click", resetForm);
  });
  