package hw2.task4;

public class Main {
    public static void main(String[] args) {
        User user = new User(
                1,
                "max",
                "popov",
                "admin@gmail.com",
                5,
                "Male",
                new Car("BMW", 200, 250)
        );

        user.getSkills().add(new Skill("js", 8));
        user.getSkills().add(new Skill("java", 9));
        user.getSkills().add(new Skill("python", 10));

        System.out.println(user);
    }


}
