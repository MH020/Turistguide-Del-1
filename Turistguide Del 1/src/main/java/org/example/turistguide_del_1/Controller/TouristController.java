package org.example.turistguide_del_1.Controller;

import org.example.turistguide_del_1.Service.TouristService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.example.turistguide_del_1.Model.TouristAttraction;

import java.util.List;

@Controller
@RequestMapping ("/welcome")
public class TouristController {
    // This class is a controller class
    private final org.example.turistguide_del_1.Service.TouristService TouristService;

    public TouristController(TouristService TouristService) {
        this.TouristService = TouristService;
    }
    @RequestMapping("/Attractions") // this is the root of the website
    public ResponseEntity<List<TouristAttraction>> getAllTouristAttractions(){
       List<TouristAttraction> attractions = TouristService.getAllTouristAttractions();
        return new ResponseEntity<>(attractions, HttpStatus.OK);
    }
}
