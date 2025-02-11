let valodado = document.getElementById("resultado");

function lanzardado() {
   
    let resultado = Math.floor(Math.random() * 3) + 1;
    
    valodado.innerText = resultado;
}
