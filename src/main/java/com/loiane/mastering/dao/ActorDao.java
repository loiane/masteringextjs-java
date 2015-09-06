package com.loiane.mastering.dao;

import com.loiane.mastering.model.Actor;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ActorDao extends AbstractDao<Integer, Actor>{

    public List<Actor> findAll() {
        Criteria criteria = createEntityCriteria();

        return (List<Actor>) criteria.list();
    }
}
