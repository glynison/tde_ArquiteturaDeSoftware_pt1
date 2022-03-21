package factory;

public class Bicicleta implements Transporte {

    @Override
    public String entregar() {
        return "MAGRELA: Entrega por terra, em pequenos embrulhos.";
    }
    
}
