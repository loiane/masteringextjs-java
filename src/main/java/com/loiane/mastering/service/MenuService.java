package com.loiane.mastering.service;

import com.loiane.mastering.dao.MenuDao;
import com.loiane.mastering.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("menuService")
@Transactional
public class MenuService {

    @Autowired
    private MenuDao menuDao;

    public List<Menu> findAll(){

        List<Menu> list = menuDao.findModules();

        for (Menu menu : list) {
            menu.setChildren(menuDao.findModuleItems(menu.getId()));
        }

        return list;
    }
}
