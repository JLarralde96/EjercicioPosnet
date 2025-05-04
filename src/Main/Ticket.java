
package Main;


public class Ticket {
    
    private String nombre;
    private String apellido;
    private double monto;
    private double valorCuota;

    public Ticket(String nombre, String apellido, double monto, double valorCuota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.monto = monto;
        this.valorCuota = valorCuota;
    }
    
    @Override
    public String toString(){
    
        return "Ticket {\n" + "Nombre: " + nombre + ", Apellido: " + apellido + ", Monto:$" 
                + monto + ", Cuota:$" + valorCuota + "}";
    }
}
