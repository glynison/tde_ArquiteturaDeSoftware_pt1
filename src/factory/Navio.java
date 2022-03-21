package factory;

public class Navio implements Transporte {

    @Override
    public String entregar() {
        return "NAVIO: Entrega por mar, em contâiners.";
    }
    
}
