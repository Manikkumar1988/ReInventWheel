import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mani on 25/04/18.
 */
public class MyMain {
    public static void main(String[] args) {
        System.out.print("a");

        ArrayList<String> testList = new ArrayList<>(10);
        System.out.print(testList.size());

        for(int i=0;i<500;i++)
            testList.add(String.valueOf(i));

        /*List<String> result = testList.stream()
                .map(x -> multiplyByTwo(x))
                .filter(x -> customFilter(x))
                .collect(Collectors.toList());

        System.out.print(result);*/



        System.out.print(testList.indexOf("1"));
    }

    private static String multiplyByTwo(String x) {
        return String.valueOf(Integer.valueOf(x)*3);
    }

    private static boolean customFilter(String x) {
        return (Integer.valueOf(x)%2==0);
    }
}
