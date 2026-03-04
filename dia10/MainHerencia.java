package dia10;

public class MainHerencia {
    public static void main(String[] args) {
        HerenciaEstudiante a1 = new HerenciaEstudiante("Cesar", "curso de Java");
        HerenciaEstudiante a2 = new HerenciaEstudiante("Alberto", "curso de IA");

        a1.mostrarInformacion();
        a2.mostrarInformacion();

    }
}
