package services;

import dao.MovieDao;
import dao.ReactionDao;
import dao.UserDao;
import dto.MovieDto;
import entities.Movie;
import entities.Reaction;
import entities.User;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class Service {

    @EJB
    private UserDao userDao;
    @EJB
    private MovieDao movieDao;
    @EJB
    private ReactionDao reactionDao;

    public List<MovieDto> retrieveAllMovies() {
        List<MovieDto> allMovies = new ArrayList<>();
        List<Movie> moviesFromDB = movieDao.findAllMovies();

        for (Movie movie : moviesFromDB) {
            MovieDto movieDto = new MovieDto();
            movieDto.setTitle(movie.getTitle());
            movieDto.setDescription(movie.getDescription());
            movieDto.setNumberOfHates(countReactions(movie, false));
            movieDto.setNumberOfLikes(countReactions(movie, true));
            movieDto.setPublicationDate(movie.getDate());
            movieDto.setUser(retrieveNameFromUser(movie.getUser()));
            allMovies.add(movieDto);
        }
        return allMovies;
    }

    private int countReactions(Movie movie, boolean isLike) {
        int count = 0;
        List<Reaction> allReactions = movie.getReactions();
        for (Reaction reaction: allReactions) {
            if (isLike && reaction.isLove() == isLike) {
                count++;
            } else if (!isLike && reaction.isHate() != isLike) {
                count++;
            }
        }
        return count;
    }

    private String retrieveNameFromUser(User user) {
        return user.getName() + " " + user.getSurname();
    }

}
