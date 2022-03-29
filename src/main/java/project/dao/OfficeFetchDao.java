package project.dao;

import project.beans.Office;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class OfficeFetchDao {

    private SessionFactory Factory;

    public OfficeFetchDao(SessionFactory Factory) {
        this.Factory = Factory;
    }

    public List<Office> getAllOffice() {
        Session s = this.Factory.openSession();
        Query query = s.createQuery("from com.learn.mycart.entites.Office");
        List<Office> list = query.list();
        return list;
    }
}
