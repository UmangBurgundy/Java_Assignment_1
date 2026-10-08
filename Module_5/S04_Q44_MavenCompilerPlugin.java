public class S04_Q44_MavenCompilerPlugin {

    public static void main(String[] args) {
        System.out.println("Purpose of maven-compiler-plugin:");
        System.out.println();
        System.out.println("Compiles Java source files during the compile phase.");
        System.out.println();
        System.out.println("Configuration:");
        System.out.println("<plugin>");
        System.out.println("  <groupId>org.apache.maven.plugins</groupId>");
        System.out.println("  <artifactId>maven-compiler-plugin</artifactId>");
        System.out.println("  <version>3.11.0</version>");
        System.out.println("  <configuration>");
        System.out.println("    <source>17</source>");
        System.out.println("    <target>17</target>");
        System.out.println("    <encoding>UTF-8</encoding>");
        System.out.println("  </configuration>");
        System.out.println("</plugin>");
        System.out.println();
        System.out.println("Key features:");
        System.out.println("1. Sets Java source and target version");
        System.out.println("2. Configures character encoding");
        System.out.println("3. Enables/disables compiler warnings");
        System.out.println("4. Supports annotation processing");
        System.out.println("5. Allows passing custom compiler arguments");
    }
}
