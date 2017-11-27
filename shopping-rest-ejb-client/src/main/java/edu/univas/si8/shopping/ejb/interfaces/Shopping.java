package edu.univas.si8.shopping.ejb.interfaces;

public interface Shopping {
	void createNewProduct(String productName);

	String[] listProductNames();

}
