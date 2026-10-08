public class S03_Q38_ConfigureJavaVersion {

    public static void main(String[] args) {
        System.out.println("Configuring Java Version in Maven:");
        System.out.println();
        System.out.println("Method 1: Using properties");
        System.out.println("<properties>");
        System.out.println("  <maven.compiler.source>17</maven.compiler.source>");
        System.out.println("  <maven.compiler.target>17</maven.compiler.target>");
        System.out.println("</properties>");
        System.out.println();
        System.out.println("Method 2: Using maven-compiler-plugin");
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
        System.out.println("  </plugins>");
        System.out.println("</build>");
        System.out.println();
        System.out.println("Method 3: Using release (Java 9+)");
        System.out.println("<properties>");
        System.out.println("  <maven.compiler.release>17</maven.compiler.release>");
        System.out.println("</properties>");
    }
}
