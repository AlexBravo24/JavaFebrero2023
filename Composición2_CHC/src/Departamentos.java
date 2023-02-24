
public class Departamentos {
  private String area;
  private String ubicacion;
  private int personal;
  public Departamentos () {}
public Departamentos(String area, String ubicacion, int personal) {
	super();
	this.area = area;
	this.ubicacion = ubicacion;
	this.personal = personal;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getUbicacion() {
	return ubicacion;
}
public void setUbicacion(String ubicacion) {
	this.ubicacion = ubicacion;
}
public int getPersonal() {
	return personal;
}
public void setPersonal(int personal) {
	this.personal = personal;
}
@Override
public String toString() {
	return "Departamentos [area=" + area + ", ubicacion=" + ubicacion + ", personal=" + personal + "]";
}
  
}
