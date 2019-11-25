package be.webtechie.piheaders;

import be.webtechie.piheaders.definition.HeaderPins;
import be.webtechie.piheaders.definition.BoardModel;
import be.webtechie.piheaders.definition.PiModel;
import be.webtechie.piheaders.definition.HeaderVersion;
import be.webtechie.piheaders.definition.PinFunction;
import be.webtechie.piheaders.definition.PinType;
import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UpdateReadme {
    public static void main(String[] args) {
        try {
            File resourceDirectory = getResourcesDirectory("README.md.template");

            StringBuilder rt = new StringBuilder();
            rt.append(Files.readString(Paths.get(resourceDirectory.getPath(), "README.md.template")));

            rt.append("### Pi models\n\n");
            rt.append(PiModel.toMarkdownTable());

            rt.append("\n\n");

            rt.append("### Pi board versions\n\n");
            rt.append(BoardModel.toMarkdownTable());

            rt.append("\n\n");

            rt.append("### Pin types\n\n");
            rt.append(PinType.toMarkdownTable());

            rt.append("\n\n");

            rt.append("### Pin functions\n\n");
            rt.append(PinFunction.toMarkdownTable());

            rt.append("\n\n");

            rt.append("### Pi header versions\n\n");
            rt.append(HeaderVersion.toMarkdownTable());

            rt.append("\n\n");

            rt.append("### Header types\n\n");
            for (HeaderPins headerPins : HeaderPins.values()) {
                rt.append("#### ").append(headerPins.getLabel()).append("\n\n");
                rt.append(HeaderPins.toMarkdownTable(headerPins));
                rt.append("\n\n");
            }

            String outputFile = Paths.get(resourceDirectory.getParent(), "README.md").toString();
            try (PrintWriter out = new PrintWriter(outputFile)) {
                out.println(rt.toString());
            }
        } catch (Exception ex) {
            System.err.println("Error while generating README file: " + ex.getMessage());
        }
    }

    // get file from classpath, resources folder
    private static File getResourcesDirectory(String fileName) {
        ClassLoader classLoader = UpdateReadme.class.getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile()).getParentFile();
        }
    }
}
