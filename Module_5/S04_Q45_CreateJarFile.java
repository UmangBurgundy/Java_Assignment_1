public class S04_Q45_CreateJarFile {

    public static void main(String[] args) {
        System.out.println("Creating a JAR file with Maven:");
        System.out.println();
        System.out.println("Command: mvn package");
        System.out.println("Output: target/<artifactId>-<version>.jar");
        System.out.println();
        System.out.println("pom.xml configuration:");
        System.out.println("<packaging>jar</packaging>");
        System.out.println();
        System.out.println("Executable JAR with maven-jar-plugin:");
        System.out.println("<plugin>");
        System.out.println("  <groupId>org.apache.maven.plugins</groupId>");
        System.out.println("  <artifactId>maven-jar-plugin</artifactId>");
        System.out.println("  <version>3.3.0</version>");
        System.out.println("  <configuration>");
        System.out.println("    <archive>");
        System.out.println("      <manifest>");
        System.out.println("        <mainClass>com.example.Main</mainClass>");
        System.out.println("      </manifest>");
        System.out.println("    </archive>");
        System.out.println("  </configuration>");
        System.out.println("</plugin>");
        System.out.println();
        System.out.println("Fat JAR with maven-shade-plugin:");
        System.out.println("<plugin>");
        System.out.println("  <groupId>org.apache.maven.plugins</groupId>");
        System.out.println("  <artifactId>maven-shade-plugin</artifactId>");
        System.out.println("  <version>3.5.0</version>");
        System.out.println("  <executions>");
        System.out.println("    <execution>");
        System.out.println("      <phase>package</phase>");
        System.out.println("      <goals><goal>shade</goal></goals>");
        System.out.println("    </execution>");
        System.out.println("  </executions>");
        System.out.println("</plugin>");
    }
}
