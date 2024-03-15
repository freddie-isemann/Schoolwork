import org.qmul.pagegenerator.*;
class Ex1a {
    public static void main(String[] args) {
        Element e1 = new Heading();
        Element e2 = new Paragraph();
        Element e3 = new Page();
        
        System.out.println(e1.toHTML() + e2.toHTML() + e3.toHTML());
    }
}