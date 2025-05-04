package Main;


public class Posnet {
    
    
    
    public Ticket efectuarPago(Tarjeta tarjeta, double monto, Cuotas cuotas){
    
        double[] resultados =  aplicarRecargo(cuotas, monto);
        
        try{
            
        
        chequeoSaldo(tarjeta, cuotas, resultados[0], resultados[1]);
        return imprimirTicket(tarjeta, resultados[0], resultados[1]);
        }
        catch (SaldoInsuficienteException e){
        
            System.out.println(e.getMessage()); 
            return null;
            
        }
        }
    
    
    public double[] aplicarRecargo(Cuotas cuotas, double monto){
        
        
        double[] resultados = new double[2];
    
    switch (cuotas){
    
        case cuotas.UNO:
            resultados[0] = monto;
            resultados[1] = monto;
            break;
            
        case cuotas.DOS:
            resultados[0] = monto + (monto * 0.03);
            resultados[1] = resultados[0] / 2;
            break;
            
        case cuotas.TRES:
            resultados[0] = monto + (monto * 0.06);
            resultados[1] = resultados[0] / 3;
            break;
            
        case cuotas.CUATRO:
            resultados[0] = monto + (monto * 0.09);
            resultados[1] = resultados[0] / 4;
            break;
            
        case cuotas.CINCO:
            resultados[0] = monto + (monto * 0.12);
            resultados[1] = resultados[0] / 5;
            break;
            
        case cuotas.SEIS:
            resultados[0] = monto + (monto * 0.15);
            resultados[1] = resultados[0] / 6;
            break;
            
        }
    
    return resultados;
    }
    
    
    
    public void chequeoSaldo(Tarjeta tarjeta, Cuotas cuotas, double monto, double valorCuota) throws SaldoInsuficienteException {
    
        if (cuotas == cuotas.UNO){

            if (tarjeta.getSaldo() < valorCuota){

                throw new SaldoInsuficienteException("Saldo insuficiente para realizar el pago");

                }
        

            else {

                    imprimirTicket(tarjeta, monto, valorCuota);

                }

        }
        
        else {

            if (tarjeta.getSaldo() < monto){

                throw new SaldoInsuficienteException("Saldo insuficiente para realizar el pago");
                }


            else {

                imprimirTicket(tarjeta, monto, valorCuota);
                
            }
        }
    
    }
    
    public Ticket imprimirTicket(Tarjeta tarjeta, double monto, double valorCuota){
    
    return new Ticket(tarjeta.getNombre(),tarjeta.getApellido(),monto,valorCuota);
        
    }
    
    
            

}
