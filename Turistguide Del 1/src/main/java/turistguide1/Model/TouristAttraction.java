package turistguide1.Model;

public class TouristAttraction {
    private String name;
    private String description;

    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    //constructor
    public TouristAttraction(String name, String description) {
        this.name = name;
        this.description = description;
    }
    //made some objects to be added to the arraylist in the repository class
    TouristAttraction Attraction1 = new TouristAttraction("The Little Mermaid", "A small statue of a mermaid located in Copenhagen, Denmark.");
    TouristAttraction Attraction2 = new TouristAttraction("The Eiffel Tower", "A wrought-iron lattice tower on the Champ de Mars in Paris, France.");
    TouristAttraction Attraction3 = new TouristAttraction("The Colosseum", "An oval amphitheatre in the centre of the city of Rome, Italy.");}
