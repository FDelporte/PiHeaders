package be.webtechie.piheaders.definition;

import be.webtechie.piheaders.Header;
import be.webtechie.piheaders.HeaderPin;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum PiVersion {
    VERSION_1("Version 1", "First generation", Collections.singletonList(Header.get26PinsHeader())),
    VERSION_2("Version 2", "Added more RAM", Arrays.asList(Header.get26PinsHeader(), Header.get8PinsHeader())),
    VERSION_3("Version 3", "Including WiFi and Bluetooth", Collections.singletonList(Header.get40PinsHeader())),
    VERSION_4("Version 4", "Gigabit ethernet, USB 3.0 and dual monitor", Collections.singletonList(Header.get40PinsHeader()));

    private final String label;
    private final String description;
    private final List<List<HeaderPin>> headers;

    PiVersion(String label, String description, List<List<HeaderPin>> headers) {
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

    public List<List<HeaderPin>> getHeaders() {
        return headers;
    }
}
