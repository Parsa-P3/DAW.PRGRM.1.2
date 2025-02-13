let valodado = document.getElementById("resultado");

function lanzardado() {
   
    let resultado = Math.floor(Math.random() * 8) + 1;
    
    valodado.innerText = resultado;
}

let jg1 = document.getElementById("jg1");
let jg2 = document.getElementById("jg2");
let jg3 = document.getElementById("jg3");
let jg4 = document.getElementById("jg4");




                // function capitanRojo(){
                // let playerElement = document.getElementById(`jg${1}`);
            
                //         let nombre = prompt("Quien Es Capitan de Equipo Rojo? ");
                //         playerElement.innerText = nombre;
                //         playerElement.style.display = "h2";
                //         playerElement.style.textAlign = "center"
                
                // }
                // capitanRojo();


                // function capitanAmarillo(){
                //     let playerElement = document.getElementById(`jg${2}`);
                
                //             let nombre = prompt("Quien Es Capitan de Equipo Amarillo? ");
                //             playerElement.innerText = nombre;
                //             playerElement.style.display = "h2";
                //             playerElement.style.textAlign = "center"
                    
                //     }
                //  capitanAmarillo();
                 

                // function capitanAzul(){
                //     let playerElement = document.getElementById(`jg${3}`);
                
                //             let nombre = prompt("Quien Es Capitan de Equipo Azul? ");
                //             playerElement.innerText = nombre;
                //             playerElement.style.display = "h2";
                //             playerElement.style.textAlign = "center"
                    
                //     }
                //     capitanAzul();


                //     function capitanRosado(){
                //         let playerElement = document.getElementById(`jg${4}`);
                    
                //                 let nombre = prompt("Quien Es Capitan de Equipo Rosado? ");
                //                 playerElement.innerText = nombre;
                //                 playerElement.style.display = "h2";
                //                 playerElement.style.textAlign = "center"
                        
                //         }
                //         capitanRosado();



function anadirpuntoRojo(){

   let puntosRojos = document.getElementById("puntosRojo");
   let ganador =2500; 
   let currentPoints = parseInt(puntosRojos.innerText); // Metni sayıya çevir

    if(currentPoints ===ganador){
        alert("Enhorabuena! HA GANADO EL EQUIPO ROJO!")
    }else{
    puntosRojos.innerText = currentPoints + 100; // Sayısal toplama yap
    }
   
   
}

function anadirpuntoAmarillo(){

    let puntosRojos = document.getElementById("puntosAmarillo");
    let ganador =2500; 
    let currentPoints = parseInt(puntosRojos.innerText); // Metni sayıya çevir
 
     if(currentPoints ===ganador){
         alert("Enhorabuena! HA GANADO EL EQUIPO ROJO!")
     }else{
     puntosRojos.innerText = currentPoints + 100; // Sayısal toplama yap
     }
    
    
 }

function anadirpuntoAzul(){
    let puntosAzul = document.getElementById("puntosAzul");
    let currentPoints = parseInt(puntosAzul.innerText);
    
   
    let ganador =2500;
    if(currentPoints === ganador){
        alert("Enhorabuena! HA GANADO EL EQUIPO AZUL!")
    }
    else{
    puntosAzul.innerText = currentPoints + 100; 
    }
}

function anadirpuntoRosado(){
    let puntosAzul = document.getElementById("puntosRosado");
    let currentPoints = parseInt(puntosAzul.innerText);
    
   
    let ganador =2500;
    if(currentPoints === ganador){
        alert("Enhorabuena! HA GANADO EL EQUIPO AZUL!")
    }
    else{
    puntosAzul.innerText = currentPoints + 100; 
    }
}

function eksiRojo(){
    let puntosRojos = document.getElementById("puntosRojo");
    let currentPoints = parseInt(puntosRojos.innerText); 
    
    puntosRojos.innerText = currentPoints - 100; 
}
function eksiAmarillo(){
    let puntosRojos = document.getElementById("puntosAmarillo");
    let currentPoints = parseInt(puntosRojos.innerText); 
    
    puntosRojos.innerText = currentPoints - 100; 
}

function eksiAzul(){
    let puntosAzul = document.getElementById("puntosAzul");
    let currentPoints = parseInt(puntosAzul.innerText); 
    
    puntosAzul.innerText = currentPoints - 100; 

   
}

function eksiRosado(){
    let puntosAzul = document.getElementById("puntosRosado");
    let currentPoints = parseInt(puntosAzul.innerText); 
    
    puntosAzul.innerText = currentPoints - 100; 

   
}

function x(){
    window.open("1.html", "_blank");
}

function y(){
    window.open("2.html", "_blank");
}

function z(){
    window.open("prDificil.html", "_blank");
}


