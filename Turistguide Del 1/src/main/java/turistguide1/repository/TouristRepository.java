package turistguide1.repository;

import org.springframework.stereotype.Repository;
import turistguide1.Model.TouristAttraction; //added import of TouristAttraction for it to work
import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    private  ArrayList<TouristAttraction> touristAttractionsList = new ArrayList<>();

    //trying to implitment the CRUD operations as i understand them

    //create. add a tourist attraction to the list
    public void addTouristAttraction(TouristAttraction Attraction){
        touristAttractionsList.add(Attraction);
    }
    //read. simply return the list of tourist attractions and print them out
    public List<TouristAttraction> getAllTouristAttractions() {
        for (TouristAttraction attraction : touristAttractionsList) {
            System.out.print("name: " + attraction.getName() + " description: " + attraction.getDescription());
        }
        return new ArrayList<>(touristAttractionsList);
    }
    //update. simply make a UpdatedAttraction object and call this method with the index of the object you want to update
    public void updateTouristAttraction( int index, TouristAttraction UpdatedAttraction){
       if (index < 0 || index >= touristAttractionsList.size()) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        touristAttractionsList.set(index, UpdatedAttraction);

    }
    //delete. simply remove the object at the index given
    public void deleteTouristAttraction(int index){
        if (index < 0 || index >= touristAttractionsList.size()) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        touristAttractionsList.remove(index);
    }


}


