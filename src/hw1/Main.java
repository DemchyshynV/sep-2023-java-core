package hw1;

//Загальне: всі поля класу приватні, додати гетери сетери (не використовуючи ломбок)
//
//- закінчити опис класів Car,Dog,Book (файли знаходяться в цій папці)
//створити 5 об'єктів класу, покласти в маисв/ліст, проітерувати та вивести в консоль
//
//        - створити клас, який би описував подібні об'єкти
//https://jsonplaceholder.typicode.com/posts/1
//створити 5 об'єктів класу, покласти в маисв/ліст, проітерувати та вивести в консоль
//
//        - створити клас, який би описував подібні об'єкти
//https://jsonplaceholder.typicode.com/comments/1
//створити 5 об'єктів класу, покласти в маисв/ліст, проітерувати та вивести в консоль
public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("book1", 200, new String[]{"author1", "author2"}, "comedy"),
                new Book("book2", 225, new String[]{"author3", "author4"}, "comedy"),
                new Book("book3", 354, new String[]{"author9", "author7"}, "comedy"),
        };

        for (Book book : books) {
            System.out.println(book);
        }

        Car[] cars = new Car[]{
                new Car("BMW", 250, 2.2, true),
                new Car("KIA", 200, 1.6, true),
                new Car("AUDI", 212, 2.0, false),
        };

        for (Car car : cars) {
            System.out.println(car);
        }

        Comment[] comments = new Comment[]{
                new Comment(1,2,"comment", "admin@gmail.com", "some text"),
                new Comment(2,2,"comment2", "admin2@gmail.com", "some t22222ext"),
        };

        for (Comment comment : comments) {
            System.out.println(comment);
        }

        Dog[] dogs = new Dog[]{
                new Dog("Max", 2, "husky"),
                new Dog("Bober", 5, "husky"),
        };

        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        Post [] posts = new Post[]{
                new Post(1,2,"title", "body"),
                new Post(2,2,"title2", "bodydfd"),
                new Post(3,2,"title3", "bodydfdfdfdfdf"),
        };

        for (Post post : posts) {
            System.out.println(post);
        }
    }
}
