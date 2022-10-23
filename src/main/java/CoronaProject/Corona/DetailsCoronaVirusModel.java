package CoronaProject.Corona;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "songs")

public class DetailsCoronaVirusModel {
    private String vaccinationDateA	;
    private String vaccinationDateB	;
    private String vaccinationDateC	;
    private String vaccinationDateD	;
    private String manufacturerVaccineA	;
    private String manufacturerVaccineB	;
    private String manufacturerVaccineC	;
    private String manufacturerVaccineD	;
    private String positiveResultDate	;
    private String recoveryDate ;
}
