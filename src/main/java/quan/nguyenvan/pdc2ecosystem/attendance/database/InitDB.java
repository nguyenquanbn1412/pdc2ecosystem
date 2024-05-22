package quan.nguyenvan.pdc2ecosystem.attendance.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import quan.nguyenvan.pdc2ecosystem.attendance.utils.file.IFileReader;

@Configuration
public class InitDB implements CommandLineRunner {
    @Autowired
    private IFileReader fileReader;

    @Override
    public void run(String... args) throws Exception {
        EmployeeDB.employee = fileReader.readFile("employees.json");

        System.out.println("Total = " + EmployeeDB.employee.size());
    }
}
