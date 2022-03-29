 package project.dao;

import project.beans.ResidentialBuilding;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class HouseFetchDao {

    private SessionFactory Factory;

    public HouseFetchDao(SessionFactory Factory) {
        this.Factory = Factory;
    }

//    Gett All Houses
    public List<ResidentialBuilding> getAllHouses() {
        Session s = this.Factory.openSession();
        Query query = s.createQuery("from com.learn.mycart.entites.ResidentialBuilding");
        List<ResidentialBuilding> list = query.list();
        return list;
    }
}
