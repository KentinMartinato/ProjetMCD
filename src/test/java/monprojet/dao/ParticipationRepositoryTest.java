package monprojet.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


@Log4j2 
@DataJpaTest
class ParticipationRepositoryTest {
    
@Autowired    
    private ParticipationRepository participationDAO;

    @Test        
    void pourcentageDImplication(){
        log.info("On vérifie l'implication d'employé dans un projet");
        int implication = participationDAO.getImplication(2);
        assertEquals(implication, 80, "L'implication est de 80%");
    }
}
