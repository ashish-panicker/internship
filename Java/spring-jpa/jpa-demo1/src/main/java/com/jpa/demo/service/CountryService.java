package com.jpa.demo.service;

import java.util.List;

import com.jpa.demo.model.Country;
import com.jpa.demo.util.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CountryService {

    private Transaction transaction;

    public void create(Country country) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.getTransaction();
        transaction.begin();
        session.save(country);
        transaction.commit();
        session.close();

    }

    public void update(String countryCode, Country country){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            
            Country exisingCountry = session.get(Country.class, countryCode);
            exisingCountry.setCountryName(country.getCountryName());

            session.getTransaction().begin();
            session.saveOrUpdate(exisingCountry);
            session.getTransaction().commit();

        }
    }

    public void delete(String countryCode){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            
            session.getTransaction().begin();
            Country exisingCountry = session.get(Country.class, countryCode);
            session.delete(exisingCountry);
            session.getTransaction().commit();

        }
    }

    public List<Country> findAll(){
        List<Country> countries = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            countries = session.createQuery("from Country", Country.class).getResultList();
        }
        return countries;
    }

    public Country findOne(String countryName){
        Country country = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            country = session.createQuery("from Country c where c.countryCode = :code", Country.class)
                            .setParameter("code", countryName)
                            .uniqueResult();
        }
        
        return country;
    }

    public void shutdown(){
        HibernateUtil.shutdown();
    }

}
