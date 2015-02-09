
package br.com.nicolasviana.model.dao;

import java.io.Serializable;
import org.hibernate.Session;

/**
 *
 * @author Boina Preta
 */
public class GenericDAO<T> implements Serializable{
    
    private Session session;
    
    public GenericDAO(Session session) {
        super();
        this.session = session;
    }
    
    public void save(T entity){
        session.save(entity);
    }
    
    public void update(T entity){
        session.update(entity);
    }
    
    public void remove(T entity){
        session.delete(entity);
    } 
    
}
