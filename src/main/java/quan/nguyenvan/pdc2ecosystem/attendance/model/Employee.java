package quan.nguyenvan.pdc2ecosystem.attendance.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee {

     int id;
     String firstName;
     String lastName;
     String gender;
     LocalDateTime dateOfBirth;
     String address;
     String phone;
     LocalDateTime hireDate;
     LocalDateTime stopDate;
     String currentGroup;
     String currentGrade;
     String currentShift;
     String currentStatus;
     LocalDateTime maternityLeaveDate;
     LocalDateTime maternityComebackDate;
     LocalDateTime endEarlyComebackDate;
     String remark;
}
