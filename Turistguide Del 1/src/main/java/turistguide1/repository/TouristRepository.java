package turistguide1.repository;

import org.springframework.stereotype.Repository;
import turistguide1.Model.TouristAttraction;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    private  ArrayList<TouristAttraction> touristAttractionsList = new ArrayList<>();

    //create
    public void addTouristAttraction(TouristAttraction touristAttraction){
        touristAttractionsList.add(touristAttraction);
    }
    //read
    public List<TouristAttraction> getAllTouristAttractions() {
        return new ArrayList<>(touristAttractionsList);
    }


}


