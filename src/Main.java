import Discrete.*;

import java.time.format.TextStyle;

public class Main {
    public static void main(String[] args) {
        SortedSet<String> A = new SortedSet<>();
        A.add("Atlanta");
        A.add("Boston");
        A.add("Chicago");
        A.add("Denver");
        A.add("Los Angeles");
        A.add("Miami");
        A.add("New York");
        A.add("San Francisco");

        SortedRelation<String> R = new SortedRelation<>(A);

        R.add("Atlanta", "Boston");
        R.add("Boston", "Chicago");
        R.add("Chicago", "Denver");
        R.add("Denver", "Los Angeles");
        R.add("Los Angeles", "Miami");
        R.add("Miami", "New York");
        R.add("New York", "San Francisco");
        R.add("San Francisco", "Atlanta");

        System.out.println(Relations.toTikzGraph(R, 4));
    }
}
