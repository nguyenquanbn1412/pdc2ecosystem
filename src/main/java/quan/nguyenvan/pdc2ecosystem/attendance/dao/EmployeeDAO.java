package quan.nguyenvan.pdc2ecosystem.attendance.dao;

import quan.nguyenvan.pdc2ecosystem.attendance.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
    Employee getProductById(int id);
    List<Employee> getProductsByNamePrefix(String prefix);
}
