package turistguide1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import turistguide1.Model.TouristAttraction;
import turistguide1.repository.TouristRepository;

@Service
public class TouristService {
    // This class is a service class that is used to be the middle man between the controller and the database(Repository).
    // so i will now implement the CRUD operations in this class that use the repository to do the operations


    //create. add a tourist attraction to the list
    public void addTouristAttraction(TouristAttraction Attraction){
        TouristRepository.addTouristAttraction(Attraction);
    }
}
