package TD5.ex8;
import java.util.Map;
import java.util.TreeMap;
public class Test {
    public static void main(String[] args) {
        Map<Integer, Sport> sportMap = new TreeMap<Integer, Sport>();
        Foot foot = new Foot(2, 1, 11);
        Natation natation = new Natation(200, 50);
        natation.ajoutListTime(55);
        natation.ajoutListTime(53);
        natation.ajoutListTime(45);

        PatinageArtistique artistique = new PatinageArtistique(10);
        sportMap.put(1, foot);
        sportMap.put(2, natation);
        sportMap.put(3, artistique);

        for (Sport x : sportMap.values()) {
            System.out.println(x.toString());
        }
    }
}
