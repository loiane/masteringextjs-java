package com.loiane.mastering.service;

import com.loiane.mastering.dao.CategoryDao;
import com.loiane.mastering.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CategoryService {

    @Autowired
    private CategoryDao catgegoryDao;

    public List<Category> findAll(){
        return catgegoryDao.findAll();
    }
}
