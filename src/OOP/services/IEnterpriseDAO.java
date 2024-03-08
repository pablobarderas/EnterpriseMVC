package OOP.services;

import java.util.List;

import OOP.entity.Departments;
import OOP.entity.Enterprise;
import OOP.entity.Persona;

// TODO
public interface IEnterpriseDAO {

    public List<Persona> getEmployeesByDepartment(Departments department, Enterprise enterprise);

    public Persona getEmployeeByDni(String dni, Enterprise enterprise);

    public Persona getEmployeeByID(int id, Enterprise enterprise);
}
