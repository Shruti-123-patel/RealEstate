package project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import project.beans.*;

@Component
public class ProductDAO{
	
		

		@Autowired
		HibernateTemplate hibernateTemplate;
		
		@Autowired
		SessionFactory factory;
		
		public ProductDAO() {
			super();
			
		}


		@Transactional
		public void adHospital(Hospital p,String oid) {
			Integer id=Integer.parseInt(oid);
			ownerDetails o=hibernateTemplate.get(ownerDetails.class, id);
			p.setOwner(o);
			hibernateTemplate.save(p);
		}
		
		@Transactional
		public void adVilla(Villa p,String oid) {
			Integer id=Integer.parseInt(oid);
			ownerDetails o=hibernateTemplate.get(ownerDetails.class, id);
			p.setOwner(o);
			hibernateTemplate.save(p);
		}
		
		@Transactional
		public void adOffice(Office p,String oid) {
			Integer id=Integer.parseInt(oid);
			ownerDetails o=hibernateTemplate.get(ownerDetails.class, id);
			p.setOwner(o);
			hibernateTemplate.save(p);
		}
		
		@Transactional
		public void adResidentialBuilding(ResidentialBuilding p,String oid) {
			Integer id=Integer.parseInt(oid);
			ownerDetails o=hibernateTemplate.get(ownerDetails.class, id);
			p.setOwner(o);
			hibernateTemplate.save(p);
		}
		
		@Transactional
		public void adComplex(Complex p,String oid) {
			Integer id=Integer.parseInt(oid);
			ownerDetails o=hibernateTemplate.get(ownerDetails.class, id);
			p.setOwner(o);
			hibernateTemplate.save(p);
		}
		
		
		@Transactional
		public void updateHospital(Hospital p) {
//			Session session = this.sessionFactory.getCurrentSession();
//			session.update(p);
//			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("springDispatcher-servlet.xml");
//			hibernateTemplate=(HibernateTemplate) context.getBean("hibernateTemplate");
			this.hibernateTemplate.update(p);
		}
		
		@Transactional
		public void updateComplex(Complex p) {
			this.hibernateTemplate.update(p);
		}
		
		@Transactional
		public void updateVilla(Villa p) {
			this.hibernateTemplate.update(p);
		}
		
		@Transactional
		public void updateOffice(Office p) {
			this.hibernateTemplate.update(p);
		}
		
		@Transactional
		public void updateResidentialBuilding(ResidentialBuilding p) {
			this.hibernateTemplate.update(p);
		}
		
		@Transactional
		public List<availableProduct> listAvailableProducts() {
			
//			Session session = this.sessionFactory.getCurrentSession();
//			List<Product> ProductsList = session.createQuery("from availableProduct").list();
//			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("springDispatcher-servlet.xml");
//			hibernateTemplate=(HibernateTemplate) context.getBean("hibernateTemplate");
			List<availableProduct> ProductsList = this.hibernateTemplate.loadAll(availableProduct.class);
			System.out.println(ProductsList.get(0));
			return ProductsList;
		}
		
		@Transactional
		public List<Product> listProducts(int pid,String name) {
			Session session = this.factory.getCurrentSession();
			
			System.out.println("got the name");
			List<Product> ProductsList = session.createQuery("from "+name).list();
			
//			availableProduct obj=this.hibernateTemplate.get(availableProduct.class,pid);
//			String name=obj.getName();
//			
//			List<Product> ProductsList = this.hibernateTemplate.find();
			
			
			return ProductsList;
		}

//		@Override
//		@Transactional
//		public void removeProduct(int id,int pid) {
//			Session session = this.factory.getCurrentSession();
//			Product p = (Product) session.load(Product.class, id);
//			if(null != p){
//				session.delete(p);
//			}
//			logger.info("Product deleted successfully, Product details="+p);
//		}
			@Transactional
			public String getProductById(int pid) {
				availableProduct name_=this.hibernateTemplate.get(availableProduct.class,pid);
				String name=name_.getName();
				return name;
			}
			
			@Transactional
			public Product findProduct(int pid,String classs) {
				Session session = this.factory.getCurrentSession();
				System.out.println("hello!!");
				List<Product> ProductsList = session.createQuery("from "+classs+" where Id="+pid).list();
				System.out.println("Shruti");
				Product p=ProductsList.get(0);
				return p;
			}
			
	}
