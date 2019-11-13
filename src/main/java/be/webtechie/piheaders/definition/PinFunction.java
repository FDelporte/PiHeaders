package be.webtechie.piheaders.definition;

import be.webtechie.piheaders.util.Markdown;
import java.util.Arrays;

/**
 * List of pin functions in a header.
 */
public enum PinFunction {
    UART("Universal Asynchronous Receiver and Transmitter", "Asynchronous serial communication protocol"),
    GPCLK("General Purpose Clock", "Output a fixed frequency"),
    I2C("Inter Integrated Circuit", "Synchronous serial computer bus"),
    SPI("Serial Peripheral Interface", "Four-wire serial bus");

    private final String label;
    private final String description;

    PinFunction(String label, String description) {
        this.label = label;
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public String getDescription() {
        return description;
    }

    public static String toMarkdownTable() {
        StringBuilder rt = new StringBuilder();
        rt.append(Markdown.toHeaderRow(Arrays.asList("Name", "Label", "Description")));
        for (PinFunction pinFunction : PinFunction.values()) {
            rt.append(Markdown.toValueRow(Arrays.asList(
                    pinFunction.name(),
                    pinFunction.getLabel(),
                    pinFunction.getDescription())));
        }
        return rt.toString();
    }
}
