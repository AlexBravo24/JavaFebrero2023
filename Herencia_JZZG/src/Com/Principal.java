package Com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Persona persona1 =new Persona("Ana","F",18);
		System.out.println(persona1);
		
		 Developer desarrollador= new Developer("aron ", "M", 30,12345,"Developer jr ","ARR896420", "8am -5pm",30000);
		
			System.out.println(desarrollador);
			
			desarrollador.checarEntrada();
			desarrollador.trabajar();
	
	}

	
}
