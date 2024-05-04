package models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String city;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private Person person;
}