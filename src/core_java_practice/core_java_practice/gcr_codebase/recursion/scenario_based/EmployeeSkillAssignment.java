package core_java_practice.core_java_practice.gcr_codebase.recursion.scenario_based;

public class EmployeeSkillAssignment {

    static void findTeams(int[] skills, int target,
                          int index, String team, int sum) {

        if (sum == target) {
            System.out.println("[" + team.substring(0, team.length() - 1) + "]");
            return;
        }

        if (index == skills.length || sum > target)
            return;

        // Include current employee
        findTeams(skills, target,
                index + 1,
                team + skills[index] + ",",
                sum + skills[index]);

        // Exclude current employee
        findTeams(skills, target,
                index + 1,
                team,
                sum);
    }

    public static void main(String[] args) {
        int[] skills = {2, 3, 5, 7};
        int target = 10;

        findTeams(skills, target, 0, "", 0);
    }
}