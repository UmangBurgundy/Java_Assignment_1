public class S03_Q33_RepositoryTypes {

    public static void main(String[] args) {
        System.out.println("Maven Repository Types:");
        System.out.println();
        System.out.println("1. LOCAL REPOSITORY:");
        System.out.println("   Location: ~/.m2/repository");
        System.out.println("   Acts as cache for downloaded dependencies");
        System.out.println("   First place Maven checks for dependencies");
        System.out.println();
        System.out.println("2. CENTRAL REPOSITORY:");
        System.out.println("   URL: https://repo.maven.apache.org/maven2");
        System.out.println("   Default remote repository maintained by Apache");
        System.out.println("   Contains most popular open-source libraries");
        System.out.println("   Checked when dependency not found locally");
        System.out.println();
        System.out.println("3. REMOTE REPOSITORY:");
        System.out.println("   Custom repository configured in pom.xml");
        System.out.println("   Can be private/corporate repositories");
        System.out.println("   Examples: Nexus, Artifactory, GitHub Packages");
        System.out.println("   Used for proprietary or organization-specific artifacts");
        System.out.println();
        System.out.println("Resolution order: Local -> Central -> Remote");
    }
}
