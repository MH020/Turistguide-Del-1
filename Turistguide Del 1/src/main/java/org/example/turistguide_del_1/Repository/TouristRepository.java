package org.example.turistguide_del_1.Repository;

import org.springframework.stereotype.Repository;
import org.example.turistguide_del_1.Model.TouristAttraction; //added import of TouristAttraction for it to work
import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    // this is a list of tourist attractions that will be used to store the tourist attractions
    private  ArrayList<TouristAttraction> touristAttractions = new ArrayList<>(); //Using a map (name, desc) could be beneficial.

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
    public void updateTouristAttraction(String name, String newDesc){
        for (TouristAttraction attraction : touristAttractions) {
            if (attraction.getName().equals(name)) {
                attraction.setDescription(newDesc);
            }
        }
    }
    //delete. simply remove the object at the index given
    public void deleteTouristAttraction(int index){
        if (index < 0 || index >= touristAttractions.size()) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        touristAttractions.remove(index);
    }

    public TouristAttraction getTouristAttractionByName(String name){
        TouristAttraction ta;
        if (touristAttractions.indexOf(name) != -1) {//if Tourist attraction with name exists:
            ta = touristAttractions.get(touristAttractions.indexOf(name)); //ta = list.get(element with same index as ta
            return ta;
        }
        System.out.println("no tourist attractions with that name found");//incase touristAttraction isn't in list.
        ta = null;

        return ta;
    }


}


