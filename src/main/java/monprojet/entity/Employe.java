package monprojet.entity;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringExclude;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Employe {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer matricule;

    @NonNull
    private String nom;

    @NonNull
    private String email;

    @ManyToMany (mappedBy = "contributeur")
    List<Projet> affectation;

    @ManyToOne
    private Employe superieur;
    
    @OneToMany(mappedBy = "superieur")
    private List<Employe> subordonnes = new LinkedList<>();
}
