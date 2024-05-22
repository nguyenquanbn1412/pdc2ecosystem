package quan.nguyenvan.pdc2ecosystem.attendance.service;

import quan.nguyenvan.pdc2ecosystem.attendance.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getProductById(int id);
    List<Employee> getProductsByNamePrefix(String prefix);
}
