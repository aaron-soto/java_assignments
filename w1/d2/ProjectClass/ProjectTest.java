public class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Project("Big Project", "The biggest of projects.", 3000);
        Project project2 = new Project("Smaller Project", "A little smaller project but still cool.", 1200);

        Portfolio portfolio1 = new Portfolio();

        portfolio1.addProject(project1);
        portfolio1.addProject(project2);
        System.out.println(portfolio1.getProjects());
        System.out.println(portfolio1.getPortfolioCost());
        portfolio1.showPortfolio();
    }
}