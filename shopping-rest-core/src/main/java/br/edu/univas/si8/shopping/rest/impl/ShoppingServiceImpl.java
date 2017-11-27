package br.edu.univas.si8.shopping.rest.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.edu.univas.si8.shopping.rest.api.ShoppingService;
import edu.univas.si8.shopping.ejb.interfaces.Shopping;


@RequestScoped
public class ShoppingServiceImpl implements ShoppingService {
	@EJB(mappedName = "java:app/shopping-rest-ejb-0.1-SNAPSHOT/ShoppingBean!edu.univas.si8.shopping.ejb.interfaces.ShoppingRemote")
	private Shopping shopping;

	@Override
	public String[] listProductNames() {
		return shopping.listProductNames();
	}

	@Override
	public String saveNewProduct(String name) {
		shopping.createNewProduct(name);
		return "{\"message\": \"Success\"}";
	}

}
