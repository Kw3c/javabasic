package org.example.encap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DancerTest {
    @Test
    void danceTest() {
        Dancer dancer = new Dancer("크루이름",Grade.HIGH,"노홍철");
        dancer.dance();
        dancer.setHeight(180);
        System.out.println("dancer = " + dancer );
    }
}