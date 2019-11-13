package be.webtechie.piheaders.util;

import java.util.List;

public class Markdown {
    public static String toHeaderRow(List<String> headers) {
        StringBuilder row1 = new StringBuilder();
        StringBuilder row2 = new StringBuilder();
        row1.append("| ");
        row2.append("| ");

        for (String header : headers) {
            row1.append(header).append(" | ");
            row2.append(":--- | ");
        }

        return row1.toString() + System.lineSeparator() + row2.toString() + System.lineSeparator();
    }

    public static String toValueRow(List<String> values) {
        StringBuilder row = new StringBuilder();
        row.append("| ");

        for (String value : values) {
            row.append(value).append(" | ");
        }

        return row.toString() + System.lineSeparator();
    }
}
