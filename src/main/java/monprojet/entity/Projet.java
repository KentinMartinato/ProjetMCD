package monprojet.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Projet {
 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;

    @NonNull
    private String nom;

    @NonNull
    private LocalDate debut;

    @NonNull
    private LocalDate fin;

    @ManyToMany 
    List<Employe> contributeur;

}
