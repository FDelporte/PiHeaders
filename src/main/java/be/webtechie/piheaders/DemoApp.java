package be.webtechie.piheaders;

import be.webtechie.piheaders.definition.Header;

public class DemoApp {
    public static void main(String[] args) {
        System.out.println(Header.toMarkdownTable(Header.HEADER_40));
    }
}