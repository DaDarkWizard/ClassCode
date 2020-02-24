package Discrete;

import java.util.ArrayList;

public class PowerSets {
    //Let's start with an int
    public static <T> void PowerSet(UnsortedSet<T> input) {

        boolean done = false;

        while (!done) {
            ArrayList<UnsortedSet<UnsortedSet<T>>> unsortedSets = new ArrayList<>();

            UnsortedSet<UnsortedSet<T>> empty = new UnsortedSet<>();
            empty.add(new UnsortedSet<>());

            unsortedSets.add(empty);

            UnsortedSet<UnsortedSet<T>> one = new UnsortedSet<>();

            for(int i = 0; i < input.size(); i++) {
                UnsortedSet<T> newUnsortedSet = new UnsortedSet<>();
                newUnsortedSet.add(input.get(i));
                one.add(newUnsortedSet);
            }

            unsortedSets.add(one);

            for(int i = 2; i < input.size(); i++) {
                for(int j = 0; j < input.size(); j++) {
                    UnsortedSet<T> newUnsortedSet;
                    for(int k = 0; k < unsortedSets.get(i-1).size(); k++) {
                        //newUnsortedSet = unsortedSets.get(i-1).get(k).clone();
                    }
                }
            }
        }

    }
}
