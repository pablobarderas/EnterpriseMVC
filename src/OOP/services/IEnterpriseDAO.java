package OOP.services;

import java.util.List;

import OOP.entity.Departments;
import OOP.entity.Enterprise;
import OOP.entity.Persona;

// TODO
public interface IEnterpriseDAO {
    // necesitamos devolver la lista de todos los empleados
    // por parametro pasamos la empresa donde quiero buscar los empleados
    // lo hacemos asi porque no tenemos ningun metodo de persistencia de datos
    public List<Persona> getAllEmployees(Enterprise enterprise);

    public List<Persona> getEmployeesByDepartment(Departments department, Enterprise enterprise);

    public Persona getEmployeeByDni(String dni, Enterprise enterprise);

    public Persona getEmployeeByID(int id, Enterprise enterprise);

}
