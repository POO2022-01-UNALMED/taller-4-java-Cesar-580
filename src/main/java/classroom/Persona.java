package classroom;

public class Persona {

    long cedula;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
        // Si se define en la parte superior un archivo tipo final.
        // no se puede reescribir en el método static
        //cedula = 3;
    }

    // Sobre carga de constructores.
    
    Persona(long cedula, String nombre) {
    	//Como la cédula es de tipo final, no se puede reescribir
        //this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
    	//Como la cédula es de tipo final, no se puede reescribir
        //this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
    	//Como la cédula es de tipo final, no se puede reescribir
        //this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this.nombre = "";
        totalPersonas++;
        this.cedula = 1;
    }
    
    Persona (){
    	
    }
    
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
