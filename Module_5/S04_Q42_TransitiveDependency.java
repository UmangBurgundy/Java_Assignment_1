public class S04_Q42_TransitiveDependency {

    public static void main(String[] args) {
        System.out.println("Transitive Dependency in Maven:");
        System.out.println();
        System.out.println("A transitive dependency is a dependency of your dependency.");
        System.out.println();
        System.out.println("Example:");
        System.out.println("  Your project depends on Spring Boot");
        System.out.println("  Spring Boot depends on Spring Core");
        System.out.println("  Spring Core depends on Commons Logging");
        System.out.println();
        System.out.println("  Your project -> Spring Boot -> Spring Core -> Commons Logging");
        System.out.println("  Spring Core and Commons Logging are transitive dependencies");
        System.out.println();
        System.out.println("Maven automatically downloads transitive dependencies.");
        System.out.println("This simplifies dependency management but can cause:");
        System.out.println("  - Version conflicts");
        System.out.println("  - Unnecessary JAR bloat");
        System.out.println("  - Hidden dependencies");
        System.out.println();
        System.out.println("Use 'mvn dependency:tree' to see all transitive dependencies.");
    }
}
