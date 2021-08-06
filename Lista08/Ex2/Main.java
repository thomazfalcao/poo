import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Thomaz");
        al.add("Monteiro");
        al.add("Falcão");
        System.out.println(al);

        Set<String> hs = new HashSet<>(al);
        System.out.println(hs);

        PriorityQueue<String> pq = new PriorityQueue<>(hs);
        System.out.println(pq);

        TreeSet<String> ts = new TreeSet<>(pq);
        System.out.println(ts);
    }
}

//Porque no hashset os elementos não são ordenados, entretando, sua busca é a mais eficiente em comparação às demais estruturas, tendo complexidade O(1).
