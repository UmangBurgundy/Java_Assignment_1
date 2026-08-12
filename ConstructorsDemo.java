public class ConstructorsDemo {
    static class Book {
        String title;
        Book() { this.title = "Untitled"; }
        Book(String title) { this.title = title; }
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics");
        System.out.println("B1: " + b1.title + ", B2: " + b2.title);
    }
}
