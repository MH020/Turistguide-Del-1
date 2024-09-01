package turistguide1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import turistguide1.Service.TouristService;

@Controller
public class TouristController {
    // This class is a controller class

    @RequestMapping("/") // this is the root of the website
    public String home(){
        TouristService.getAllTouristAttractions
        return "attractions"; // this will return the attractions.html page
    }
}
