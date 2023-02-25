package Com;

// En este ejemplo, un elpeado tambiem es una persona 
//ademas de los atributos que tiene el empleado



public abstract class Empleado extends Persona {
	
    private int idEmpleado;    
	private String puesto;
	private String rfc;
	private String horario;
	private double salario;
	
	// creamos el constructor vacio
	
	public Empleado() {}

	public Empleado(String nombre, String sexo, int edad, int idEmpleado, String puesto, String rfc, String horario,
		double salario) {
		
		
		super(nombre, sexo, edad);
		this.idEmpleado = idEmpleado;
		this.puesto = puesto;
		this.rfc = rfc;
		this.horario = horario;
		this.salario = salario;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


	
	
	
	
        
	//en las clase tambiem podemos crear o implementar metodos propios
	// con el modificador void indicamos que se va a realizar algo
	//pero sinque tenga que retornar un valor
	
	//metodo proipio
	
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", puesto=" + puesto + ", rfc=" + rfc + ", horario=" + horario
				+ ", salario=" + salario + ", toString()=" + super.toString() + "]";
	}

	public void checarEntrada (){
		
		System.out.println("checar entrada 8am");
	}
	public abstract void trabajar(); 
}
