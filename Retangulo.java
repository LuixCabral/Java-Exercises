public class Retangulo extends Poligono {
    public Retangulo(double altura ,double base,double raio){
        super(altura, base, raio);
    }
    @Override
    public double calcularArea(){
        return base*altura;
    }
    
}
