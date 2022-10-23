package CoronaProject.Corona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;
        import java.util.ArrayList;
        import java.util.List;
        import java.awt.*;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("employees")

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @GetMapping("")
    public List<EmployeeModel> getAllSongs(){
        return employeeService.getAllEmployees();
    }
    @PostMapping("")
    public void addEmployee( @RequestBody EmployeeModel s){
        employeeService.addEmployee(s);
    }
    @GetMapping("/GetSpecificEmployeeById/{id}")
    public List<EmployeeModel> GetSpecificEmployeeById(@PathVariable String id){
        return employeeService.getById(id);
    }
    @RequestMapping(value = "/updateEmployee",method = RequestMethod.PUT)
    public EmployeeModel UpdateEmployee(@RequestBody EmployeeModel s){
        return employeeService.updateEmployee(s);
    }
    @DeleteMapping("/deleteEmployeeById/{id}")
    public void deleteEmployeeById(@PathVariable String id){
        employeeService.deleteEmployeeById(id);}




}

