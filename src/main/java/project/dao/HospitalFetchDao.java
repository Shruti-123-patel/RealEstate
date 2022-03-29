/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.dao;

import project.beans.Hospital;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

public class HospitalFetchDao {

    private SessionFactory Factory;

    public HospitalFetchDao(SessionFactory Factory) {
        this.Factory = Factory;
    }

    public List<Hospital> getAllHospital() {
        Session s = this.Factory.openSession();
        Query query = s.createQuery("from project.beans.Hospital");
        List<Hospital> list = query.list();
        return list;
    }
}
