import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithms {

    public static List<Integer> searchMaxSubArr(List<Integer> input) {
        int sum = 0;
        int temp = 0;
        int leftIndex = 0;
        int currentLeftIndex = 0;
        int rightIndex = -1;
        for (int i = 0; i < input.size(); i++) {
            int anInput = input.get(i);
            temp += anInput;
            if (temp > sum) {
                sum = temp;
                leftIndex = currentLeftIndex;
                rightIndex = i;
            }
            if (temp < 0) {
                temp = 0;
                currentLeftIndex = i + 1;
            }
        }
        return input.subList(leftIndex, rightIndex + 1);
    }
}
