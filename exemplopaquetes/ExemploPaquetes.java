
package exemplopaquetes;
import triangulo.AreaTriangulo;
import triangulo.PerimetroTriangulo;
import circulo.*; //importo todas las clases del paquete
import rectangulo.*;

public class ExemploPaquetes {

    public static void main(String[] args) {
        //para calcular el area del triangulo
        
        AreaTriangulo tri = new AreaTriangulo();
        tri.areaTriangulo(6f, 2f);
        PerimetroTriangulo per = new PerimetroTriangulo();
        per.periTrianguloIsosceles(6, 2);
        MeusMetodos aux = new MeusMetodos();
        float base=aux.validaFloatPositivo();
        float altura= aux.validaFloatPositivo();
        Area rec = new Area();
        rec.areaRectangulo(base, altura);
        
        //utilizando metodos de acceso STATIC
        float b = MeusMetodos.darValor();
        float alt = MeusMetodos.darValor();
        rec.areaRectangulo(b, alt);
        
        //Simplificando
        rec.areaRectangulo(MeusMetodos.darValor(),MeusMetodos.darValor());
        
        
        
        
                
                
                
    }
    
}
