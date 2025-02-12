package mates;
import java.math.*;

public class Matematicas{

    public static double generarNumeroPiIterativo(long pasos){
        
        int dardosCirculo = 0;
        
        for(int i=0; i<pasos; i++){ 
        double dardox = Math.random();
        double dardoy = Math.random();
        double x2 = Math.pow(dardox, 2);
        double y2 = Math.pow(dardoy, 2);
        double suma = x2+y2;
            if(suma<=1){
                dardosCirculo++;
            }
    }
    return 4.0*dardosCirculo/pasos;
}
}