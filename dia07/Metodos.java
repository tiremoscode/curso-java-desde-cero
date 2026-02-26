package dia07;

public class Metodos {
    public static void main(String[] args) {
        saludarAlumno("Pedro");

        // Implementarlos
        double subtotalProducto = 100;
        double totalProducto = subtotalProducto * calculoIva();
        System.out.println(totalProducto);
        double costoCursoJava = 10900.00;

        // Entrar a la clase
        String nombre = "Marco";
        boolean pagoCursoJava = false;
        boolean tieneDescuento = true;
        String mensajeCurso = puedeEntrarAClaseDeJava(pagoCursoJava) ? "Puedes entrar" : "No puedes entrar";
        System.out.println(
                nombre + " " + mensajeCurso + " y valdrá " + precioCursoAlumno(tieneDescuento, costoCursoJava));

        String alumno2 = "Hector";
        boolean pagoCursoJava2 = true;
        boolean tieneDescuento2 = true;
        String mensajeCurso2 = puedeEntrarAClaseDeJava(pagoCursoJava2) ? "Puedes entrar" : "No puedes entrar";
        System.out.println(
                alumno2 + " " + mensajeCurso2 + " y valdrá " + precioCursoAlumno(tieneDescuento2, costoCursoJava));

        String alumno3 = "Karla";
        boolean pagoCursoJava3 = true;
        boolean tieneDescuento3 = false;
        String mensajeCurso3 = puedeEntrarAClaseDeJava(pagoCursoJava3) ? "Puedes entrar" : "No puedes entrar";

        System.out.println(
                alumno3 + " " + mensajeCurso3 + " y valdrá " + precioCursoAlumno(tieneDescuento3, costoCursoJava));

        System.out.println(multiplicacion(5.0, 3.0));

    }

    public static void saludarAlumno(String nombre) {
        System.out.println("Hola: " + nombre);
    }

    public static double calculoIva() {
        return 1.1;
    }

    public static double precioCursoAlumno(boolean aplicaDescuento, double costoCurso) {
        // El alumno que toma otro curso con TecGurus posteriormente tiene un 10% de
        // descuento
        return !aplicaDescuento ? costoCurso : costoCurso * 0.88;
    }

    public static boolean puedeEntrarAClaseDeJava(boolean pagoCurso) {
        return pagoCurso ? true : false;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }
}
