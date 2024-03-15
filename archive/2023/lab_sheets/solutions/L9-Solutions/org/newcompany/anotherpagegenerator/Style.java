package org.newcompany.anotherpagegenerator;

public class Style {
    Colour colour;
    public Style(Colour c) {
        colour = c;
    }
    public String toString() {
        if(colour == null)
            return "";
        else
            return "style=\"color:" + colour.toString().toLowerCase() + ";\"";
    }
}