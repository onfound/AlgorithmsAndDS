import java.util.ArrayList;
import java.util.List;

public class Algorithms {

    public static List<Integer> searchMaxSubArr(int[] input) {
        int sum = 0;
        int temp = 0;
        List<Integer> result = new ArrayList<>();
        List<Integer> resultTemp = new ArrayList<>();
        for (int anInput : input) {
            resultTemp.add(anInput);
            temp += anInput;
            if (temp > sum){
                result.clear(); // for (int i = 0; i < size; i++)
                result.addAll(resultTemp);
                sum = temp;
            }
            if (temp < 0) {
                resultTemp.clear();
                temp = 0;
            }
        }
        return result;
    }
}
