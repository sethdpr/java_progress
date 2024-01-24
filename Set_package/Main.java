package Set_package;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Persoon> namen = new TreeSet<>();
        namen.add(new Persoon(1, "mozes"));
        namen.add(new Persoon(2, "seth"));
        namen.add(new Persoon(3, "julie"));
        System.out.print(namen);
    }
}
