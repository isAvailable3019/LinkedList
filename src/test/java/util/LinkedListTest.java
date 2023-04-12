package util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
    @Test
    void test_not_null_1() {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            list.add(i);
        }
        Assertions.assertTrue(list.remove(Integer.valueOf(1)));
    }

    @Test
    void test_not_null_2() {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            list.add(i);
        }
        Assertions.assertFalse(list.remove(Integer.valueOf(11)));
    }

    @Test
    void test_null_1(){
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            list.add(i);
        }
        Assertions.assertFalse(list.remove(null));
    }

    @Test
    void test_null_2(){
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            list.add(i);
        }
        list.add(null);
        Assertions.assertTrue(list.remove(null));
    }
}
