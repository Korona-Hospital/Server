package CoronaProject.Corona;

import org.springframework.data.mongodb.repository.MongoRepository;




public interface EmployeeRepo
        extends MongoRepository<EmployeeModel, String>

    {
    }
