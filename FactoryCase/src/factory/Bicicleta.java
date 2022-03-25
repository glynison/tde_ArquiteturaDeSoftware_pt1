package factory;

public class Bicicleta implements ITransporte {

    @Override
    public String entregar() {
        return "MAGRELA: Entrega por terra, em pequenos embrulhos.";
    }
    
}
