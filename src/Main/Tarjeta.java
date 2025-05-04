
package Main;


public class Tarjeta {
    
    private EntidadFinanciera eFinanciera;
    private String eBancaria;
    private long numTarjeta;
    private double saldoDisponible;
    private Titular titular;

    public Tarjeta(EntidadFinanciera eFinanciera, String eBancaria, long numTarjeta, double saldoDisponible, Titular titular) {
        this.eFinanciera = eFinanciera;
        this.eBancaria = eBancaria;
        this.numTarjeta = numTarjeta;
        this.saldoDisponible = saldoDisponible;
        this.titular = titular;
        
      
    }
    
    
    public String getNombre(){
    
    return titular.getNombre();
    
    }
    
    public String getApellido(){
    
    return titular.getApellido();
    
    }
    
    public double getSaldo(){
    
    return this.saldoDisponible;
    
    }
    
    
    @Override
    public String toString(){
    
        return "Tarjeta {" + "Entidad Finaciera: " + eFinanciera + ", Entidad Bancaria: " + eBancaria + ", Numero de Tarjeta: " 
                + numTarjeta + ", Saldo Disponible:$" + saldoDisponible 
                + ", Titular: " + titular;
    }
    
    
}
