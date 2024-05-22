package quan.nguyenvan.pdc2ecosystem.attendance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quan.nguyenvan.pdc2ecosystem.attendance.dao.EmployeeDAO;
import quan.nguyenvan.pdc2ecosystem.attendance.model.Employee;
import quan.nguyenvan.pdc2ecosystem.attendance.service.EmployeeService;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    public Employee getProductById(int id) {
        return employeeDAO.getProductById(id);
    }

    @Override
    public List<Employee> getProductsByNamePrefix(String prefix) {
        return employeeDAO.getProductsByNamePrefix(prefix);
    }


}
