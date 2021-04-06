import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Project {
    private String name;
    private String description;
    private int cost;

    public Project() {
        this.name = "Default Project Name";
        this.description = "Default Project Description";
    }
    public Project(String name) {
        this.name = name;
    }
    public Project(String name, String description, int cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }
    // GETTERS / SETTERS
    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int newCost) {
        this.cost = newCost;
    }
    // METHODS
    public String elevatorPitch() {
        return (this.name + " ($" + this.cost + "): " + this.description);
    }
}

