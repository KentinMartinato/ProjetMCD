package monprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import monprojet.entity.Participation;

public interface ParticipationRepository extends JpaRepository<Participation,Integer> {
@Query(value = "SELECT SUM(Participation.pourcentage) AS pourcentageTotal "
+"From Participation "
+"INNER JOIN Employe ON Participation.contributeur_matricule = Employe.matricule "
+"Where Employe.matricule = :matriculeEmp",
nativeQuery = true)
public Integer getImplication(Integer matriculeEmp);
}
