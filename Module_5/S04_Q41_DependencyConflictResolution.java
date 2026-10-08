public class S04_Q41_DependencyConflictResolution {

    public static void main(String[] args) {
        System.out.println("Maven Dependency Conflict Resolution:");
        System.out.println();
        System.out.println("1. NEAREST DEFINITION (shortest path wins):");
        System.out.println("   A -> B -> C(v1.0) and A -> C(v2.0)");
        System.out.println("   Result: C v2.0 is used (closer to root)");
        System.out.println();
        System.out.println("2. FIRST DECLARATION (same depth):");
        System.out.println("   If two dependencies are at the same depth,");
        System.out.println("   the first one declared in pom.xml wins");
        System.out.println();
        System.out.println("3. DEPENDENCY MANAGEMENT:");
        System.out.println("   <dependencyManagement> overrides transitive versions");
        System.out.println("   Forces a specific version across the project");
        System.out.println();
        System.out.println("4. EXCLUSIONS:");
        System.out.println("   Explicitly exclude unwanted transitive dependencies");
        System.out.println();
        System.out.println("Commands:");
        System.out.println("   mvn dependency:tree  - view dependency tree");
        System.out.println("   mvn dependency:analyze - find conflicts");
    }
}
