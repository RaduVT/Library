public class TestAuthor {
    public static void main(String[] args) {
        Author anAuthor = new Author("Patrick Rothfuss", "rothfuss@gmail.com", 'm');
        System.out.println(anAuthor); // call toString()
        anAuthor.setEmail("patrick@gamil.com");
        System.out.println(anAuthor);
    }
}