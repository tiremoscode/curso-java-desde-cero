package dia10;

public class NotiEmail extends Notificacion {
    @Override
    public void enviar() {
        System.out.println("Enviando notificación por email");
    }
}
