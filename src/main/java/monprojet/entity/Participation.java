package monprojet.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @ToString
@Entity
@Table(uniqueConstraints = {
@UniqueConstraint(columnNames = {"contributeur_matricule", "affectation_code"})})

public class Participation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String role;

    private float pourcentage;

    @ManyToOne(optional = false)
  private Projet affectation;
  @ManyToOne(optional = false)
  private Employe contributeur;

}
