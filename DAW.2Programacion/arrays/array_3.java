package arrays;

// 3. Crea una tabla de longitud 10 que se inicializará con números aleatorios
//    comprendido entre 1 y 100. Mostrar la suma de todos los números aleatorios que se
//    guardan en la tabla.


public class array_3 {
    public static void main(String[] args) {
        // int a =(int) (Math.random() * 100);
        // int b =(int) (Math.random() * 100);
        // int c =(int) (Math.random() * 100);
        // int d =(int) (Math.random() * 100);
        // int e =(int) (Math.random() * 100);
        // int f =(int) (Math.random() * 100);
        // int g =(int) (Math.random() * 100);
        // int h =(int) (Math.random() * 100);
        // int i =(int) (Math.random() * 100);
        // int j =(int) (Math.random() * 100);
        
        // System.out.println(" ");
        
        
        // int x[] = {a , b ,c , d , e, f, g, h, i , j};
        // int suma = 0;
        // for (int y = 0; y < 10; y++) {
        //     System.out.println(x[y]);
        //     suma += x[y];
           
            
        // }

        // System.out.println("");
        // System.out.println(suma);

       ///////////////////////////////////////
       
       int numeros[];

       numeros = new int[10];

       for(int pos = 0; pos< numeros.length; pos ++){
        numeros[pos]= (int) (Math.random()*100+1);
       }

       int sumaa = 0;
       for(int auxEnteros : numeros){
        sumaa = sumaa + auxEnteros;
       }

       System.out.println("-----------");
       System.out.println(sumaa);
    }
}
