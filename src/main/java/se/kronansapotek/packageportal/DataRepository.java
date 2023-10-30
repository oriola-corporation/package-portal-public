package se.kronansapotek.packageportal;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class DataRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    void persist(String in, boolean res) {
        this.entityManager
                .createNativeQuery("INSERT INTO data VALUES(?1, ?2)")
                .setParameter(1, in)
                .setParameter(2, res)
                .executeUpdate();
    }


}
