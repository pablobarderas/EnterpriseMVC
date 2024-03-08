package OOP.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Enterprise {
    private List<Persona> employees;
    private List<Departments> departments = new ArrayList<Departments>(Arrays.asList(Departments.values()));

    // Constructors
    public Enterprise() {

    }

    // Contructor
    public Enterprise(List<Persona> employees) {
        this.employees = employees;
    }

    // Getters and Setters
    public List<Persona> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Persona> employees) {
        this.employees = employees;
    }

    public List<Departments> getDepartments() {
        return departments;
    }

}
