package project.dao;

import java.util.List;

import project.beans.Product;
import project.beans.availableProduct;

public interface ProductDAOinterface {
	public void addProduct(Product p);
	public void updateProduct(Product p);
	public List<availableProduct> listAvailableProducts();
	public List<Product> listProducts(int pid);	
	public void removeProduct(int id,int pid);
}
