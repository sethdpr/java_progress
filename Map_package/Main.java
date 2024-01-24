package Map_package;

import java.security.Key;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> zitplaatsen = new HashMap<>();
        zitplaatsen.put(3, "jan");
        zitplaatsen.put(6, "frans");
        zitplaatsen.put(8, "julie");
        zitplaatsen.put(1, "anny");
        zitplaatsen.put(1, "rik");
        zitplaatsen.put(2, "fran");
        zitplaatsen.put(3, "amou");
        printMap(zitplaatsen);
    }
    public static void printMap(HashMap<Integer, String> map){
        for (Integer key: map.keySet()){
            System.out.println("stoel: " + key + ": " + map.get(key));
        }
    }
}
