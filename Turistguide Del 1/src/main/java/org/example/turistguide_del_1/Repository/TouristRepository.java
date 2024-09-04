package org.example.turistguide_del_1.Repository;

import org.springframework.stereotype.Repository;
import org.example.turistguide_del_1.Model.TouristAttraction; //added import of TouristAttraction for it to work
import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    // this is a list of tourist attractions that will be used to store the tourist attractions
    private  ArrayList<TouristAttraction> touristAttractions = new ArrayList<>();

    //trying to implitment the CRUD operations as i understand them:

    public TouristRepository() {
        populateAttractions();
    }

    private void populateAttractions() {
        touristAttractions.add(new TouristAttraction("Den Blå Plant", "En masse fisk"));
    }

    //create. add a tourist attraction to the list
    public void addTouristAttraction(TouristAttraction attraction){
        touristAttractions.add(attraction);
    }

    //read. simply return the list of tourist attractions and print them out
    public List<TouristAttraction> getAllTouristAttractions() {
        for (TouristAttraction attraction : touristAttractions) {
            System.out.print("name: " + attraction.getName() + " description: " + attraction.getDescription());
        }
        return new ArrayList<>(touristAttractions);
    }
    //update. simply make a UpdatedAttraction object and call this method with the index of the object you want to update
    public List<TouristAttraction> updateTouristAttraction( int index, TouristAttraction UpdatedAttraction){
       if (index < 0 || index >= touristAttractions.size()) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        return null;//touristAttractionsList.set(index, UpdatedAttraction);

    }
    //delete. simply remove the object at the index given
    public void deleteTouristAttraction(int index){
        if (index < 0 || index >= touristAttractions.size()) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        touristAttractions.remove(index);
    }


}


