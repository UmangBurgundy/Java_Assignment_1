public class S03_Q32_PomXmlRole {

    public static void main(String[] args) {
        System.out.println("Role of pom.xml (Project Object Model):");
        System.out.println("1. Defines project coordinates: groupId, artifactId, version");
        System.out.println("2. Specifies project dependencies");
        System.out.println("3. Configures build plugins");
        System.out.println("4. Sets project properties (Java version, encoding)");
        System.out.println("5. Defines build profiles");
        System.out.println("6. Manages parent-child module relationships");
        System.out.println("7. Configures repositories");
        System.out.println();
        System.out.println("Example pom.xml structure:");
        System.out.println("<project>");
        System.out.println("  <modelVersion>4.0.0</modelVersion>");
        System.out.println("  <groupId>com.example</groupId>");
        System.out.println("  <artifactId>my-app</artifactId>");
        System.out.println("  <version>1.0</version>");
        System.out.println("  <dependencies>...</dependencies>");
        System.out.println("  <build><plugins>...</plugins></build>");
        System.out.println("</project>");
    }
}
