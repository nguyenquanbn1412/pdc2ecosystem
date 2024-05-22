package quan.nguyenvan.pdc2ecosystem.attendance.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import quan.nguyenvan.pdc2ecosystem.attendance.dao.EmployeeDAO;
import quan.nguyenvan.pdc2ecosystem.attendance.model.Employee;
import quan.nguyenvan.pdc2ecosystem.attendance.utils.file.IFileReader;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private IFileReader fileReader;

    @Override
    public List<Employee> getAllEmployees() {
        return fileReader.readFile("employees.json");
    }

    @Override
    public Employee getProductById(int id) {
        return getAllEmployees().stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Employee> getProductsByNamePrefix(String prefix) {
        return getAllEmployees().stream()
                .filter(product -> product.getLastName().startsWith(prefix))
                .collect(Collectors.toList());
    }


}
