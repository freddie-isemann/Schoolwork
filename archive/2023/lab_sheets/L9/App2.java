import org.qmul.pagegenerator.Page;
import org.newcompany.anotherpagegenerator.*;
class App2 {
    public static void main(String[] args) {
        Page p = new Page("My Website");

        Style red = new Style(Colour.RED);
        Style blue = new Style(Colour.BLUE);

        p.appendElement(new Heading(red, 1, "subtitle"))
         .appendElement(new Paragraph(blue, "hello"));
        System.out.print(p.toHTML());
    }
}