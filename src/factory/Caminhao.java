package factory;

public class Caminhao implements Transporte {

    @Override
    public String entregar() {
        return "CAMINHÃO: Entrega por terra, dentro de caixas.";
    }
    
}
