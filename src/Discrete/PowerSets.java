package Discrete;

import java.util.ArrayList;

public class PowerSets {
    //Let's start with an int
    public static <T> void PowerSet(Set<T> input) {

        boolean done = false;

        while (!done) {
            ArrayList<Set<Set<T>>> sets = new ArrayList<>();

            Set<Set<T>> empty = new Set<>();
            empty.add(new Set<>());

            sets.add(empty);

            Set<Set<T>> one = new Set<>();

            for(int i = 0; i < input.size(); i++) {
                Set<T> newSet = new Set<>();
                newSet.add(input.get(i));
                one.add(newSet);
            }

            sets.add(one);

            for(int i = 2; i < input.size(); i++) {
                for(int j = 0; j < input.size(); j++) {
                    Set<T> newSet;
                    for(int k = 0; k < sets.get(i-1).size(); k++) {
                        //newSet = sets.get(i-1).get(k).clone();
                    }
                }
            }
        }

    }
}
