package project.dao;

import project.beans.Villa;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class VillaFetchDao {

    private SessionFactory Factory;

    public VillaFetchDao(SessionFactory Factory) {
        this.Factory = Factory;
    }

    public List<Villa> getAllVilla() {
        Session s = this.Factory.openSession();
        Query query = s.createQuery("from com.learn.mycart.entites.Villa");
        List<Villa> list = query.list();
        return list;
    }
}
