package com.loiane.mastering.service;

import com.loiane.mastering.dao.ActorDao;
import com.loiane.mastering.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ActorService {

    @Autowired
    private ActorDao actorDao;

    public List<Actor> findAll(){
        return actorDao.findAll();
    }
}
