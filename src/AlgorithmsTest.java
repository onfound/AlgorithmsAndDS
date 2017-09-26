import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlgorithmsTest {

    @Test
    void searchMaxSubArrayTest() {
        //Тест №1:
        int[] inputListTest1 = new int[]{ 1, 2, -3, -7, 8, 6, -20, 7, 0, 8, 1, -3, 11, -2, 0, 5, 48};
        List<Integer> outputListTest1 = Arrays.asList(7, 0, 8, 1, -3, 11, -2, 0, 5, 48);

        //Тест №2:
        int[] inputListTest2 = new int[]{-3, -4, -100};
        List<Integer> outputListTest2 = Collections.emptyList();

        //Тест №3:
        int[] inputListTest3 = new int[]{};
        List<Integer> outputListTest3 = Collections.emptyList();

        //Тест №4:
        int[] inputListTest4 = new int[]{1, 2, 3, 6, -100, 10};
        List<Integer> outputListTest4 = Arrays.asList(1, 2, 3, 6);

        //Тест №5:
        int[] inputListTest5 = new int[]{1, 2, 3, 6, -1, -1, -1, 100, -40, -1, -3, -5, 10, 40, 0, 0};
        List<Integer> outputListTest5 = Arrays.asList(1, 2, 3, 6, -1, -1, -1, 100, -40, -1, -3, -5, 10, 40);

        //Тест №6:
        int[] inputListTest6 = new int[]{1, 2, 3, 6, -1, -1, -1, 100, -101, -1, -3, -5, 10, 40, 0, 0};
        List<Integer> outputListTest6 = Arrays.asList(1, 2, 3, 6, -1, -1, -1, 100);

        //Тест №7:
        int[] inputListTest7 = new int[]{1, 2, 3, 6, -1, -1, -1, 100, -121, -1, -3, -5, 10, 400, -30, 40};
        List<Integer> outputListTest7 = Arrays.asList(10, 400, -30, 40);

        //Тест №8:
        int[] inputListTest8 = new int[]{1, 2, 20000, -20003, 1000000, 5, -4, 5, 6};
        List<Integer> outputListTest8 = Arrays.asList(1, 2, 20000, -20003, 1000000, 5, -4, 5, 6);

        //Тест №9:
        int[] inputListTest9 = new int[]{-3,-5,-6,-4,5,-10,-76,1};
        List<Integer> outputListTest9 = Collections.singletonList(5);

        //Тест №10:
        int[] inputListTest10 = new int[]{-3,-1,4,-5,2,-7,-11};
        List<Integer> outputListTest10 = Collections.singletonList(4);

        //Тест №11:
        int[] inputListTest11 = new int[]{-3,-1,4,7-5,-3,-7,11};
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