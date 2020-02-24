package Discrete.Tests;

import Discrete.Set;
import Discrete.SortedSet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedSetTest {

    SortedSet<String> A;

    @Before
    public void doThings() {
        A = new SortedSet<>();

        A.add("A");
        A.add("B");
        A.add("C");
        A.add("D");
        A.add("E");
    }

    @Test
    public void verifyContains() {
        assertTrue(A.contains("A"));
        assertTrue(A.contains("B"));
        assertTrue(A.contains("C"));
        assertTrue(A.contains("D"));
        assertTrue(A.contains("E"));
    }

    @Test
    public void verifyAdd() {
        A.add("A");
        A.remove("A");

        assertFalse(A.contains("A"));

        A.add("A");

        assertTrue(A.contains("A"));
    }
}
