package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.model.Employee;
import com.bridgelabz.employeepayrollapp.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    private final EmployeeService service;

    public EmployeePayrollController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Employee create(@Valid @RequestBody EmployeeDTO dto) {
        return service.createEmployee(dto);
    }

    @GetMapping("/get")
    public List<Employee> getAll() {
        return service.getAllEmployees();
    }

    @GetMapping("/get/{id}")
    public Employee getById(@PathVariable Long id) {
        return service.getEmployeeById(id);
    }

    @PutMapping("/update/{id}")
    public Employee update(@PathVariable Long id, @Valid @RequestBody EmployeeDTO dto) {
        return service.updateEmployee(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteEmployee(id);
        return "Employee deleted successfully with id: " + id;
    }
}
