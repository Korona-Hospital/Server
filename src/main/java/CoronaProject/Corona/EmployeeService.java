package CoronaProject.Corona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.data.domain.Example;
        import org.springframework.stereotype.Service;
        import java.util.ArrayList;
        import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private  EmployeeRepo e;

    EmployeeModel employee=new EmployeeModel("11","ttt","sere","iei","gre",6,"10/03/2022","8094802","80",new DetailsCoronaVirusModel("10/2/2019","10/2/2019","10/2/2019","10/2/2019","sahar","faizer","moderna","moderna","20/02/2021","27/02/2021"));
    List<EmployeeModel> list = new ArrayList<EmployeeModel>();

    public List<EmployeeModel> getAllEmployees() {
        return  e.findAll();
    }

    public void addEmployee(EmployeeModel s) {

        e.save(s);
    }

    public List<EmployeeModel> getById(String id) {
        return getAllEmployees().stream().filter((s)->s.getId().equals(id)).toList();

    }

    public void deleteEmployeeById(String id) {
        e.deleteById(id);
    }

    public EmployeeModel updateEmployee(EmployeeModel s) {
        e.save(s);
        return s;
    }


}