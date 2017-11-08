package Tests.homework1;

import homework1.Algorithms;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlgorithmsTest {

    @Test
    void searchMaxSubArrayTest() {
        //Тест №1:
        List<Integer> inputListTest1 = Arrays.asList( 1, 2, -3, -7, 8, 6, -20, 7, 0, 8, 1, -3, 11, -2, 0, 5, 48);
        List<Integer> outputListTest1 = Arrays.asList(7, 0, 8, 1, -3, 11, -2, 0, 5, 48);

        //Тест №2:
        List<Integer> inputListTest2 = Arrays.asList(-3, -4, -100);
        List<Integer> outputListTest2 = Collections.emptyList();

        //Тест №3:
        List<Integer> inputListTest3 = Collections.emptyList();
        List<Integer> outputListTest3 = Collections.emptyList();

        //Тест №4:
        List<Integer> inputListTest4 = Arrays.asList(1, 2, 3, 6, -100, 10);
        List<Integer> outputListTest4 = Arrays.asList(1, 2, 3, 6);

        //Тест №5:
        List<Integer> inputListTest5 = Arrays.asList(1, 2, 3, 6, -1, -1, -1, 100, -40, -1, -3, -5, 10, 40, 0, 0);
        List<Integer> outputListTest5 = Arrays.asList(1, 2, 3, 6, -1, -1, -1, 100, -40, -1, -3, -5, 10, 40);

        //Тест №6:
        List<Integer> inputListTest6 = Arrays.asList(1, 2, 3, 6, -1, -1, -1, 100, -101, -1, -3, -5, 10, 40, 0, 0);
        List<Integer> outputListTest6 = Arrays.asList(1, 2, 3, 6, -1, -1, -1, 100);

        //Тест №7:
        List<Integer> inputListTest7 = Arrays.asList(1, 2, 3, 6, -1, -1, -1, 100, -121, -1, -3, -5, 10, 400, -30, 40);
        List<Integer> outputListTest7 = Arrays.asList(10, 400, -30, 40);

        //Тест №8:
        List<Integer> inputListTest8 = Arrays.asList(1, 2, 20000, -20003, 1000000, 5, -4, 5, 6);
        List<Integer> outputListTest8 = Arrays.asList(1, 2, 20000, -20003, 1000000, 5, -4, 5, 6);

        //Тест №9:
        List<Integer> inputListTest9 = Arrays.asList(-3,-5,-6,-4,5,-10,-76,1);
        List<Integer> outputListTest9 = Collections.singletonList(5);

        //Тест №10:
        List<Integer> inputListTest10 = Arrays.asList(-3,-1,4,-5,2,-7,-11);
        List<Integer> outputListTest10 = Collections.singletonList(4);

        //Тест №11:
        List<Integer> inputListTest11 = Arrays.asList(-3,-1,4,7-5,-3,-7,11);
        List<Integer> outputListTest11 = Collections.singletonList(11);

        assertEquals(outputListTest1, Algorithms.searchMaxSubArr(inputListTest1));
        assertEquals(outputListTest2, Algorithms.searchMaxSubArr(inputListTest2));
        assertEquals(outputListTest3, Algorithms.searchMaxSubArr(inputListTest3));
        assertEquals(outputListTest4, Algorithms.searchMaxSubArr(inputListTest4));
        assertEquals(outputListTest5, Algorithms.searchMaxSubArr(inputListTest5));
        assertEquals(outputListTest6, Algorithms.searchMaxSubArr(inputListTest6));
        assertEquals(outputListTest7, Algorithms.searchMaxSubArr(inputListTest7));
        assertEquals(outputListTest8, Algorithms.searchMaxSubArr(inputListTest8));
        assertEquals(outputListTest9, Algorithms.searchMaxSubArr(inputListTest9));
        assertEquals(outputListTest10, Algorithms.searchMaxSubArr(inputListTest10));
        assertEquals(outputListTest11, Algorithms.searchMaxSubArr(inputListTest11));
    }

}