import org.qmul.pagegenerator.*;
class App {
    public static void main(String[] args) {
        Page p = new Page("My Website");

        p.appendElement(new Heading(1, "subtitle"))
         .appendElement(new Paragraph("hello"));
        System.out.print(p.toHTML());
    }
}