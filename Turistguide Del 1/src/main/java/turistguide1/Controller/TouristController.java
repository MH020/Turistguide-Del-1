package turistguide1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TouristController {
    // This class is a controller class

    @RequestMapping("/") // this is the root of the website
    public String home(){
        return "home"; // this will return the home.html file
    }
}
