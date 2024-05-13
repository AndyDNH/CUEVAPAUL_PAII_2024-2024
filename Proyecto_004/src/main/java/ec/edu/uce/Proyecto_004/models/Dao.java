package ec.edu.uce.Proyecto_004.models;

public interface Dao<T> {

	void save(T t);
    T get(int id);
    void update(T t);
    void delete(T t);
}
