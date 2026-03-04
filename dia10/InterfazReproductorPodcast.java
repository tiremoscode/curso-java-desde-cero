package dia10;

public class InterfazReproductorPodcast implements InterfazReproductor {
    public void reproducir() {
        System.out.println("Reproduciendo podcast mp3");
    }

    public void detener() {
        System.out.println("Pausando podcast");
    }
}
