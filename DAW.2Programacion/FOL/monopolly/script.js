let valodado = document.getElementById("resultado");

function lanzardado() {
   
    let resultado = Math.floor(Math.random() * 8) + 1;
    
    valodado.innerText = resultado;
}

let jg1 = document.getElementById("jg1");
let jg2 = document.getElementById("jg2");
let jg3 = document.getElementById("jg3");
let jg4 = document.getElementById("jg4");
let jg5 = document.getElementById("jg5");

// console.log(jg1);
// console.log(jg2);
// console.log(jg3);
// console.log(jg4);
// console.log(jg5);

let jg6 = document.getElementById("jg6");
let jg7 = document.getElementById("jg7");
let jg8 = document.getElementById("jg8");
let jg9 = document.getElementById("jg9");
let jg10 = document.getElementById("jg10");

// console.log(jg6);
// console.log(jg7);
// console.log(jg8);
// console.log(jg9);
// console.log(jg10);

for (let i = 1; i <= 5; i++) {
    let nombres = prompt("El nombre de jugador " + i)
    let X  = document.getElementById(`jg${i}`); // jg1, jg2, jg3, jg4, jg5
    X.innerText = nombres;
    console.log(X);
}


for (let i = 6; i <= 10; i++) {
    let nombres = prompt("El nombre de jugador " + i)
    let X  = document.getElementById(`jg${i}`); // jg1, jg2, jg3, jg4, jg5
    X.innerText = nombres;
    console.log(X);
}


   let puntosRojos = document.getElementById("puntosRojo");
   let ganador =6;

function anadirpuntoRojo(){
 let currentPoints = parseInt(puntosRojos.innerText); // Metni sayıya çevir

    if(currentPoints ===ganador){
        alert("Enhorabuena! HA GANADO EL EQUIPO ROJO!")
    }else{
    puntosRojos.innerText = currentPoints + 1; // Sayısal toplama yap
    }
   
   
}

function anadirpuntoAzul(){
    let puntosAzul = document.getElementById("puntosAzul");
    let currentPoints = parseInt(puntosAzul.innerText);
    
   
    let ganador =6;
    if(currentPoints === ganador){
        alert("Enhorabuena! HA GANADO EL EQUIPO AZUL!")
    }
    else{
    puntosAzul.innerText = currentPoints + 1; 
    }
}

function eksiRojo(){
    let puntosRojos = document.getElementById("puntosRojo");
    let currentPoints = parseInt(puntosRojos.innerText); 
    
    puntosRojos.innerText = currentPoints - 1; 
}

function eksiAzul(){
    let puntosAzul = document.getElementById("puntosAzul");
    let currentPoints = parseInt(puntosAzul.innerText); 
    
    puntosAzul.innerText = currentPoints - 1; 

   
}


function x(){
    window.open("prBasic.html", "_blank");
}

function y(){
    window.open("prMedio.html", "_blank");
}

function z(){
    window.open("prDificil.html", "_blank");
}

