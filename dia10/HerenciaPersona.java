package dia10;

public class HerenciaPersona {
    protected String nombre;

    public HerenciaPersona(String nombrePersona) {
        this.nombre = nombrePersona;
        System.out.println("Constructor de persona");
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}
