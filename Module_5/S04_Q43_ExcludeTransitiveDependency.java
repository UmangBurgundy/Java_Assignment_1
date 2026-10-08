public class S04_Q43_ExcludeTransitiveDependency {

    public static void main(String[] args) {
        System.out.println("Excluding a Transitive Dependency in Maven:");
        System.out.println();
        System.out.println("<dependency>");
        System.out.println("  <groupId>org.springframework.boot</groupId>");
        System.out.println("  <artifactId>spring-boot-starter-web</artifactId>");
        System.out.println("  <version>3.1.0</version>");
        System.out.println("  <exclusions>");
        System.out.println("    <exclusion>");
        System.out.println("      <groupId>org.springframework.boot</groupId>");
        System.out.println("      <artifactId>spring-boot-starter-tomcat</artifactId>");
        System.out.println("    </exclusion>");
        System.out.println("  </exclusions>");
        System.out.println("</dependency>");
        System.out.println();
        System.out.println("Use cases for exclusion:");
        System.out.println("1. Replace a transitive dependency with a different implementation");
        System.out.println("2. Remove conflicting versions");
        System.out.println("3. Reduce application size");
        System.out.println("4. Avoid licensing issues");
    }
}
