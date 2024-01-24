package Queue_package;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> taken = new ArrayDeque<>();
        taken.add("taak 1");
        taken.add("taak 2");
        taken.add("taak 3");
        taken.add("taak 4");
        System.out.println("taak verwerken " + taken.removeFirst());
        System.out.println("taak verwerken " + taken.getFirst());
        System.out.println(taken);
    }
}
