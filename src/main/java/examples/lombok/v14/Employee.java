package examples.lombok.v14;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

record Employee(UUID id,
                String name,
                LocalDate dateOfBirth,
                double salary,
                boolean active,
                List<String> skills,
                String metadata1,
                String metadata3,
                String metadata2) {

//
//    public Employee(UUID id, String name, LocalDate dateOfBirth, double salary, boolean active, List<String> skills) {
//        this(id, name, dateOfBirth, salary, active, skills, null, null, null);
//    }
//
//    public Employee(UUID id, String name, LocalDate dateOfBirth, double salary, boolean active, List<String> skills, String metadata1) {
//        this(id, name, dateOfBirth, salary, active, skills, metadata1, null, null);
//    }
//
//    public Employee(UUID id, String name, LocalDate dateOfBirth, double salary, boolean active, List<String> skills, String metadata1, String metadata2) {
//        this(id, name, dateOfBirth, salary, active, skills, metadata1, metadata2, null);
//    }
}
