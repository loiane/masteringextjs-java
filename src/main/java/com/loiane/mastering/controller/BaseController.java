package com.loiane.mastering.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BaseController {


    protected Map<String, Object> successReturn(List list){

        Map<String, Object> map = new HashMap<String, Object>(3);

        map.put("success", true);
        map.put("total", (list != null) ? list.size() : 0);
        map.put("data", list);

        return map;
    }

    protected ResponseEntity<Map<String, Object>> getReturn(List list){

        if(list.isEmpty()){
            return new ResponseEntity<Map<String, Object>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Map<String, Object>>(this.successReturn(list), HttpStatus.OK);
    }
}
