package hw4.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Max", 15, Gender.MALE),
                new User("Kamila", 30, Gender.FEMALE),
                new User("Mark", 20, Gender.MALE),
                new User("Olha", 25, Gender.FEMALE)
        );

        users.sort(Comparator.comparingInt(User::getAge));
        users.sort((o1, o2) -> o2.getAge()-o1.getAge());
        users.sort(Comparator.comparingInt(o -> o.getName().length()));
        users.sort((o1, o2) -> o2.getName().length()-o1.getName().length());
//        System.out.println(users);
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("mouse");
        words.add("window");
        words.add("hp");
        words.add("pen");
        words.add("bird");
        words.sort(String::compareTo);
        words.sort(Comparator.reverseOrder());
        System.out.println(words);
    }
}
