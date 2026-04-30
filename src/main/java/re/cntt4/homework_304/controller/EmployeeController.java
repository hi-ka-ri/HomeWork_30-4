package re.cntt4.homework_304.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import re.cntt4.homework_304.repository.EmployeeRepository;

@Controller
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employees")
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        return "employees-list";
    }
}