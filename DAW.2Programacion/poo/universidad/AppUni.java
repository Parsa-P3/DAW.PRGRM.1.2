package universidad;

public class AppUni {

	public static void main(String[] args) {
		estudiante e1 = new estudiante("Parsa", 22, 109);
		estudiante e2 = new estudiante("Noe", 19, 110);
		
		uni u1 = new uni();
		
		u1.addEstudiante(e1);
		u1.addEstudiante(e2);

		System.out.println("Lista de los estudiantes : ");
		for (estudiante x : u1.getEstudiante()) {
			System.out.println("Nombre de alumno : " + x.getNombre() + " , Tiene " + x.getEdad() +  " años , con matricula de " + x.getMatricula());
			
		}
	}

}
