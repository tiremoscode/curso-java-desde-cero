package dia10;

public class MainNotiPolimorfismo {
    public static void main(String[] args) {
        // Polimorfismo - Instancia de clases y los 3 objetos

        // El tipo de la variable es Notificacion
        // Pero el objeto instanciado real es lo que esta después
        // del objeto new.

        // ClasePadre variable = new ClaseHija();
        Notificacion medioEmail = new NotiEmail();
        Notificacion medioSMS = new NotiSMS();
        Notificacion medioWhatsapp = new NotiWhatsapp();
        Notificacion medioSlack = new NotiSlack();

        // No es polimorfismo
        Notificacion cesar = new Notificacion();

        medioEmail.enviar();
        medioSMS.enviar();
        medioWhatsapp.enviar();
        cesar.enviar();
        // Revisando - override
        medioSlack.enviar();
    }
}
