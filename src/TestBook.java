public class TestBook {
    public static void main(String args[]) {
        Author anAuthor = new Author("Patrick Rothfuss", "rothfuss@gmail.com", 'm');
        Book aBook = new Book("The name of the wind", anAuthor, 20.99, 50);
        Book anotherBook = new Book("Fifty shades of Grey",
                new Author("E. L. James", "james@gmail.com", 'f'), 29.95, 888);
        System.out.println(aBook.getAuthor().getName());
        System.out.println(aBook.getAuthor().getEmail());
        System.out.println (anotherBook);
        Book[] bookArray = new Book[5];
        Author haruki = new Author("Haruki Murakami", "haruki@gmail.com", 'm');
        bookArray[0] = new Book("Hear the Wind Sing", haruki, 20);
        bookArray[1] = new Book("Pinball, 1973", haruki, 10);
        bookArray[2] = new Book("A Wild Sheep Chase", haruki, 30);
        bookArray[3] = new Book("Norwegian Wood", haruki, 15);
        bookArray[4] = new Book("Kafka on the Shore", haruki, 15);
        for (Book bookArray1 : bookArray) {
            System.out.println(bookArray1.toString());
        }
    }
}