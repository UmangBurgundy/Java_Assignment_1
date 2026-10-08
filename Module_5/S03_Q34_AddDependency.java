public class S03_Q34_AddDependency {

    public static void main(String[] args) {
        System.out.println("Adding a dependency to Maven project:");
        System.out.println();
        System.out.println("Add inside <dependencies> section of pom.xml:");
        System.out.println();
        System.out.println("<dependencies>");
        System.out.println("  <dependency>");
        System.out.println("    <groupId>com.google.gson</groupId>");
        System.out.println("    <artifactId>gson</artifactId>");
        System.out.println("    <version>2.10.1</version>");
        System.out.println("  </dependency>");
        System.out.println();
        System.out.println("  <dependency>");
        System.out.println("    <groupId>junit</groupId>");
        System.out.println("    <artifactId>junit</artifactId>");
        System.out.println("    <version>4.13.2</version>");
        System.out.println("    <scope>test</scope>");
        System.out.println("  </dependency>");
        System.out.println("</dependencies>");
        System.out.println();
        System.out.println("Required elements: groupId, artifactId, version");
        System.out.println("Optional: scope, type, classifier, exclusions");
    }
}
