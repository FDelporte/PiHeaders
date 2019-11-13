package be.webtechie.piheaders.definition;

import be.webtechie.piheaders.util.Markdown;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public enum PiVersion {
    VERSION_1("Version 1", "First generation", Collections.singletonList(Header.HEADER_26)),
    VERSION_2("Version 2", "Added more RAM", Arrays.asList(Header.HEADER_26, Header.HEADER_8)),
    VERSION_3("Version 3", "Including WiFi and Bluetooth", Collections.singletonList(Header.HEADER_40)),
    VERSION_4("Version 4", "Gigabit ethernet, USB 3.0 and dual monitor", Collections.singletonList(Header.HEADER_40));

    private final String label;
    private final String description;
    private final List<Header> headers;

    PiVersion(String label, String description, List<Header> headers) {
        this.label = label;
        this.description = description;
        this.headers = headers;
    }

    public String getLabel() {
        return label;
    }

    public String getDescription() {
        return description;
    }

    public List<Header> getHeaders() {
        return headers;
    }

    public static String toMarkdownTable() {
        StringBuilder rt = new StringBuilder();
        rt.append(Markdown.toHeaderRow(Arrays.asList("Name", "Label", "Description", "Headers")));
        for (PiVersion piVersion : PiVersion.values()) {
            rt.append(Markdown.toValueRow(Arrays.asList(
                    piVersion.name(),
                    piVersion.getLabel(),
                    piVersion.getDescription(),
                    piVersion.getHeaders().stream().map(h -> h.getLabel()).collect(Collectors.joining(" + ")))));
        }
        return rt.toString();
    }
}
