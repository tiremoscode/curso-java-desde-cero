package dia09;

public class MainAnimal {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Perro();
        Animal a3 = new Gato();

        a1.hacerSonido();
        a2.hacerSonido();
        a3.hacerSonido();
    }
}
