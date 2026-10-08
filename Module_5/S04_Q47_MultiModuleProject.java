public class S04_Q47_MultiModuleProject {

    public static void main(String[] args) {
        System.out.println("Creating a Multi-Module Maven Project:");
        System.out.println();
        System.out.println("Parent pom.xml:");
        System.out.println("<project>");
        System.out.println("  <modelVersion>4.0.0</modelVersion>");
        System.out.println("  <groupId>com.example</groupId>");
        System.out.println("  <artifactId>parent-project</artifactId>");
        System.out.println("  <version>1.0</version>");
        System.out.println("  <packaging>pom</packaging>");
        System.out.println("  <modules>");
        System.out.println("    <module>module-core</module>");
        System.out.println("    <module>module-web</module>");
        System.out.println("    <module>module-api</module>");
        System.out.println("  </modules>");
        System.out.println("</project>");
        System.out.println();
        System.out.println("Child module pom.xml (module-core/pom.xml):");
        System.out.println("<project>");
        System.out.println("  <modelVersion>4.0.0</modelVersion>");
        System.out.println("  <parent>");
        System.out.println("    <groupId>com.example</groupId>");
        System.out.println("    <artifactId>parent-project</artifactId>");
        System.out.println("    <version>1.0</version>");
        System.out.println("  </parent>");
        System.out.println("  <artifactId>module-core</artifactId>");
        System.out.println("</project>");
        System.out.println();
        System.out.println("Directory structure:");
        System.out.println("  parent-project/");
        System.out.println("    pom.xml");
        System.out.println("    module-core/pom.xml");
        System.out.println("    module-web/pom.xml");
        System.out.println("    module-api/pom.xml");
    }
}
