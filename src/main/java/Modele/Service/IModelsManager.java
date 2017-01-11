package Modele.Service;

import Modele.Entity.Category;
import Modele.Entity.Model;

import java.util.List;


public interface IModelsManager {
    Long addCategory(Category category);
    List<Category> getAllCategories();
    Category findByIdCategory(Long id);
    Category findByNazwa(String nazwa);
    void deleteCategory(Category category);



    Long addModel(Model model);
    List<Model> getAllModels();
    Model findByIdModel(Long id);
    Model findByProd(String prod);
    void deleteModel(Model model);

    List<Model> getAllCategoryModel(Long idCategory);
    void addCategoryToModel(Long idCategory,Long idModel);
}
