let pregunta = document.getElementById("Pregunta")
let correcto = document.getElementById("correcto");
let incorrecto = document.getElementById("incorrecto");

function correctoAlert(){
    correcto.style.backgroundColor = "green"
    incorrecto.style.backgroundColor = "red"
    alert("CORRRREEEECTOOO!!")
}

function incorrectoAlert(){
    alert("UPS! INCORRECTO!")
}

function cambiarlaPregunta(){
    let random = Math.floor(Math.random() * 10) + 1;
    if(random === 1){
        pregunta.innerText = ("pregunta 2")
    }else if(random === 2){
        pregunta.innerText = ("pregunta 3")
    }
    else if(random === 3){
        pregunta.innerText = ("pregunta 4")
    }
    else if(random === 4){
        pregunta.innerText = ("pregunta 5")
    }
    else if(random === 5){
        pregunta.innerText = ("pregunta 6")
    }
    else if(random === 6){
        pregunta.innerText = ("pregunta 7")
    }
    else if(random === 7){
        pregunta.innerText = ("pregunta 8")
    }
    else if(random === 8){
        pregunta.innerText = ("pregunta 9")
    }
    else if(random === 9){
        pregunta.innerText = ("pregunta 10s")
    }
    
    
}
