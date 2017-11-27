package br.edu.univa.si8.shopping.ejb.beans;


import java.util.Date;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.edu.univa.si8.shopping.ejb.dao.ProductDAO;
import br.edu.univa.si8.shopping.ejb.entities.Product;
import edu.univas.si8.shopping.ejb.interfaces.Shopping;
import edu.univas.si8.shopping.ejb.interfaces.ShoppingLocal;
import edu.univas.si8.shopping.ejb.interfaces.ShoppingRemote;

@Stateless
@Local(ShoppingLocal.class)
@Remote(ShoppingRemote.class)

public class ShoppingBean implements ShoppingLocal, ShoppingRemote{
	@EJB
	private ProductDAO dao;

	@Override
	public void createNewProduct(String productName) {
		Product product = new Product();
		product.setName(productName);
		product.setTempo(new Date());
		dao.insert(product);
	}

	@Override
	public String[] listProductNames() {
		return dao.listAll()
				.stream()
				.map(Product::getName)
				.collect(Collectors.toList())
				.toArray(new String[0]);
	}

}
