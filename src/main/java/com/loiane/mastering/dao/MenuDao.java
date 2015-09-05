package com.loiane.mastering.dao;

import com.loiane.mastering.model.Menu;
import org.hibernate.Criteria;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("menuDao")
public class MenuDao extends AbstractDao<Integer, Menu>{

    public List<Menu> findModules() {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.isNull("menuId"));

        return (List<Menu>) criteria.list();
    }

    public List<Menu> findModuleItems(long menuId) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("menuId",menuId));

        return (List<Menu>) criteria.list();
    }
}
