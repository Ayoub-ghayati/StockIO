package ma.ensa.daoHome;
// Generated 18 déc. 2016 21:13:47 by Hibernate Tools 5.2.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import ma.ensa.model.*;
/**
 * Home object for domain model class BonDeLivraison.
 * @see ma.ensa.model.BonDeLivraison
 * @author Hibernate Tools
 */
public class BonDeLivraisonHome {

	private static final Log log = LogFactory.getLog(BonDeLivraisonHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(BonDeLivraison transientInstance) {
		log.debug("persisting BonDeLivraison instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(BonDeLivraison instance) {
		log.debug("attaching dirty BonDeLivraison instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BonDeLivraison instance) {
		log.debug("attaching clean BonDeLivraison instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(BonDeLivraison persistentInstance) {
		log.debug("deleting BonDeLivraison instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BonDeLivraison merge(BonDeLivraison detachedInstance) {
		log.debug("merging BonDeLivraison instance");
		try {
			BonDeLivraison result = (BonDeLivraison) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BonDeLivraison findById(java.lang.Integer id) {
		log.debug("getting BonDeLivraison instance with id: " + id);
		try {
			BonDeLivraison instance = (BonDeLivraison) sessionFactory.getCurrentSession()
					.get("ma.ensa.model.BonDeLivraison", id);
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

	public List findByExample(BonDeLivraison instance) {
		log.debug("finding BonDeLivraison instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("ma.ensa.model.BonDeLivraison")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
