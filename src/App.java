import factory.TransporteFactory;
import factory.Transporte;

public class App {
    public static void main(String[] args) throws Exception {

        Transporte caminhao = TransporteFactory.veiculo("Caminhão");
        System.out.println(caminhao.entregar());

        Transporte navio = TransporteFactory.veiculo("Navio");
        System.out.println(navio.entregar());

        Transporte bicicleta = TransporteFactory.veiculo("Bicicleta");
        System.out.println(bicicleta.entregar());
    }

}
    /** 
     * Saída no terminal:
     * CAMINHÃO: Entrega por terra, dentro de caixas.
     * NAVIO: Entrega por mar, em contâiners.
     * MAGRELA: Entrega por terra, em pequenos embrulhos.
    */
    