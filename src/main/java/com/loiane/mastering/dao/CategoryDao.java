package com.loiane.mastering.dao;

import com.loiane.mastering.model.Category;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDao extends AbstractDao<Integer, Category>{

    public List<Category> findAll() {
        Criteria criteria = createEntityCriteria();

        return (List<Category>) criteria.list();
    }
}
