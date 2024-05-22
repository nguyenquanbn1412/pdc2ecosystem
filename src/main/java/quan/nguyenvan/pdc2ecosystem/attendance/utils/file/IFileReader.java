package quan.nguyenvan.pdc2ecosystem.attendance.utils.file;


import quan.nguyenvan.pdc2ecosystem.attendance.model.Employee;

import java.util.List;

public interface IFileReader {
    List<Employee> readFile(String filePath);
}