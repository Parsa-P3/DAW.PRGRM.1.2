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
        pregunta.innerText = ("pregunta 2");
        correcto.innerText = ("Respuesta correcta para pregunta  2");
        incorrecto.innerText = ("Respuesta incorrecta para pregunta 2");
    }else if(random === 2){
        pregunta.innerText = ("pregunta 3")
        correcto.innerText = ("Respuesta correcta para pregunta  3");
        incorrecto.innerText = ("Respuesta incorrecta para pregunta 3");
    }
    else if(random === 3){
        pregunta.innerText = ("pregunta 4")
        correcto.innerText = ("Respuesta correcta para pregunta  4");
        incorrecto.innerText = ("Respuesta incorrecta para pregunta 4");
    }
    else if(random === 4){
        pregunta.innerText = ("pregunta 5")
        correcto.innerText = ("Respuesta correcta para pregunta  5");
        incorrecto.innerText = ("Respuesta incorrecta para pregunta 5");
    }
    else if(random === 5){
        pregunta.innerText = ("pregunta 6")
        correcto.innerText = ("Respuesta correcta para pregunta  6");
        incorrecto.innerText = ("Respuesta incorrecta para pregunta 6");
    }
    else if(random === 6){
        pregunta.innerText = ("pregunta 7")
        correcto.innerText = ("Respuesta correcta para pregunta  7");
        incorrecto.innerText = ("Respuesta incorrecta para pregunta 7");
    }
    else if(random === 7){
        pregunta.innerText = ("pregunta 8")
        correcto.innerText = ("Respuesta correcta para pregunta  8");
        incorrecto.innerText = ("Respuesta incorrecta para pregunta 8");
    }
    else if(random === 8){
        pregunta.innerText = ("pregunta 9")
        correcto.innerText = ("Respuesta correcta para pregunta  9");
        incorrecto.innerText = ("Respuesta incorrecta para pregunta 9");
    }
    else if(random === 9){
        pregunta.innerText = ("pregunta 10s")
        correcto.innerText = ("Respuesta correcta para pregunta  10");
        incorrecto.innerText = ("Respuesta incorrecta para pregunta 10");
    }
    
    
}
