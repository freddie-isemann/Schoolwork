package org.qmul.pagegenerator;
public class Paragraph implements Element { 
    protected String content;

    public Paragraph(String s) {
        content = s;
    }
    
    public String toHTML(){
        return Page.OTag("p") + content + Page.CTag("p");
    }
}