package models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;


    // All всі дії які ми проводимо з юзером будуть відбуватись і з профайлом
    // Persist якщо ми зберігаємо в базу юзера то це потрібно зробити і з його Profile
    // Merge якщо ми оновлюємо юзера то це потрібно зробити і з його профайлом
    // Remove Detach це однакове і означає що якщо ми якщо ми видаляємо юзера то це потрібно зробити і з профайлом

    @OneToOne(mappedBy = "person", cascade = CascadeType.PERSIST)
    private Address address;
}
