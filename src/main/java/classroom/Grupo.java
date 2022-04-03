package classroom;

public class Grupo {

    Persona[] estudiantes;
    Persona profesor;
    Asignatura asignatura;
    int codigo;
    String horario;

 // Sobre carga de constructores.
    Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        //El c�digo es de tipo final, por lo tanto no se puede reescribir
        this.codigo = codigo;
        this.horario = horario;
    }

    Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
    	// El this, siempre debe estar de primero en una sobre carga de m�todos
    	this(new Persona[cantidadEstudiantes], profesor, asignatura, codigo, horario);
    	//Persona[] personas = new Persona[cantidadEstudiantes];
        
    	//Persona[] personas = new Persona[cantidadEstudiantes];
        //this(personas, profesor, asignatura, codigo, horario);
    }

    Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
    }

    void cambiarEstudiante(Persona estudianteViejo, Persona estudianteNuevo) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getCedula() == estudianteViejo.getCedula()) {
                estudiantes[i] = estudianteNuevo;
                break;
            }
        }
    }
    
    void cambiarEstudiante(int indice, Persona estudiante) {
        estudiantes[indice] = estudiante;
    }
}
