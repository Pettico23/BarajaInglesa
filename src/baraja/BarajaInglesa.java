
package baraja;

import baraja.cartas.Carta;
import baraja.cartas.CartaFigura;
import baraja.cartas.CartaJoker;
import baraja.cartas.CartaNumeral;
import java.util.ArrayList;


public class BarajaInglesa {
    private ArrayList<Carta> cartas;

    public BarajaInglesa() {
        this.cartas = new ArrayList<>();
        generarCartas();
    }
    
    public void mostrarBaraja(){
        for (Carta carta : cartas) {
            carta.darVuelta();
            carta.mostrar();
        }
    }
    public void darVuelta(){
    }
    
    private void generarCartas(){
        generarCartasNumerales();
        generarCartasFiguras();
        generarCartasJokers();
        
    }
    //Son 36 cartas Numerales
    private void generarCartasNumerales(){
        final int MIN_VALOR = 2;
        final int MAX_VALOR = 12;
        Palo[] palos = Palo.values();
        for (int p = 0; p < palos.length; p++) {
            Palo paloActual = palos[p];
            for (int i = MIN_VALOR; i <= MAX_VALOR; i++) {
                this.cartas.add(new CartaNumeral(i,paloActual));
            
        }
        
        
            
        }
    }
    //Son 16 Cartas Figuras
    private void generarCartasFiguras(){
        char[] letras = {'A','J','Q','K'};
        Palo[] palos = Palo.values();
        for (int p = 0; p < palos.length; p++) {
            Palo paloActual = palos[p];
            for (int i = 0; i < letras.length; i++) {
                char letraActual = letras[i];
                this.cartas.add(new CartaFigura(letraActual,paloActual));
                
            }
            
        }
    
    }
    // 2 Cartas Joker Color y nocolor
    private void generarCartasJokers(){
        this.cartas.add(new CartaJoker(true));
        this.cartas.add(new CartaJoker(false));
    
    }
    
    
    
    
}
