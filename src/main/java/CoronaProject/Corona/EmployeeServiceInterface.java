package CoronaProject.Corona;


import java.util.List;

public interface EmployeeServiceInterface {
    public List<EmployeeModel> getAllEmployees() ;
    public void addEmployee(EmployeeModel s);
    public List<EmployeeModel> getById(String id);
    public void deleteEmployeeById(String id);
    public EmployeeModel updateEmployee(EmployeeModel s) ;
}
