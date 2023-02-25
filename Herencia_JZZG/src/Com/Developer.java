package Com;

public class Developer extends Empleado{
	
	//si no tengo atributos en las clases que va a heredar de la clase padre
	
	
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(String nombre, String sexo, int edad, int idEmpleado, String puesto, String rfc, String horario,
			double salario) {
		super(nombre, sexo, edad, idEmpleado, puesto, rfc, horario, salario);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		
		System.out.println("rebisar errores");
	}

	
	
}
