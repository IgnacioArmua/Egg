
package reactangulo;

public class Reactangulo {

   
    public static void main(String[] args) {
        rectangulos rec= new rectangulos();
        rec.valores(5, 2);
        System.out.println("La superficie del rectangulo es "+ rec.superficie(rec));
        System.out.println("El perimetro del rectangulo es "+ rec.perimetro(rec));
        
    }
    
}
