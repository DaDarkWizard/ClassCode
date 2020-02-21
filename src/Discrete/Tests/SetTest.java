package Discrete.Tests;

import Discrete.Set;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetTest {
    @Test
    public void testEquals() {
        Set<Integer> a = new Set<>();
        a.add(1);
        a.add(2);

        Set<Integer> b = new Set<>();
        b.add(2);
        b.add(1);

        assertEquals("Sets are equal: ", true, a.equals(b));
    }

    @Test
    public void testSetEquals() {
        Set<Object> a = new Set<>(new Object[]{new Set<Integer>(new Integer[]{0,1}), 2});

        Set<Object> b = new Set<>(new Object[]{new Set<Integer>(new Integer[]{1,0}), 2});

        assertEquals("Sets are equal: ", true, a.equals(b));
    }
}
