package com.tailorkz.main.Dao;

import com.tailorkz.main.Domain.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProdutoDao implements IProdutoDao {

    private static final EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("ExemploJPA");

    @Override
    public Produto cadastrar(Produto produto) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(produto);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

        return produto;
    }
}
