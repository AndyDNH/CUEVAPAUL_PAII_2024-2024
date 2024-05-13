package ec.edu.uce.Proyecto_004;

import org.hibernate.Session;

import ec.edu.uce.Proyecto_004.models.Dao;

public class HibernateDao<T> implements Dao<T> {

    private Class<T> type;

    public HibernateDao(Class<T> type) {
        this.type = type;
    }

    @Override
    public void save(T t) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.persist(t);
            session.getTransaction().commit();
        }
    }

    @Override
    public T get(int id) {
        T result;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            result = session.get(type, id);
            session.getTransaction().commit();
        }
        return result;
    }

    @Override
    public void update(T t) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.update(t);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(T t) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.delete(t);
            session.getTransaction().commit();
        }
    }
}


