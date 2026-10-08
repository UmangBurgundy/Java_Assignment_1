public class S03_Q39_GoalVsPhase {

    public static void main(String[] args) {
        System.out.println("Maven Goal vs Phase:");
        System.out.println();
        System.out.println("PHASE:");
        System.out.println("  - A step in the build lifecycle");
        System.out.println("  - Phases execute in a fixed order");
        System.out.println("  - Running a phase runs all preceding phases");
        System.out.println("  - Examples: compile, test, package, install");
        System.out.println("  - Command: mvn compile");
        System.out.println();
        System.out.println("GOAL:");
        System.out.println("  - A specific task performed by a plugin");
        System.out.println("  - Goals are bound to phases");
        System.out.println("  - Can be executed independently");
        System.out.println("  - Format: plugin:goal");
        System.out.println("  - Examples: compiler:compile, surefire:test");
        System.out.println("  - Command: mvn compiler:compile");
        System.out.println();
        System.out.println("Relationship:");
        System.out.println("  compile phase -> compiler:compile goal");
        System.out.println("  test phase    -> surefire:test goal");
        System.out.println("  package phase -> jar:jar goal");
        System.out.println("  install phase -> install:install goal");
    }
}
