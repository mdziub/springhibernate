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

    @Override
    @SuppressWarnings("unchecked")
    public List<Category> getAllCategories() {
        return sessionFactory
                .getCurrentSession()
                .getNamedQuery("category.all")
                .list();
    }

    @Override
    public Category findByIdCategory(Long id) {
        return (Category) sessionFactory
                .getCurrentSession()
                .get(Category.class,id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Category findByNazwa(String nazwa) {
        return (Category) sessionFactory
                .getCurrentSession()
                .getNamedQuery("category.byNazwa")
                .setString("name",nazwa)
                .uniqueResult();
    }

    @Override
    public void deleteCategory(Category category) {
        category = (Category) sessionFactory.getCurrentSession()
                .get(Category.class,category.getId());
        //fetchtype lazy here
        if(category.getModels()!=null)
            for (Model model:category.getModels()){
                model.setCategory(null);
                sessionFactory.getCurrentSession().update(model);

            }
        sessionFactory.getCurrentSession().delete(category);

    }

    @Override
    public Long addModel(Model model) {
        return null;
    }

    @Override
    public List<Model> getAllModels() {
        return null;
    }

    @Override
    public Model findByIdModel(Long id) {
        return null;
    }

    @Override
    public Model findByProd(String prod) {
        return null;
    }

    @Override
    public void deleteModel(Model model) {

    }

    @Override
    public List<Model> getAllCategoryModel(Long idCategory) {
        return null;
    }

    @Override
    public void addCategoryToModel(Long idCategory, Long idModel) {

    }


}