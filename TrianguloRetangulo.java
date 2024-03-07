public class TrianguloRetangulo extends Poligono {
    public TrianguloRetangulo(double altura,double base,double raio){
        super(altura, base, raio);
    }
    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }
    
}
