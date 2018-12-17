import java.util.HashMap;
import java.util.Map;

public class kata2 {

    public static void main(String[] args) {

        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};

        Histogram histo = new Histogram(data);
        Map<String, Integer> histogr = histo.getHistogram();

        for (String key : histogr.keySet()) {
            System.out.println(key + " ==> " + histogr.get(key));
        }
    }
}