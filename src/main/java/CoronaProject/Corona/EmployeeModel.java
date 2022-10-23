package CoronaProject.Corona;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "employees")


public class EmployeeModel {
    @Id
    private String id;
    private String fullName	;
    private String ts	;
    private String city	;
    private String street  ;
    private int houseNumber ;
    private String bornDate	;
    private String mobilePhone	;
    private String  phone ;
    private DetailsCoronaVirusModel detailsCoronaVirus ;
}


