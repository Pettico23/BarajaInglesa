
package baraja.cartas;


public abstract class Carta {
    private boolean tapada;

    public Carta() {
        this.tapada = true;
    }//Por defecto, "tapada" es false
    
    public void darVuelta(){
        tapada = !tapada;
        
    
    }

    public boolean isTapada() {
        return tapada;
    }
    
    
    
    public void mostrar(){
        if(tapada){
            System.out.println("******************");
        
        }else{
            System.out.println(getRepresentacion());
        }
    
    }
    public String getRepresentacion(){
        return "Carta generica";
    }
    
    
    
    
    
    
}
