package app.utils.parser;

public class Parser {

    public static void parse(String[] args) {
        Config config = Config.parseArguments(args);

        if (config.inputFiles.isEmpty()) {
            System.err.println("No input files specified.");
            return;
        }

        DataProcessor processor = new DataProcessor(config);
        processor.processFiles();
        processor.writeResults();
        processor.printStatistics();
    }

}

