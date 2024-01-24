package Method_all_package;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> lijst1 = new LinkedList<>();
        lijst1.add(1);
        lijst1.add(2);
        lijst1.add(3);
        lijst1.add(4);
        lijst1.add(5);
        ArrayList<Integer> lijst2 = new ArrayList<>();
        lijst2.add(1);
        lijst2.add(2);
        lijst2.add(9);
        lijst2.add(8);
        lijst2.add(7);
        TreeSet<Integer> lijst3 = new TreeSet<>();
        lijst3.add(1);
        lijst3.add(2);
        lijst3.add(6);
        lijst3.add(7);
        lijst3.add(9);
        lijst3.addAll(lijst1);
        lijst3.addAll(lijst2);
        System.out.println(lijst3);

        lijst1.removeAll(lijst2);
        System.out.println(lijst1); //tegenstrijdig met volgende blok code

        lijst2.retainAll(lijst1);
        System.out.println(lijst2); //tegenstrijdig met vorige blok code

    }
}
