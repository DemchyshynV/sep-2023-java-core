package hw5;

import java.util.Arrays;
import java.util.List;

/*
створити ArrayList зі словами на 15-20 елементів.
- відсортувати його за алфавітом .
*-- відфільтрувати слова довжиною менше 4 символів

- Створити масив з 20 числами.
- за допомогою способу sorted відсортувати масив.
-- за допомогою filter отримати числа кратні 3
-- за допомогою filter отримати числа кратні 10
-- перебрати (проітерувати) масив за допомогою foreach()
-- перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші
*/
public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "window",
                "apple",
                "pen",
                "notebook"
        );
//        List<String> list = words.stream().sorted(String::compareTo).toList();
//
//        System.out.println(list);
//        List<String> list = words.stream().filter(s -> s.length() < 4).toList();
//        System.out.println(list);

        List<Integer> list = Arrays.asList(2, 6, 4, 99, -23, 56, 32, 1, 7, 4, 0);
//        List<Integer> list1 = list.stream().sorted().toList();
//        List<Integer> list1 = list.stream().filter(a -> a % 3 == 0).toList();
//        List<Integer> list1 = list.stream().filter(a -> a % 10 == 0).toList();
//        System.out.println(list1);
//        list.forEach(System.out::println);

        List<Integer> list1 = list.stream().map(a -> a * 3).toList();
        System.out.println(list1);
    }
}
