package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {

        // Integer[] vector = {1, 1, 3, 4, 5, 6, 8, 9, 100,7, 7, -4};
        String[] vector = {"Ana", "Juan", "Pedro", "Lucia", "Ana", "Juan", "Pedro", "Lucia"};

        Histogram <String> histogram = CalculaHisto.computeHistogram(vector);
        

        for (String key : histogram.keySet()) {
            System.out.println(key + "-->" + histogram.get(key));
        }
    }
}
