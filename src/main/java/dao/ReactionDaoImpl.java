package dao;

import entities.Reaction;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
@Local({ReactionDao.class})
public class ReactionDaoImpl implements ReactionDao {

    @PersistenceContext(unitName = "movierama")
    private EntityManager em;

    @Override
    public List<Reaction> findAllReactions() {
        Query query = em.createQuery("select m from " + Reaction.class.getSimpleName() + " m");
        return query.getResultList();
    }

}
