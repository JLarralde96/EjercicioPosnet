
package Main;


public class Titular {
    
    private long dni;
    private String nombre;
    private String apellido;
    private long numeroTel;
    private String mail;        

    public Titular(long dni, String nombre, String apellido, long numeroTel, String mail) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTel = numeroTel;
        this.mail = mail;
    }
    
    
     public String getNombre(){
     
     return this.nombre;
         
     }
     
     public String getApellido(){
     
     return this.apellido;
         
     }
     
     
     
    @Override
    public String toString(){
    
        return "\n{Dni: " + dni + ", Nombre: " + nombre + ", Apellido: " + apellido 
                + ", Numero de Telefono: " + numeroTel + ", Mail: " + mail + "}"; 
    }
    
    
}
