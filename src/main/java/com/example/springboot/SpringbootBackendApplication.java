package com.example.springboot;

import com.example.springboot.model.Employee;
import com.example.springboot.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    private EmployeeRepository employeeRepository;

    public SpringbootBackendApplication(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Employee employee = new Employee();
//        employee.setFirstName("Beytullah");
//        employee.setLastName("Zor");
//        employee.setEmailId("@beytullahzor7@gmail.com");
//        employeeRepository.save(employee);
//
//        Employee employee2 = new Employee();
//        employee2.setFirstName("James");
//        employee2.setLastName("Cena");
//        employee2.setEmailId("@jamescena@gmail.com");
//        employeeRepository.save(employee2);
    }
}
