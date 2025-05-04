
package Main;
import java.util.Scanner;




public class Main {

  
    public static void main(String[] args) {
        
        Titular p1 = new Titular(39916853L, "Juan Pablo", "Larralde", 2229511497L, "jlarralde96@gmail.com");
        
        Tarjeta t1 = new Tarjeta(EntidadFinanciera.VISA,"BBVA", 454073001230L, 45000, p1 );
        
        Posnet posnet1 = new Posnet();
        
        Ticket pago = posnet1.efectuarPago(t1, 20000, Cuotas.CINCO);
        
        
        System.out.println(pago);
             
    }
    
}
