/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteTransvia transvia = new TransporteTransvia();
        transvia.setNombreTransvia("EL polvo");
        transvia.setarifa();

        
        TiposTransporte tipos = new TiposTransporte();
        ArrayList<Transporte> listado = new ArrayList<>();
        listado.add(bus);
        listado.add(taxi);
        tipos.obtenerTransportes();
        tipos.obtenerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f", 
                tipos.obtenerPromedioTarifas());
        
    }
}
