package arrays;
// 2. Construye una tabla de 10 enteros. Declara diferentes variables de tabla que
//    referenciarán la tabla creada. Comprueba, imprimiendo por pantalla, que todas las
//    variables contienen la misma referencia.
//    Realiza dos versiones del programa, una que utilice el operador new para crear el
//    array, y otra que no lo utilice.

public class array_2 {

    public static void main(String[] args) {
       int a[] = {1 , 2 ,3 ,4 , 5 ,6 ,7 ,8 , 9, 10 };
       int b[];
       int c[];

       b = a ;
       c = a ;

       System.out.println(b[3]);
       System.out.println(c[3]);

        
    }
    
}
