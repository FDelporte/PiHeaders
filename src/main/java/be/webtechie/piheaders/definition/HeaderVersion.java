package be.webtechie.piheaders.definition;

import be.webtechie.piheaders.util.Markdown;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public enum HeaderVersion {
    TYPE_1("Type 1", "Used on original Model B", Collections.singletonList(HeaderPins.HEADER_26_TYPE_1)),
    TYPE_2("Type 2", "Used on Model A and Model B (revision 2)", Arrays.asList(HeaderPins.HEADER_26_TYPE_2, HeaderPins.HEADER_8)),
    TYPE_3("Type 3", "Used on Model A+, B+, Pi Zero, Pi Zero W, Pi2B, Pi3B, Pi4B", Collections.singletonList(HeaderPins.HEADER_40)),
    COMPUTE("Compute Module", "54 GPIO", Arrays.asList(HeaderPins.COMPUTE_J5, HeaderPins.COMPUTE_J6));

    private final String label;
    private final String description;
    private final List<HeaderPins> headerPins;

    HeaderVersion(String label, String description, List<HeaderPins> headerPins) {
        this.label = label;
        this.description = description;
        this.headerPins = headerPins;
    }

    public String getLabel() {
        return label;
    }

    public String getDescription() {
        return description;
    }

    public List<HeaderPins> getHeaderPins() {
        return headerPins;
    }

    public static String toMarkdownTable() {
        StringBuilder rt = new StringBuilder();
        rt.append(Markdown.toHeaderRow(Arrays.asList("Name", "Label", "Description", "Headers")));
        for (HeaderVersion headerVersion : HeaderVersion.values()) {
            rt.append(Markdown.toValueRow(Arrays.asList(
                    headerVersion.name(),
                    headerVersion.getLabel(),
                    headerVersion.getDescription(),
                    headerVersion.getHeaderPins().stream().map(h -> h.getLabel()).collect(Collectors.joining(" + ")))));
        }
        return rt.toString();
    }
}
