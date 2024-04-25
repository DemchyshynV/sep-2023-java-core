package hw5.autopark;

import java.util.Arrays;
import java.util.List;

/*
Створити не менше 7 та не більше 20 машинок.
Зробили половині автопарку ремонт мотору,
 що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
Після того в масиві цих автівок зробити перевірку досвіду ВСІХ наших водіїв.
Якщо досвід водія менший за 5 років, але його вік більший за 25,
 то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто
Все через stream API
*/
public class Main {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("BMW", 200.0, new Owner("Max", 45, 3), 20000, 2000),
                new Car("KIA", 180.0, new Owner("Kiril", 18, 5), 15000, 2005),
                new Car("OKA", 200.0, new Owner("Olha", 25, 10), 2000, 2010),
                new Car("AUDI", 200.0, new Owner("Kokos", 35, 2), 5000, 2001)
        );

//        cars.stream().filter(car -> cars.indexOf(car)<cars.size()/2).forEach(car -> car.setPower(car.getPower()+car.getPower()*0.1));
//        cars.stream().filter(car -> car.getOwner().getAge()>25&&car.getOwner().getExp()<5)
//                        .forEach(car -> car.getOwner().setExp(car.getOwner().getExp()+1));
//        System.out.println(cars);
        Integer sum = cars.stream().map(Car::getPrice).reduce(0, Integer::sum);
        System.out.println(sum);

    }
}
