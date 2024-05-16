import java.util.*;

public class Numbers {
    //## Задание 1
//
//Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
//Код должен работать с любой последовательностью и объемом списка чисел.
    public String oddNumber(List<Integer> numbers) {
        String result = "";
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                result = result + " " + numbers.get(i);
            }
        }
        System.out.println(numbers);
        return result;
    }

    //    ## Задание 2
//    Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
//    Код должен работать с любой последовательностью и объемом списка чисел.
    public String evenNumber(List<Integer> numbers) {
        String result = "";
        Set<Integer> evenNums = new TreeSet<>();

//    System.out.println("numbers = " + numbers);
        for (Integer number : numbers) {
            if (number % 2 == 0)
                evenNums.add(number);
        }
        for (Integer evenNum : evenNums) result = result + " " + evenNum;

        return result;
    }
    //## Задание 3

    //Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли.
    //  Код должен работать с любой последовательностью и объемом списка слов.


}
