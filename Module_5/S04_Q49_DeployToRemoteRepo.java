public class S04_Q49_DeployToRemoteRepo {

    public static void main(String[] args) {
        System.out.println("Deploying Maven Project to Remote Repository:");
        System.out.println();
        System.out.println("Step 1: Configure distribution management in pom.xml:");
        System.out.println("<distributionManagement>");
        System.out.println("  <repository>");
        System.out.println("    <id>releases</id>");
        System.out.println("    <url>https://repo.example.com/releases</url>");
        System.out.println("  </repository>");
        System.out.println("  <snapshotRepository>");
        System.out.println("    <id>snapshots</id>");
        System.out.println("    <url>https://repo.example.com/snapshots</url>");
        System.out.println("  </snapshotRepository>");
        System.out.println("</distributionManagement>");
        System.out.println();
        System.out.println("Step 2: Configure credentials in ~/.m2/settings.xml:");
        System.out.println("<settings>");
        System.out.println("  <servers>");
        System.out.println("    <server>");
        System.out.println("      <id>releases</id>");
        System.out.println("      <username>deploy-user</username>");
        System.out.println("      <password>password</password>");
        System.out.println("    </server>");
        System.out.println("  </servers>");
        System.out.println("</settings>");
        System.out.println();
        System.out.println("Step 3: Run deployment command:");
        System.out.println("  mvn deploy");
        System.out.println();
        System.out.println("This runs all lifecycle phases up to and including deploy.");
    }
}
