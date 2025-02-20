package Excepciones;

public class ex {
    
    public static void main(String[] args) {
        // Excepcion Aritmetica
       int resultado = 0;
        int num = 8;
        int d= 0;
        try{
 

        resultado = num / d ;
   
    }catch(Exception e){
        System.out.println("Error de la operacion: ");
        System.out.println(e.getMessage());
    }
    System.out.println("El resultado es: " + resultado);
        
    }
}
