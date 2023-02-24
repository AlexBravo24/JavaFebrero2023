
public class Principal {

	public static void main(String[] args) {
		// Instanciamos un nuevo Departamento de la clase empresa 
   Departamentos dep = new Departamentos ("Sistemas","Segundo nivel",10);
   
   //Instanciamos un nuevo Nomina de la clase 
   Nomina salario = new Nomina (400,"por día","Aguinaldo,Vacaciones, IMSS, Afore, Infonavit", 20 , "quincenal");
   
   //Instanciamos un nuevo Sucursal de la clase
   Sucursal suc = new Sucursal ("México", "Puebla", 2, "No");
   
   Empresa empresa= new Empresa (2019,"Ceteq",30,"Desarrollo de Developers", dep, salario, suc);
   System.out.println(empresa);
	}

}
