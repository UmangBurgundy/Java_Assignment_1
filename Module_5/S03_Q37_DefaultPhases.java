public class S03_Q37_DefaultPhases {

    public static void main(String[] args) {
        System.out.println("Default Phases of the Maven Lifecycle:");
        System.out.println();
        System.out.println(" 1. validate      - Validates project is correct and all info is available");
        System.out.println(" 2. initialize    - Initializes build state");
        System.out.println(" 3. generate-sources - Generates source code");
        System.out.println(" 4. process-sources  - Processes source code");
        System.out.println(" 5. generate-resources - Generates resources");
        System.out.println(" 6. process-resources  - Copies resources to output directory");
        System.out.println(" 7. compile       - Compiles source code");
        System.out.println(" 8. process-classes - Post-processes compiled files");
        System.out.println(" 9. generate-test-sources - Generates test source code");
        System.out.println("10. process-test-sources  - Processes test source code");
        System.out.println("11. generate-test-resources - Generates test resources");
        System.out.println("12. process-test-resources  - Copies test resources");
        System.out.println("13. test-compile  - Compiles test source code");
        System.out.println("14. process-test-classes - Post-processes test compiled files");
        System.out.println("15. test          - Runs unit tests");
        System.out.println("16. prepare-package - Prepares for packaging");
        System.out.println("17. package       - Packages compiled code (JAR, WAR)");
        System.out.println("18. pre-integration-test - Prepares for integration tests");
        System.out.println("19. integration-test     - Runs integration tests");
        System.out.println("20. post-integration-test - Cleans up after integration tests");
        System.out.println("21. verify        - Verifies package is valid");
        System.out.println("22. install       - Installs package to local repository");
        System.out.println("23. deploy        - Deploys package to remote repository");
    }
}
