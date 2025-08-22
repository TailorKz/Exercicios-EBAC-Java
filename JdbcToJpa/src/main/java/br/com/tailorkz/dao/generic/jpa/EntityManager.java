package main.java.br.com.tailorkz.dao.generic.jpa;

import main.java.br.com.tailorkz.dao.Persistente;
import main.java.br.com.tailorkz.domain.jpa.VendaJpa;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.sql.Connection;

public class EntityManager {
    public <T extends Persistente> void persist(T entity) {
    }

    public Connection getTransaction() {
    }

    public <T extends Persistente> void remove(T entity) {
    }

    public <T extends Persistente> T merge(T entity) {
    }

    public CriteriaBuilder getCriteriaBuilder() {
    }

    public TypedQuery<VendaJpa> createQuery(CriteriaQuery<VendaJpa> query) {
    }
}
