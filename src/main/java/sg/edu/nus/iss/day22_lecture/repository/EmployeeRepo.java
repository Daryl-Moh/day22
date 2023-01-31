package sg.edu.nus.iss.day22_lecture.repository;

import java.util.List;

import sg.edu.nus.iss.day22_lecture.model.Employee;

public interface EmployeeRepo {

    List<Employee> retrieveEmployeeList();

}
