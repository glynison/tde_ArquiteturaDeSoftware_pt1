package factory;

public class Caminhao implements ITransporte {

    @Override
    public String entregar() {
        return "CAMINHÃO: Entrega por terra, dentro de caixas.";
    }
    
}
