package com.loiane.mastering.controller;

import com.loiane.mastering.model.Menu;
import com.loiane.mastering.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MenuController extends BaseController {

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/menu/", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> listAll() {
        List<Menu> list = menuService.findAll();
        return getReturn(list);
    }
}
