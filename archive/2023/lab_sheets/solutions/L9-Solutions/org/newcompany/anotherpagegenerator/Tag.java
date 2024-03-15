package org.newcompany.anotherpagegenerator;
class Tag {
    static String OTag(String tagname, Style style) {
        return "\n <" + tagname + " " + style + ">\n";
    }
    static String CTag(String tagname) {
        return "\n</" + tagname + ">\n";
    }
}