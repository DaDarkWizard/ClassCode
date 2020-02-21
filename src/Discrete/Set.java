package Discrete;

import java.util.ArrayList;

public class Set<T> extends ArrayList<T> implements Iterable<T> {

    public Set() {

    }

    public Set(T[] objects) {
        for(int i = 0; i < objects.length; i++) {
            this.add(objects[i]);
        }
    }

    @Override
    public boolean add(T thing) {
        if(!super.contains(thing)) {
            return super.add(thing);
        }
        return false;
    }

    @Override
    public boolean equals(Object thing) {
        try {
            Set<T> set = (Set<T>) thing;

            if(set.size() != this.size()) {
                return false;
            }

            for(T data : this) {
                if(!set.contains(data)) {
                    return false;
                }
            }

            return true;
        } catch (ClassCastException e) {
            return false;
        }
    }
}
