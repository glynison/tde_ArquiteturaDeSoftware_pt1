package factory;

public class Navio implements ITransporte {

    @Override
    public String entregar() {
        return "NAVIO: Entrega por mar, em contâiners.";
    }
    
}
