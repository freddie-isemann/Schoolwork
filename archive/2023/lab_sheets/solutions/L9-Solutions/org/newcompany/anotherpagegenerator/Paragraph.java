package org.newcompany.anotherpagegenerator;
public class Paragraph extends org.qmul.pagegenerator.Paragraph {
    private Style style;
    public Paragraph(Style s, String c) {
        super(c);
        style = s;
    }
    public String toHTML() {
        return Tag.OTag("p", style) + content + Tag.CTag("p");
    }
}