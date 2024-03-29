package com.example.demo3.exemple3;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.ViewScoped;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import java.util.List;

@ManagedBean
@ViewScoped
@Named("affectationBean")
public class AffectationBean {

    private String selectedEmployee;
    private String projectName;
    private int implication;
    private List<Emplo> employeeList;  // Liste des employés à charger dans le formulaire

    public AffectationBean() {
        loadEmployeeList();
    }

    // Méthode pour charger la liste des employés depuis la base de données
    private void loadEmployeeList() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mehdiPersistence");
        EntityManager em = emf.createEntityManager();
        TypedQuery<Emplo> query = em.createQuery("SELECT e FROM Emplo e", Emplo.class);
        employeeList = query.getResultList();
        em.close();
        emf.close();
    }

    // Méthode pour affecter les données dans la base de données
    public void affecter() {

    }

    public String getSelectedEmployee() {
        return selectedEmployee;
    }

    public void setSelectedEmployee(String selectedEmployee) {
        this.selectedEmployee = selectedEmployee;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getImplication() {
        return implication;
    }

    public void setImplication(int implication) {
        this.implication = implication;
    }

    public List<Emplo> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Emplo> employeeList) {
        this.employeeList = employeeList;
    }
}
