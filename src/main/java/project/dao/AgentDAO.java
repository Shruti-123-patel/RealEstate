package project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import project.beans.agent;

@Component
public class AgentDAO {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Autowired
	SessionFactory factory;

	public AgentDAO() {
		super();
	}
	
	@Transactional
	public List<agent> listAvailableAgents() {

		List<agent> AgentList = this.hibernateTemplate.loadAll(agent.class);
//		System.out.println(CustomerList.get(0));
		return AgentList;
	}
	
	@Transactional
	public List<agent> listAvailableAgentByName(String name) {

		Session session = this.factory.getCurrentSession();
		List<agent> AgentList = session.createQuery("from agent where name like '%" + name+"%'").list();

		return AgentList;
	}
	
	@Transactional
	public agent getAgentById(int id) {

		Session session = this.factory.getCurrentSession();
		List<agent> AgentList = session.createQuery("from agent where id=" + id).list();
		agent j=AgentList.get(0);
		return j;
	}
	
	@Transactional
	public void Remove(int id) {
		Session session = this.factory.getCurrentSession();
		List<agent> AgentList = session.createQuery("from agent where id =" + id).list();
		agent c=AgentList.get(0);
		this.hibernateTemplate.delete(c);  
	}
	
	@Transactional
	public void Add(agent a) {
		
		this.hibernateTemplate.saveOrUpdate(a);  
	}
	
//	@Transactional
//	public void update(agent a) {
//		
//		this.hibernateTemplate.saveOrUpdate(a);  
//	}
	
}
