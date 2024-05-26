package test.java;

import main.java.Item;
import main.java.SILab2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class SILab2Test {

    @Test
    void everyBranchTest() {
        assertEquals(true,SILab2.checkCart(List.of(new Item("Darko","225118",10,0),new Item("Darko","0123",10000,30),new Item(null,"225118",10,0)),100000000));
        assertEquals(false,SILab2.checkCart(List.of(new Item("Darko","225118",10,0),new Item("Darko","0123",10000,30),new Item(null,"225118",10,1)),100));
        assertEquals(false, SILab2.checkCart(List.of(new Item("Darko", "225118", 10, 0), new Item("Darko", "0123", 10000, 30), new Item(null, "225118", 10, 0)), 100));
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item("darko", "darko", 1123, 0)), 100));
    }

    @Test
    void multipleConditionTest() {
        assertEquals(false, SILab2.checkCart(List.of(new Item("Darko","0000",1000000,22), new Item("Darko","225118",1010324,0), new Item("Darko","0000",299,10000),new Item("Darko","225118",225118,225118)),10));
    }
}
