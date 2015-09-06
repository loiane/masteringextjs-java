package com.loiane.mastering.controller;

import com.loiane.mastering.model.Actor;
import com.loiane.mastering.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ActorController extends BaseController {

    @Autowired
    private ActorService actorService;

    @RequestMapping(value = "/actor/", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> listAll() {
        List<Actor> list = actorService.findAll();
        return getReturn(list);
    }
}
