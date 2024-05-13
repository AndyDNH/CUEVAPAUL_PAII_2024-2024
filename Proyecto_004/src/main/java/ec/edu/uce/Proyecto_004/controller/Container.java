package ec.edu.uce.Proyecto_004.controller;

import java.util.HashMap;
import java.util.Map;

import ec.edu.uce.Proyecto_004.HibernateDao;
import ec.edu.uce.Proyecto_004.models.Dao;
import ec.edu.uce.Proyecto_004.models.Students;
import ec.edu.uce.Proyecto_004.models.Subjects;

public class Container {
	
	
	private Map<Class<?>, HibernateDao<?>> daos = new HashMap<>();

    public <T> void createAndSaveEntity(Class<T> entityClass, T entity) {
        HibernateDao<T> dao = (HibernateDao<T>) daos.get(entityClass);
        if (dao == null) {
            throw new IllegalArgumentException("No DAO registered for " + entityClass);
        }
        dao.save(entity);
    }
    
    public <T> T getEntityById(Class<T> entityClass, int id) {
        HibernateDao<T> dao = (HibernateDao<T>) daos.get(entityClass);
        if (dao == null) {
            throw new IllegalArgumentException("No DAO registered for " + entityClass);
        }
        return dao.get(id);
    }

    public <T> void updateEntity(Class<T> entityClass, T entity) {
        HibernateDao<T> dao = (HibernateDao<T>) daos.get(entityClass);
        if (dao == null) {
            throw new IllegalArgumentException("No DAO registered for " + entityClass);
        }
        dao.update(entity);
    }

    public <T> void deleteEntity(Class<T> entityClass, int id) {
        HibernateDao<T> dao = (HibernateDao<T>) daos.get(entityClass);
        if (dao == null) {
            throw new IllegalArgumentException("No DAO registered for " + entityClass);
        }
        T entity = dao.get(id);
        if (entity != null) {
            dao.delete(entity);
        }
    }
    

    public void registerDao(Class<?> entityClass, HibernateDao<?> dao) {
        daos.put(entityClass, dao);
    }
	
	
	
	
//	Dao<Students> studentsDao = new HibernateDao<>(Students.class);
//	Dao<Subjects> subjectsDao = new HibernateDao<>(Subjects.class);
//	
//	Subjects testSubject = new Subjects();
//
//	public void save(Students students) {
////		students.setName("Ringo");
////		students.setLastName("Star");
////		students.setAge(17);
//		studentsDao.save(students);
//	}
	

}
