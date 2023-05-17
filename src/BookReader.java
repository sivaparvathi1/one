public class BookReader {
    public static void main(String[] args) {
        Book pen = new Book();
        Book paper = new Book();
        paper.sheets=5;
        pen.pencil=10;

        pen.start();
        paper.start();
    }
}