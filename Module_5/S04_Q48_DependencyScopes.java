public class S04_Q48_DependencyScopes {

    public static void main(String[] args) {
        System.out.println("Maven Dependency Scopes:");
        System.out.println();
        System.out.println("1. COMPILE (default):");
        System.out.println("   Available in all classpaths (compile, test, runtime)");
        System.out.println("   Packaged with the application");
        System.out.println("   Example: Spring Framework, Gson");
        System.out.println();
        System.out.println("2. PROVIDED:");
        System.out.println("   Available at compile and test time");
        System.out.println("   NOT packaged - expected to be provided by the runtime");
        System.out.println("   Example: Servlet API (provided by Tomcat)");
        System.out.println("   <scope>provided</scope>");
        System.out.println();
        System.out.println("3. RUNTIME:");
        System.out.println("   NOT available at compile time");
        System.out.println("   Available at runtime and test time");
        System.out.println("   Packaged with the application");
        System.out.println("   Example: JDBC drivers (MySQL Connector)");
        System.out.println("   <scope>runtime</scope>");
        System.out.println();
        System.out.println("4. TEST:");
        System.out.println("   Only for test compilation and execution");
        System.out.println("   Example: JUnit, Mockito");
        System.out.println("   <scope>test</scope>");
        System.out.println();
        System.out.println("5. SYSTEM:");
        System.out.println("   Similar to provided but requires explicit JAR path");
        System.out.println("   <scope>system</scope>");
        System.out.println();
        System.out.println("6. IMPORT:");
        System.out.println("   Used only in <dependencyManagement> with pom type");
        System.out.println("   <scope>import</scope>");
    }
}
