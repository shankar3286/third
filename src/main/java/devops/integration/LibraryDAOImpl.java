package devops.integration;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import devops.business.Library;

public class LibraryDAOImpl implements LibraryDAO {
	private final Logger logger ;
	private SessionFactory sessionFactory ;
	private Session session ;
	
	public LibraryDAOImpl() {
		logger = LoggerFactory.getLogger( getClass() ) ;
		try {
			logger.info( "Opening connection" ); ;
			sessionFactory = new Configuration().configure( "hibernate.cfg.xml" ).buildSessionFactory() ;
			session = sessionFactory.openSession() ;
		} catch ( HibernateException e ) {
			logger.error( "Hibernate Exception", e ) ;
			System.exit( 1 ) ;
		}
	}
	public void close() {
		logger.info( "Closing connection" ) ;
		sessionFactory.close() ;
	}
	public Integer save( Library library) {
		session.beginTransaction() ;
		Integer id = (Integer) session.save( library ) ;
		session.getTransaction().commit() ;
		return id ;
	}
	public void delete( Library library ) {
		session.beginTransaction() ;
		session.delete( library  ) ;
		session.getTransaction().commit() ;
	}
	public List<Library> findAll() {
		return session.createQuery( "From Library", Library.class ).getResultList() ;
	}

	public List<Library> getDockerData() {
		
		return session.createQuery( "From Library", Library.class ).getResultList() ;
	}

	
}
