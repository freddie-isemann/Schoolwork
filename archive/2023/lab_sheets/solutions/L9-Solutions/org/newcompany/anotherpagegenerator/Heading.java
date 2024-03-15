
package org.newcompany.anotherpagegenerator;
public class Heading extends org.qmul.pagegenerator.Heading {
    Style style; 
    public Heading(Style s, int level, String title) {
        super(level,title);
        style = s;
    }

    public String toHTML() {
        return Tag.OTag("h" + getLevel(), style) + title + Tag.CTag("h" + getLevel());
    }
}