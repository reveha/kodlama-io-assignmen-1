package com.languages.ProgramminLanguages.Entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="PL")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProgrammingLanguages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="NameOfLanguage")
    private String language;

    @Column(name="OOP or NOT")
    private Boolean OOP;

    @Column(name="UserNumber")
    private int userNumber;

}
