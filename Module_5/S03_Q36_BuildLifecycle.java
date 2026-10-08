public class S03_Q36_BuildLifecycle {

    public static void main(String[] args) {
        System.out.println("Maven Build Lifecycle:");
        System.out.println();
        System.out.println("Three built-in lifecycles:");
        System.out.println();
        System.out.println("1. DEFAULT LIFECYCLE (main build):");
        System.out.println("   validate -> compile -> test -> package -> verify -> install -> deploy");
        System.out.println();
        System.out.println("2. CLEAN LIFECYCLE:");
        System.out.println("   pre-clean -> clean -> post-clean");
        System.out.println("   Removes files generated during previous build");
        System.out.println();
        System.out.println("3. SITE LIFECYCLE:");
        System.out.println("   pre-site -> site -> post-site -> site-deploy");
        System.out.println("   Generates project documentation and reports");
        System.out.println();
        System.out.println("Each phase executes all preceding phases automatically.");
        System.out.println("Example: 'mvn package' runs validate, compile, test, then package.");
    }
}
