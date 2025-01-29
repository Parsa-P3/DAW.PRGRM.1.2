package pooa1;

public class AppVehiculo {

	public static void main(String[] args) {

		vehiculo v1 = new vehiculo("SEAT", "Ibiza", 2003);
		vehiculo v2 = new vehiculo("SEAT", "Leon", 2010);
		vehiculo v3 = new vehiculo("SEAT", "Ibiza", 2003);

		System.out.println(v1);

		// equals iki objenin atributlarinin birebir ayni olup olmadigini kontrol ediyor
		if (v1.equals(v3)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}

		//hashcode metodu equal gibi ancak bize bir int donusturuyor
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println(v3.hashCode());

	}

}
