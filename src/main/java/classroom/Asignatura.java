package classroom;

public class Asignatura {

    String nombre;
    String n = nombre;
    int codigoInterno;
    int codigoExterno;
    Tipo tipo;
    
    //Sobre carga de constructores
    Asignatura() {
        this("Sin nombre",Tipo.FUNDAMENTACION);
        // Un llamado a otro construnctor se debe hacer en la parte inicial de otro constructor
        // Adem�s de esto, no hay un constructor que s�lo reciba un entero.
        //this(0);
    }
    
    // No puede existir una sobre carga de m�todos con el mismo tipo de recepci�n de par�metros.
    //Asignatura(int codigoInterno,Tipo tipo) {
    //    this("Sin nombre", codigoInterno, 0,tipo);
    //}

    Asignatura(int codigoExterno,Tipo tipo) {
        this("Sin nombre", 0, codigoExterno,tipo);
    }

    Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0,tipo);
    }

    Asignatura(String nombre, int codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    // Sobre carga de m�todos
    void cambiarDatos(int codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    //void cambiarDatos(int codigoInterno) {
    //    this.codigoInterno = codigoInterno;
    //}

    void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }
    
    
    // Sobre carga de m�todos
    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
