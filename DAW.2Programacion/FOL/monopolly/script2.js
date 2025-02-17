let pregunta = document.getElementById("Pregunta")
let correcto = document.getElementById("DivRespuesta1");
let incorrecto = document.getElementById("DivRespuesta2");



function correctoAlert(){
    
    correcto.style.backgroundColor = "green"
    incorrecto.style.backgroundColor = "red"
    
    document.getElementById('photoss').src = "https://media1.giphy.com/media/v1.Y2lkPTc5MGI3NjExNWo1eTdmd3Bxa3I4c2lxZHFmNTA1ZDN5ZHk2MXg2YTNmaGNhOGkwMSZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/tlGD7PDy1w8fK/giphy.gif";
    document.getElementById('photoss').style.display = 'block';

    alert("CORRRREEEECTOOO!!")
    
}

function incorrectoAlert(){
    correcto.style.backgroundColor = "green"
     incorrecto.style.backgroundColor = "red"
    
     document.getElementById('photoss').src = "https://media3.giphy.com/media/v1.Y2lkPTc5MGI3NjExcmRrMWVqaGEwOHl6dzlnanNqZGxleXNieGdnZm5xZ2tnZGxzbDB6ciZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/wD0ecvxjcc84E/giphy.gif";
     document.getElementById('photoss').style.display = 'block';
     document.getElementById('photoss').style.width ='500px';
    alert("UPS! INCORRECTO!")
}

let pIncorrecto = document.getElementById("pIncorrecto");
let pCorrecto = document.getElementById("pCorrecto")
// HEY
// He intendado a usar un function de insertBefore para cada vez que utilizamos button random , cambia espacio de respuesta correcto , funciona pero no correctamente , 
//esta modificando la pregunta tambien esto no queremos
//si teneis algun otro idea para que cada vez cambiamos las respuestas se puede utilizar
//no olvidar butones , no es suficiente cambiar respuesta hay que lleva butones tambien
function cambiarlaPregunta(){
    let random = Math.floor(Math.random() * 1) + 1;
    if(random === 1){
      
        pregunta.innerText = ("Marcos empieza su turno a las 08:00. Llega a su puesto de trabajo a las 07:58 y comienza a cambiarse de ropa, por lo que está listo a las 08:05. ¡Qué ocurre en este caso?");
        pCorrecto.innerText = ("Marcos debió cambiarse antes de su hora de inicio. Se exige que los trabajadores estén cambiados y listos para comenzar su jornada a la hora establecida.");
        pIncorrecto.innerText = ("No pasa nada, mientras fiche a su hora, puede tomarse unos minutos para cambiarse.");
        
        let parent = correcto.parentNode;
        parent.insertBefore(incorrecto , correcto)
     }
    //  else if(random === 2){
    //     pregunta.innerText = ("pregunta 3")
    //     pCorrecto.innerText = ("Respuesta correcta para pregunta  3");
    //     incorrecto.innerText = ("Respuesta incorrecta para pregunta 3");
    // }
    // else if(random === 3){
    //     pregunta.innerText = ("pregunta 4")
    //     correcto.innerText = ("Respuesta correcta para pregunta  4");
    //     incorrecto.innerText = ("Respuesta incorrecta para pregunta 4");
    // }
    // else if(random === 4){
    //     pregunta.innerText = ("pregunta 5")
    //     correcto.innerText = ("Respuesta correcta para pregunta  5");
    //     incorrecto.innerText = ("Respuesta incorrecta para pregunta 5");
    // }
    // else if(random === 5){
    //     pregunta.innerText = ("pregunta 6")
    //     correcto.innerText = ("Respuesta correcta para pregunta  6");
    //     incorrecto.innerText = ("Respuesta incorrecta para pregunta 6");
    // }
    // else if(random === 6){
    //     pregunta.innerText = ("pregunta 7")
    //     correcto.innerText = ("Respuesta correcta para pregunta  7");
    //     incorrecto.innerText = ("Respuesta incorrecta para pregunta 7");
    // }
    // else if(random === 7){
    //     pregunta.innerText = ("pregunta 8")
    //     correcto.innerText = ("Respuesta correcta para pregunta  8");
    //     incorrecto.innerText = ("Respuesta incorrecta para pregunta 8");
    // }
    // else if(random === 8){
    //     pregunta.innerText = ("pregunta 9")
    //     correcto.innerText = ("Respuesta correcta para pregunta  9");
    //     incorrecto.innerText = ("Respuesta incorrecta para pregunta 9");
    // }
    // else if(random === 9){
    //     pregunta.innerText = ("pregunta 10s")
    //     correcto.innerText = ("Respuesta correcta para pregunta  10");
    //     incorrecto.innerText = ("Respuesta incorrecta para pregunta 10");
    // }
    
  
        // para cada vez que damos al random se cambia el color de fondo de lo que viene por defecto
        correcto.style.backgroundColor = "rgba(85, 85, 85, 0.925)";
        incorrecto.style.backgroundColor = "rgba(85, 85, 85, 0.925)";
        
        // para borrar el imagen 
        document.getElementById('photoss').style.display = 'none';
    
}
