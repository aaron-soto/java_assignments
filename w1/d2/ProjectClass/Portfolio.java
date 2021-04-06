import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Portfolio {
    private ArrayList<Project> projects;

    public Portfolio() {
        this.projects = new ArrayList<Project>();
    }

    public ArrayList<Project> getProjects() {
        return this.projects;
    }
    public void addProject(Project newProject) {
        this.projects.add(newProject);
    }

    public int getPortfolioCost() {
        int portfolioCost = 0;
        for (Project project : this.projects) {
            portfolioCost += project.getCost();
        }
        return portfolioCost;
    }
    public void showPortfolio() {
        int portfolioCost = 0;
        for (Project project : this.projects) {
            portfolioCost += project.getCost();
            System.out.println(project.elevatorPitch());
        }
        System.out.println("Total Portfolio Cost: $" + portfolioCost);
    }
}