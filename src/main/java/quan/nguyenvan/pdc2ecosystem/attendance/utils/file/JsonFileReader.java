package quan.nguyenvan.pdc2ecosystem.attendance.utils.file;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Component;
import quan.nguyenvan.pdc2ecosystem.attendance.model.Employee;
import quan.nguyenvan.pdc2ecosystem.common.configure.JacksonConfig;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class JsonFileReader implements IFileReader {
    @Override
    public List<Employee> readFile(String filePath) {
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.registerModule(new JavaTimeModule());
        JacksonConfig jacksonConfig = new JacksonConfig();
        ObjectMapper objectMapper = jacksonConfig.objectMapper();
        try {
            List<Employee> books = objectMapper.readValue(new File(filePath), new TypeReference<List<Employee>>() {});
            return books;
        } catch (IOException e) {
            e.printStackTrace();
            return List.of();  // Trả về danh sách rỗng nếu có lỗi xảy ra
        }
    }
}