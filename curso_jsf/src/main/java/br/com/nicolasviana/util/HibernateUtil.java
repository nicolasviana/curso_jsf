
package br.com.nicolasviana.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.service.spi.ServiceRegistryImplementor;

/**
 *
 * @author Boina Preta
 */
public class HibernateUtil {
    
    private static final SessionFactory sessionFactory;
    
    public static final String HIBERNATE_SESSION = "hibernate_session";
    
    static {
        try {
            System.out.println("Tentando abrir um session factory...");
            Configuration configuration = new Configuration().configure();
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            System.out.println("Session Factory aberta com sucesso !");
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
}
