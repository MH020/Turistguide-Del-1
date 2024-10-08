package org.example.turistguide_del_1.Service;

import org.example.turistguide_del_1.Repository.TouristRepository;
import org.springframework.stereotype.Service;
import org.example.turistguide_del_1.Model.TouristAttraction;

import java.util.List;

@Service
public class TouristService {
    // This class is a service class that is used to be the middle man between the controller and the database(Repository).

    private final TouristRepository repository;

    //constructor to inject the repository into the service class so it can be used to do the CRUD operations on the database(Repository)
    public TouristService(TouristRepository repository) {
        this.repository = repository;
    }
    // so I will now implement the CRUD operations in this class that use the repository to do the operations

    //create. add a tourist attraction to the list
    public void addTouristAttraction(TouristAttraction Attraction){
        repository.addTouristAttraction(Attraction);

    }
    //read. simply return the list of tourist attractions and print them out
    public List<TouristAttraction> getAllTouristAttractions() {
        return repository.getAllTouristAttractions();
    }
    //update.
    public void updateTouristAttraction(TouristAttraction touristAttraction) {
        repository.updateTouristAttraction(touristAttraction.getName(), touristAttraction.getDescription());
    }
    //delete. simply remove the object at the index given
    public void deleteTouristAttraction(int index){
        repository.deleteTouristAttraction(index);
    }

    //get tourist attraction by name
    public TouristAttraction getTouristAttractionByName(String name){
        TouristAttraction ta = repository.getTouristAttractionByName(name);
        return ta;
    }
}
