package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiftTest {
    @Test
    public void testAddAndRemoveRidersBeyondCapacity() {
        Lift l = new Lift(42);
        l.addRiders(99);
        l.removeRider();
        int n = l.getNumRiders();
        assertEquals(9, n);
    }

    @Test
    public void tesAddRiders() {
        Lift l = new Lift(5);
        l.addRiders(2);
        assertFalse(l.isFull());
    }

    @Test
    public void test2() {
        Lift l = new Lift(5);
        assertEquals(5, l.getTopFloor());
    }

    @Test
    public void test3() {
        Lift l = new Lift(5);
        assertEquals(0, l.getCurrentFloor());
    }

    @Test
    public void test4() {
        Lift l = new Lift(5, 10);
        assertEquals(10, l.getCapacity());
    }

    @Test
    public void test5() {
        Lift l = new Lift(5);
        assertEquals(0, l.getNumRiders());
    }

    @Test
    public void test6() {
        Lift l = new Lift(5);
        l.goUp();
        assertEquals(1, l.getCurrentFloor());
    }

    @Test
    public void test7() {
        Lift l = new Lift(5);
        l.goUp();
        l.goDown();
        assertEquals(0, l.getCurrentFloor());
    }

    @Test
    public void test8() {
        Lift l = new Lift(5);
        l.call(5);
        assertEquals(5, l.getCurrentFloor());
        l.call(1);
        assertEquals(1, l.getCurrentFloor());
    }












}