package dao;

import entities.Movie;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
@Local({MovieDao.class})
public class MovieDaoImpl implements MovieDao{

    @PersistenceContext(unitName = "movierama")
    private EntityManager em;

    public List<Movie> findAllMovies(){
        Query query = em.createQuery("select m from " + Movie.class.getSimpleName() + " m");
        return query.getResultList();
    }

}
