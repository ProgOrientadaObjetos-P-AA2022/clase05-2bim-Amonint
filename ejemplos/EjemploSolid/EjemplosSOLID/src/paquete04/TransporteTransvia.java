package paquete04;

public class TransporteTransvia extends Transporte {

    private String Transvia;

    public void establecerTransvia(String n) {
        Transvia = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 2.00 + 0.20;
    }

    public String obtenerCooperativaBus() {
        return Transvia;
    }

}
