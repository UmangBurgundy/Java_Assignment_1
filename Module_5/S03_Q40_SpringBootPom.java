public class S03_Q40_SpringBootPom {

    public static void main(String[] args) {
        System.out.println("Example pom.xml for Spring Boot project:");
        System.out.println();
        System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        System.out.println("<project xmlns=\"http://maven.apache.org/POM/4.0.0\"");
        System.out.println("  xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
        System.out.println("  xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0");
        System.out.println("  https://maven.apache.org/xsd/maven-4.0.0.xsd\">");
        System.out.println("  <modelVersion>4.0.0</modelVersion>");
        System.out.println();
        System.out.println("  <parent>");
        System.out.println("    <groupId>org.springframework.boot</groupId>");
        System.out.println("    <artifactId>spring-boot-starter-parent</artifactId>");
        System.out.println("    <version>3.1.0</version>");
        System.out.println("  </parent>");
        System.out.println();
        System.out.println("  <groupId>com.example</groupId>");
        System.out.println("  <artifactId>spring-boot-app</artifactId>");
        System.out.println("  <version>1.0.0</version>");
        System.out.println("  <packaging>jar</packaging>");
        System.out.println();
        System.out.println("  <properties>");
        System.out.println("    <java.version>17</java.version>");
        System.out.println("  </properties>");
        System.out.println();
        System.out.println("  <dependencies>");
        System.out.println("    <dependency>");
        System.out.println("      <groupId>org.springframework.boot</groupId>");
        System.out.println("      <artifactId>spring-boot-starter-web</artifactId>");
        System.out.println("    </dependency>");
        System.out.println("    <dependency>");
        System.out.println("      <groupId>org.springframework.boot</groupId>");
        System.out.println("      <artifactId>spring-boot-starter-data-jpa</artifactId>");
        System.out.println("    </dependency>");
        System.out.println("    <dependency>");
        System.out.println("      <groupId>org.springframework.boot</groupId>");
        System.out.println("      <artifactId>spring-boot-starter-test</artifactId>");
        System.out.println("      <scope>test</scope>");
        System.out.println("    </dependency>");
        System.out.println("  </dependencies>");
        System.out.println();
        System.out.println("  <build>");
        System.out.println("    <plugins>");
        System.out.println("      <plugin>");
        System.out.println("        <groupId>org.springframework.boot</groupId>");
        System.out.println("        <artifactId>spring-boot-maven-plugin</artifactId>");
        System.out.println("      </plugin>");
        System.out.println("    </plugins>");
        System.out.println("  </build>");
        System.out.println("</project>");
    }
}
