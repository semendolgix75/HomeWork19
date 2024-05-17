import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Напишите код, с помощью которого можно напечатать только нечетные числа в консоль. ");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Numbers numbers=new Numbers();
        System.out.println(numbers.oddNumber(nums));

        System.out.println("Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания. ");
        System.out.println(numbers.evenNumber(nums));

        System.out.println("код, который выводит в консоль все уникальные слова из списка слов");
        List<String> words=new ArrayList<>(List.of("apple","limon","apple","watermelon","potato","limon"));
        System.out.println(numbers.unique(words));

        System.out.println("Напишите код, который выводит в консоль количество дублей для каждого уникального слова. ");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        numbers.numberDuplicates(strings);

    }
}