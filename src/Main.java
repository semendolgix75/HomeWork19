import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Напишите код, с помощью которого можно напечатать только нечетные числа в консоль. ");
        List<Integer> nums = new ArrayList<>(List.of(100, -1, 26, 3, 48, 4578, 5, 5, 6, 7));
        Numbers numbers=new Numbers();
        System.out.println(numbers.oddNumber(nums));

        System.out.println("Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания. ");
        System.out.println(numbers.evenNumber(nums));




    }
}