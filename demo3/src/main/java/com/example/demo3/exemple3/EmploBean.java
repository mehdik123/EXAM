package com.example.demo3.exemple3;


import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.ViewScoped;
import jakarta.persistence.*;

import java.util.List;

@ManagedBean
@ViewScoped
public class EmploBean {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("mehdiPersistence");
    EntityManager em = emf.createEntityManager();

    private List<Emplo> employes;

    public List<Emplo> getEmployes() {
        if (employes == null) {
            TypedQuery<Emplo> query = em.createQuery("SELECT e FROM Emplo e", Emplo.class);
            employes = query.getResultList();
        }
        return employes;
    }

    public void setEmployes(List<Emplo> employes) {
        this.employes = employes;
    }

    public void removeEmplo(Emplo emplo) {
        em.remove(emplo);
        employes.remove(emplo);
    }
}
