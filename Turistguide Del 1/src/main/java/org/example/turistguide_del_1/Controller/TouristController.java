package org.example.turistguide_del_1.Controller;

import org.example.turistguide_del_1.Service.TouristService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.example.turistguide_del_1.Model.TouristAttraction;

import java.util.List;


@Controller
@RequestMapping ("/attractions")
public class TouristController {
    // This class is a controller class
    private final org.example.turistguide_del_1.Service.TouristService touristService;

    public TouristController(TouristService touristService) {
        this.touristService = touristService;
    }

    @GetMapping
    public ResponseEntity<List<TouristAttraction>> getAllTouristAttractions(){
       List<TouristAttraction> attractions = touristService.getAllTouristAttractions();
        return new ResponseEntity<>(attractions, HttpStatus.OK);
    }
    @GetMapping("/{name}")
    public ResponseEntity<TouristAttraction> getTouristAttractionByName(@PathVariable String name){
        return new ResponseEntity<>(new TouristAttraction(name, "bla bla"),HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<TouristAttraction> getTouristAttraction(@RequestBody TouristAttraction touristAttraction){
        touristService.addTouristAttraction(touristAttraction);
      return new ResponseEntity<>(touristAttraction, HttpStatus.CREATED);
    }

}
