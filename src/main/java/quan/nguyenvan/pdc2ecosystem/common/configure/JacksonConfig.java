package quan.nguyenvan.pdc2ecosystem.common.configure;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class JacksonConfig {

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();

        // Register JavaTimeModule to support Java 8 date/time types
        JavaTimeModule javaTimeModule = new JavaTimeModule();

        // Register custom deserializer
        SimpleModule module = new SimpleModule();
        module.addDeserializer(LocalDateTime.class, new CustomLocalDateTimeDeserializer());

        objectMapper.registerModule(javaTimeModule);
        objectMapper.registerModule(module);
        return objectMapper;
    }
}
