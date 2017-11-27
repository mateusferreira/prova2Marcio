package br.edu.univa.si8.shopping.ejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.univa.si8.shopping.ejb.entities.Product;
import edu.univas.si8.shopping.ejb.interfaces.Shopping;

@Stateless

public class ProductDAO {
	@PersistenceContext(unitName = "shopping")
	private EntityManager em;

	public void insert(Product product) {
		em.persist(product);
	}

	public List<Product> listAll() {
		return em.createQuery("from shopping_order p", Product.class).getResultList();
	}

}
