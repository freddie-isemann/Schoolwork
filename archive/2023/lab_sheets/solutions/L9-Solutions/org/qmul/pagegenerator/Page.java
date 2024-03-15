package org.qmul.pagegenerator;
public class Page implements Element {    
    private String title; 
    private Element[] es; 
    
    public Page(String title) {
        this.title = title; 
        es = new Element[0];
    }

    public String toHTML() {
        String r = "";
        r += "<!DOCTYPE html>\n"
           + OTag("html")
           + OTag("head")
           + OTag("title")
           + title
           + CTag("title")
           + CTag("head");

           for(Element e : es) {
            r += e.toHTML();
           }
        return r;
    }

    public Page appendElement(Element e) {
        Element[] t = new Element[es.length+1];

        for(int i = 0; i < es.length; i++)
            t[i] = es[i];
        t[es.length] = e;
        es = t; 

        return this; 
    }

    static String OTag(String tag) {
        return "<" + tag + ">\n";
    }
    static String CTag(String tag) {
        return "\n</" + tag + ">\n"; 
    }
}
