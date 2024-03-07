public class App {
    public static void main(String[] args) throws Exception {
        Poligono tr = new TrianguloRetangulo(10, 5, 0);
        Poligono rt = new Retangulo(12, 5, 0);

        System.out.println("Triangulo retângulo: "+tr.calcularArea());
        System.out.println("Retangulo: "+rt.calcularArea());

    }
}
