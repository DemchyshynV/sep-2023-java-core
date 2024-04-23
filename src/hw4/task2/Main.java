package hw4.task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<>();
        users.add(
                new User(
                        "Max",
                        "Popov",
                        "popov@gmail.com",
                        15,
                        Gender.MALE,
                        Arrays.asList(
                                new Skill("js", 2),
                                new Skill("java", 6),
                                new Skill("python", 1),
                                new Skill("nodejs", 8),
                                new Skill("drf", 5)
                        ),
                        new Car("BMW", 2000, 200)
                )
        );

        users.add(
                new User(
                        "Karina",
                        "Popov",
                        "popov@gmail.com",
                        20,
                        Gender.FEMALE,
                        Arrays.asList(
                                new Skill("js", 2),
                                new Skill("nodejs", 8),
                                new Skill("drf", 5)
                        ),
                        new Car("BMW", 2000, 200)
                )
        );
        users.add(
                new User(
                        "Maksym",
                        "kdhfk",
                        "popov@gmail.com",
                        36,
                        Gender.MALE,
                        Arrays.asList(
                                new Skill("js", 2),
                                new Skill("java", 6),
                                new Skill("python", 1),
                                new Skill("drf", 5)
                        ),
                        new Car("BMW", 2000, 200)
                )
        );
        users.add(
                new User(
                        "Marina",
                        "Popov",
                        "popov@gmail.com",
                        35,
                        Gender.FEMALE,
                        Arrays.asList(
                                new Skill("js", 2)
                        ),
                        new Car("BMW", 2000, 200)
                )
        );

//        users.removeIf(user -> user.getGender()==Gender.MALE);
//        System.out.println(users);

        TreeSet<User> userTreeSet = new TreeSet<>(users);
        userTreeSet.add(
                new User(
                        "Max",
                        "Popov",
                        "popov@gmail.com",
                        15,
                        Gender.MALE,
                        Arrays.asList(
                                new Skill("js", 2),
                                new Skill("java", 6),
                                new Skill("python", 1),
                                new Skill("nodejs", 8),
                                new Skill("drf", 5)
                        ),
                        new Car("BMW", 2000, 200)
                )
        );

        userTreeSet.add(
                new User(
                        "Karina",
                        "Popov",
                        "popov@gmail.com",
                        20,
                        Gender.FEMALE,
                        Arrays.asList(
                                new Skill("js", 2),
                                new Skill("nodejs", 8),
                                new Skill("drf", 5)
                        ),
                        new Car("BMW", 2000, 200)
                )
        );
        userTreeSet.add(
                new User(
                        "Maksym",
                        "kdhfk",
                        "popov@gmail.com",
                        36,
                        Gender.MALE,
                        Arrays.asList(
                                new Skill("js", 2),
                                new Skill("java", 6),
                                new Skill("python", 1),
                                new Skill("drf", 5)
                        ),
                        new Car("BMW", 2000, 200)
                )
        );
        userTreeSet.add(
                new User(
                        "Marina",
                        "Popov",
                        "popov@gmail.com",
                        35,
                        Gender.FEMALE,
                        Arrays.asList(
                                new Skill("js", 2)
                        ),
                        new Car("BMW", 2000, 200)
                )
        );

        System.out.println(userTreeSet);
    }
}
