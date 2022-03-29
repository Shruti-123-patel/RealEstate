package project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import project.beans.Customer;
import project.beans.availableProduct;

@Component
public class CustomerDAO {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Autowired
	SessionFactory factory;

	public CustomerDAO() {
		super();
	}
	
	@Transactional
	public List<Customer> listAvailableCustomer() {

		List<Customer> CustomerList = this.hibernateTemplate.loadAll(Customer.class);
//		System.out.println(CustomerList.get(0));
		return CustomerList;
	}
	
	@Transactional
	public List<Customer> listAvailableCustomerByName(String name) {

		Session session = this.factory.getCurrentSession();
		List<Customer> CustomerList = session.createQuery("from Customer where Name like '%" + name+"%'").list();

		return CustomerList;
	}
	
	@Transactional
	public void Remove(int id) {
		Session session = this.factory.getCurrentSession();
		List<Customer> CustomerList = session.createQuery("from Customer where custId =" + id).list();
		Customer c=CustomerList.get(0);
		this.hibernateTemplate.delete(c);  
	}
	
	@Transactional
	public void Update(Customer c) {
		this.hibernateTemplate.saveOrUpdate(c);  
	}
	
	@Transactional
	public Customer getCustomerById(int i) {
		Session session = this.factory.getCurrentSession();
		List<Customer> CustomerList = session.createQuery("from Customer where custId =" + i).list();
		Customer c=CustomerList.get(0); 
		return c;
	}

}
