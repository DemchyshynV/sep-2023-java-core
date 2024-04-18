package hw2.task1;

public class Main {
    public static void main(String[] args) {
        User user = new User(
                1,
                "Max",
                "max1",
                "max@gmail.com",
                new Address(
                        "street",
                        "kshfksh",
                        "lviv",
                        "79000",
                        new Geo(
                                "12.22",
                                "44,44"
                        )
                ),
                "54545445454",
                "admin.com",
                new Company(
                        "BigBird",
                        "kdhfdhf",
                        "jdjd"
                )
        );

        System.out.println(user);
    }
}
