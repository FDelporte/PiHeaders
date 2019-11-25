package be.webtechie.piheaders;

import be.webtechie.piheaders.definition.HeaderPins;

public class DemoApp {
    public static void main(String[] args) {
        System.out.println(HeaderPins.toMarkdownTable(HeaderPins.HEADER_40));
    }
}