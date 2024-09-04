package org.example.turistguide_del_1.Model;

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
}