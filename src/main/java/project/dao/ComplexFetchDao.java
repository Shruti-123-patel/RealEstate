package project.dao;

import project.beans.Complex;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class ComplexFetchDao {

    private SessionFactory Factory;

    public ComplexFetchDao(SessionFactory Factory) {
        this.Factory = Factory;
    }

//    Gett All Houses
    public List<Complex> getAllComplex()  {
        Session s = this.Factory.openSession();
        Query query = s.createQuery("from com.learn.mycart.entites.Complex");
        List<Complex> list = query.list();
        return list;
    }
}
