package factory;

public class TransporteFactory {

    public static ITransporte veiculo(String nomeVeiculo) {
        
        if (nomeVeiculo == "Caminhão") {
            return new Caminhao();            
        } else 
        
        if (nomeVeiculo == "Navio") {
            return new Navio();
        } else 
        
        if (nomeVeiculo == "Bicicleta") {
            return new Bicicleta();
        }

        return null;
    }
}