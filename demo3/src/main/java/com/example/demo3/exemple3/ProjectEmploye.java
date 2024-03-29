package com.example.demo3.exemple3;



import jakarta.persistence.*;

@Entity
@Table(name = "project_employee")
public class ProjectEmploye {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Emplo employee;

    private Double charge;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Emplo getEmployee() {
        return employee;
    }

    public void setEmployee(Emplo employee) {
        this.employee = employee;
    }

    public Double getCharge() {
        return charge;
    }

    public void setCharge(Double charge) {
        this.charge = charge;
    }
}

