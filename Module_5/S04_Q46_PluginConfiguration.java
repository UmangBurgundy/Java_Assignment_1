public class S04_Q46_PluginConfiguration {

    public static void main(String[] args) {
        System.out.println("Including and Configuring a Plugin in pom.xml:");
        System.out.println();
        System.out.println("<build>");
        System.out.println("  <plugins>");
        System.out.println("    <plugin>");
        System.out.println("      <groupId>org.apache.maven.plugins</groupId>");
        System.out.println("      <artifactId>maven-compiler-plugin</artifactId>");
        System.out.println("      <version>3.11.0</version>");
        System.out.println("      <configuration>");
        System.out.println("        <source>17</source>");
        System.out.println("        <target>17</target>");
        System.out.println("      </configuration>");
        System.out.println("    </plugin>");
        System.out.println();
        System.out.println("    <plugin>");
        System.out.println("      <groupId>org.apache.maven.plugins</groupId>");
        System.out.println("      <artifactId>maven-surefire-plugin</artifactId>");
        System.out.println("      <version>3.1.2</version>");
        System.out.println("      <configuration>");
        System.out.println("        <includes>");
        System.out.println("          <include>**/*Test.java</include>");
        System.out.println("        </includes>");
        System.out.println("        <skipTests>false</skipTests>");
        System.out.println("      </configuration>");
        System.out.println("      <executions>");
        System.out.println("        <execution>");
        System.out.println("          <phase>test</phase>");
        System.out.println("          <goals>");
        System.out.println("            <goal>test</goal>");
        System.out.println("          </goals>");
        System.out.println("        </execution>");
        System.out.println("      </executions>");
        System.out.println("    </plugin>");
        System.out.println("  </plugins>");
        System.out.println("</build>");
    }
}
