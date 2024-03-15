package org.qmul.pagegenerator;
public class Heading implements Element {
    private int level;
    protected String title;

    public Heading(int level, String title) {
        this.level = level; 
        this.title = title;
    }

    public int getLevel() { return level ;}

    public String toHTML() {
        return Page.OTag("h" + level) + title + Page.CTag("h" + level);
    }
}