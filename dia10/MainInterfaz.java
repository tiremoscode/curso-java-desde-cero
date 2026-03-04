package dia10;

public class MainInterfaz {
    public static void main(String[] args) {
        InterfazReproductor mp3 = new InterfazReproductorMusica();
        InterfazReproductor mp4 = new InterfazReproductorVideo();
        InterfazReproductor podcast = new InterfazReproductorPodcast();

        mp3.reproducir();
        mp4.reproducir();
        podcast.reproducir();

    }
}
