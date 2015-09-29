package kata2;

public class CalculaHisto {

    public static <T> Histogram <T> computeHistogram (T [] vector){ // primera T: metodo generico, segunda T: resultado clase generica, T: argumento genérico
        
        Histogram<T> histo = new Histogram<>();
        
        for (T key : vector) {
            histo.increment(key);
        }
        return histo;
    }
}
