package Modele.Service;

import Modele.Entity.Category;
import Modele.Entity.Model;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/beans.xml" })
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
@Transactional
public class ModelsServiceTest {
    @Test
    public void getSessionFactory() throws Exception {

    }

    @Test
    public void setSessionFactory() throws Exception {

    }

    @Test
    public void addCategory() throws Exception {

    }

    @Test
    public void getAllCategories() throws Exception {

    }

    @Test
    public void findByIdCategory() throws Exception {

    }

    @Test
    public void findByNazwa() throws Exception {

    }

    @Test
    public void deleteCategory() throws Exception {

    }

    @Test
    public void addModel() throws Exception {

    }

    @Test
    public void getAllModels() throws Exception {

    }

    @Test
    public void findByIdModel() throws Exception {

    }

    @Test
    public void findByProd() throws Exception {

    }

    @Test
    public void deleteModel() throws Exception {

    }

    @Test
    public void getAllCategoryModel() throws Exception {

    }

    @Test
    public void addCategoryToModel() throws Exception {

    }
}
