package Modele.Service;

import java.util.ArrayList;
import java.util.List;

import Modele.Entity.Category;
import Modele.Entity.Model;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
@Transactional
class ModelsService implements IModelsManager {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public Long addCategory(Category category) {
        category.setId(null);
        return (Long) sessionFactory.getCurrentSession()
                .save(category);
    }



}