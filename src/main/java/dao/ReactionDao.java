package dao;

import entities.Reaction;

import java.util.List;

public interface ReactionDao {

    List<Reaction> findAllReactions();

}
