package be.webtechie.piheaders.definition;

import be.webtechie.piheaders.util.Markdown;
import java.util.Arrays;

public enum PiModel {
    MODEL_A("Model A", "Without ethernet connector"),
    MODEL_B("Model B", "With ethernet connector"),
    COMPUTE("Compute Module", "Pi on a 200-pin DDR2-memory-like module for integration in embedded devices"),
    ZERO("Zero", "Smaller size and reduced GPIO capabilities");

    private final String label;
    private final String description;

    PiModel(String label, String description) {
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
        rt.append(Markdown.addHeaders(Arrays.asList("Label", "Description")));
        for (PiModel piModel : PiModel.values()) {
            rt.append(Markdown.addValues(Arrays.asList(piModel.getLabel(), piModel.getDescription())));
        }
        return rt.toString();
    }
}

