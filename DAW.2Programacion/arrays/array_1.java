package arrays;

// 1. Utilizar el operador new
// int edad[]; -> declara la variable edad
// edad = new int[5]; -> asigna a ‘edad’ un array de long 5
//
// 2. Asignar los valores en el momento de la declaración, sin utilizar new
// int edad[] = {12, 34, 78}; 
// esta forma solo se puede utilizar en el mismo momento de la declaración

//Una vez creado el array, los elementos se inicializan con valores por defecto:
//  Enteros : 0
//  Booleanos: false
//  Otros: null

/////////////////////////////////////////////////////////////////

// 1. Crea 3 arrays de 5 elementos: la primera de enteros, la segunda de doubles, y la
//    tercera de booleanos. Muestra las referencias en las que se encuentra cada una de
//    las arrays anteriores.
//    Realiza dos versiones del programa, una que utilice el operador new para crear el
//    array, y otra que no lo utilice.

public class array_1 {

	public static void main(String[] args) {

		int a[] ;
		double b[];
		boolean c[];

		a=new int[5];
		b=new double[5];
		c=new boolean[5];
		System.out.println(a[0]);
		System.out.println(b[0]);
		System.out.println(c[0]);

		int aa[] = {1 ,2 ,3 ,4 ,5};
		double bb[]= {1.2 ,2.3 ,3.3 ,4.5 ,5.3};
		boolean cc[]= {true , true , true , true , true};
		System.out.println(aa[1]);
		System.out.println(bb[1]);
		System.out.println(cc[1]);
		
		System.out.println(aa);
	}

}
