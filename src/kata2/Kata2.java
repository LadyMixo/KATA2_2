
package kata2;

import java.util.HashMap;


public class Kata2 {

    public static void main(String[] args) {

        int[] vector = {1, 1, 3, 4, 5, 6, 8, 9, 100,7, 7, -4};
        Histogram mihisto = new Histogram(vector);

            
        HashMap <Integer,Integer> histogram= mihisto.getHisto();
    
        
        for (int key: histogram.keySet()){
            System.out.println(key + "-->"+histogram.get(key));
        }
    }
}

