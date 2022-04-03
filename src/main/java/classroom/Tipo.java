package classroom;

public enum Tipo {
	DISCIPLINAR(10,"D"),FUNDAMENTACION(20,"F"),ELECTIVA(30,"E");
	
	private int codigo;
	private String nombre;
	private Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
