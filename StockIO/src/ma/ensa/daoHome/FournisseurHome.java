package ma.ensa.daoHome;
// Generated 18 déc. 2016 21:13:47 by Hibernate Tools 5.2.0.CR1

import java.util.List;
import ma.ensa.model.*;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Fournisseur.
 * @see ma.ensa.model.Fournisseur
 * @author Hibernate Tools
 */
public class FournisseurHome {

	private static final Log log = LogFactory.getLog(FournisseurHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Fournisseur transientInstance) {
		log.debug("persisting Fournisseur instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Fournisseur instance) {
		log.debug("attaching dirty Fournisseur instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Fournisseur instance) {
		log.debug("attaching clean Fournisseur instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Fournisseur persistentInstance) {
		log.debug("deleting Fournisseur instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Fournisseur merge(Fournisseur detachedInstance) {
		log.debug("merging Fournisseur instance");
		try {
			Fournisseur result = (Fournisseur) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Fournisseur findById(java.lang.Integer id) {
		log.debug("getting Fournisseur instance with id: " + id);
		try {
			Fournisseur instance = (Fournisseur) sessionFactory.getCurrentSession().get("ma.ensa.model.Fournisseur",
					id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Fournisseur instance) {
		log.debug("finding Fournisseur instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("ma.ensa.model.Fournisseur")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}