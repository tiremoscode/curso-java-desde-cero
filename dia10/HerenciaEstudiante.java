package dia10;

public class HerenciaEstudiante extends HerenciaPersona {
    private String nombreCurso;

    public HerenciaEstudiante(String nombre, String nombreCurso) {
        super(nombre); // llama al constructor de la clase Padre
        this.nombreCurso = nombreCurso;
    }

    public void mostrarInformacion() {
        super.saludar(); // Utilizar el método del padre
        System.out.println("Soy un estudiante del " + nombreCurso);
    }
}
