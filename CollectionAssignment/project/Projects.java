package CollectionAssignment.project;

import java.util.HashSet;
import java.util.Set;

public class Projects {

    private String projectName;
    private String projectDescription;
    private Set<String> teamMembers;

    public Projects(String projectName, String projectDescription) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.teamMembers = new HashSet<>();
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public Set<String> getTeamMembers() {
        return teamMembers;
    }

    public void addTeamMember(String teamMember) {
        teamMembers.add(teamMember);
    }

    @Override
    public String toString() {
        return "Project Name: " + projectName + "\nProject Description: " + projectDescription + "\nTeam Members: " + teamMembers;
    }
}
