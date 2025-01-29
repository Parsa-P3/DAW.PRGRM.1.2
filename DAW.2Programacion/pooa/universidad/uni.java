package universidad;

import java.util.Arrays;

public class uni {
	private int cantidadEstudiantes;
	private estudiante[] estudiantes;

	
	public uni(){
		estudiantes = new estudiante[0];
		cantidadEstudiantes = 0;
	}
	
	public void addEstudiante(estudiante x) {
		estudiantes = Arrays.copyOf(estudiantes, cantidadEstudiantes +1);
		estudiantes[cantidadEstudiantes]=x;
		cantidadEstudiantes++;
	}
	
	public estudiante[] getEstudiante() {
		return Arrays.copyOf(estudiantes, cantidadEstudiantes);
	}
}
