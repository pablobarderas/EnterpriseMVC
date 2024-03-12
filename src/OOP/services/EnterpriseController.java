package OOP.services;

import java.util.ArrayList;
import java.util.List;

import OOP.entity.Departments;
import OOP.entity.Enterprise;
import OOP.entity.Persona;

public class EnterpriseController implements IEnterpriseDAO {

    @Override
    public List<Persona> getAllEmployees(Enterprise enterprise) {
        // TODO Auto-generated method stub
        //siempre que podamos en vez de devolver la lista que tenemos creamos y devolvemos una nueva
        return new ArrayList<>(enterprise.getEmployees());
    }

    
    @Override
    public Persona addPersona(Persona persona,Enterprise enterprise) {
        // TODO Auto-generated method stu
        //creamos una nuerva persona con la persona que tenemos por parametro
        Persona newPersona = persona;
        enterprise.getEmployees().add(newPersona);
        return persona;
    }


    @Override
    public List<Persona> getEmployeesByDepartment(Departments department, Enterprise enterprise) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmployeesByDepartment'");
    }

    @Override
    public Persona getEmployeeByDni(String dni, Enterprise enterprise) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmployeeByDni'");
    }

    @Override
    public Persona getEmployeeByID(int id, Enterprise enterprise) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmployeeByID'");
    }

    
}
