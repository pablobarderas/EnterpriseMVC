package OOP.services;

import java.util.List;

import OOP.entity.Departments;
import OOP.entity.Enterprise;
import OOP.entity.Persona;

public class EnterpriseController implements IEnterpriseDAO {

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
