package examples.lombok.v1;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

class EmployeeOriginal {

    private UUID id;
    private String name;
    private LocalDate dateOfBirth;
    private double salary;
    private boolean active;
    private List<String> skills;

    public EmployeeOriginal() {}
    
    public EmployeeOriginal(UUID id, String name, LocalDate dateOfBirth, double salary, boolean active, List<String> skills) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.active = active;
        this.skills = skills;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
