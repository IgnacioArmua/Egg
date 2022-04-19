
package reactangulo;

public class rectangulos {
    private double base;
    private double altura;
    public double superficie;
    public double perimetro; 
    
    public rectangulos(){
       
    }

    public rectangulos(double base, double altura, double superficie, double perimetro) {
        this.base = base;
        this.altura = altura;
        this.superficie = superficie;
        this.perimetro = perimetro;
    }
    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double valores(int a, int b){
        this.base=a;
        this.altura=b;
        return 0;
    }
    public double superficie (rectangulos a){
        superficie = a.getBase()*a.getAltura();
        return superficie;
    }
    
    public double perimetro(rectangulos a){
        perimetro= ((a.getAltura()+a.getBase())*2);
        return perimetro;
    }

    
}
