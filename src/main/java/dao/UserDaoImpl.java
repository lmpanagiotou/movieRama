package dao;

import entities.User;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
@Local({UserDao.class})
public class UserDaoImpl implements UserDao {

    @PersistenceContext(unitName = "movierama")
    private EntityManager em;

    @Override
    public List<User> findAllUsers() {
        Query query = em.createQuery("select m from " + User.class.getSimpleName() + " m");
        return query.getResultList();
    }

}
