package be.webtechie.piheaders.definition;

import be.webtechie.piheaders.util.Markdown;
import java.util.Arrays;

/**
 * List of pin types in a header.
 */
public enum PinType {
    POWER("Power", 0x990000),
    GROUND("Ground", 0x000000),
    DIGITAL("Digital", 0x009900),
    DIGITAL_AND_PWM("Digital and PWM", 0xff7ff00),
    DIGITAL_NO_PULL_DOWN("Digital without pulldown", 0x800080);

    private final String label;
    private final int color;

    PinType(String label, int color) {
        this.label = label;
        this.color = color;
    }

    public String getLabel() {
        return label;
    }

    public int getColor() {
        return color;
    }

    public static String toMarkdownTable() {
        StringBuilder rt = new StringBuilder();
        rt.append(Markdown.toHeaderRow(Arrays.asList("Name", "Color")));
        for (PinType pinType : PinType.values()) {
            rt.append(Markdown.toValueRow(Arrays.asList(pinType.getLabel(), "#" + Integer.toHexString(pinType.getColor()))));
        }
        return rt.toString();
    }
}
