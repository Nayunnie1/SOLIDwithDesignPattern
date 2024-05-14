public class TestProgram {
    public static void main(String[] args) {

        Student marc = new Student("Marc Kristofer A. Capinpin");

        Book book = new Book("Basic Java");
        Journal journal = new Journal("A Light in the Darkness");
        Article article = new Article("What is Dynamic Programming? Working, Algorithms, and Examples");

        marc.borrowResource(book);
        marc.borrowResource(journal);
        marc.borrowResource(article);
    }
}