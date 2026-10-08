public class S04_Q50_SurefirePlugin {

    public static void main(String[] args) {
        System.out.println("Maven Surefire Plugin Configuration for Unit Tests:");
        System.out.println();
        System.out.println("<build>");
        System.out.println("  <plugins>");
        System.out.println("    <plugin>");
        System.out.println("      <groupId>org.apache.maven.plugins</groupId>");
        System.out.println("      <artifactId>maven-surefire-plugin</artifactId>");
        System.out.println("      <version>3.1.2</version>");
        System.out.println("      <configuration>");
        System.out.println("        <includes>");
        System.out.println("          <include>**/*Test.java</include>");
        System.out.println("          <include>**/*Tests.java</include>");
        System.out.println("          <include>**/Test*.java</include>");
        System.out.println("        </includes>");
        System.out.println("        <excludes>");
        System.out.println("          <exclude>**/IntegrationTest.java</exclude>");
        System.out.println("        </excludes>");
        System.out.println("        <parallel>methods</parallel>");
        System.out.println("        <threadCount>4</threadCount>");
        System.out.println("        <reportFormat>plain</reportFormat>");
        System.out.println("      </configuration>");
        System.out.println("    </plugin>");
        System.out.println("  </plugins>");
        System.out.println("</build>");
        System.out.println();
        System.out.println("Required test dependency:");
        System.out.println("<dependency>");
        System.out.println("  <groupId>junit</groupId>");
        System.out.println("  <artifactId>junit</artifactId>");
        System.out.println("  <version>4.13.2</version>");
        System.out.println("  <scope>test</scope>");
        System.out.println("</dependency>");
        System.out.println();
        System.out.println("Run tests: mvn test");
        System.out.println("Skip tests: mvn package -DskipTests");
    }
}
