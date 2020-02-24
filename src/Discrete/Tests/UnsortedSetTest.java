package Discrete.Tests;

import Discrete.UnsortedSet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnsortedSetTest {
    @Test
    public void testEquals() {
        UnsortedSet<Integer> a = new UnsortedSet<>();
        a.add(1);
        a.add(2);

        UnsortedSet<Integer> b = new UnsortedSet<>();
        b.add(2);
        b.add(1);

        assertEquals("Sets are equal: ", true, a.equals(b));
    }

    @Test
    public void testSetEquals() {
        UnsortedSet<Object> a = new UnsortedSet<>(new Object[]{new UnsortedSet<Integer>(new Integer[]{0,1}), 2});

        UnsortedSet<Object> b = new UnsortedSet<>(new Object[]{new UnsortedSet<Integer>(new Integer[]{1,0}), 2});

        assertEquals("Sets are equal: ", true, a.equals(b));
    }
}
