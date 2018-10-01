package pl.iridium405.design_patterns.behavioral.strategy;

public class FormatterContext {

    private TextFormatterStrategy strategy;

    public FormatterContext() {
        this.strategy = new UpperCaseFormatter();
    }

    public void setStrategy(TextFormatterStrategy strategy) {
        this.strategy = strategy;
    }

    public void print(String text) {
        String formattedText = strategy.format(text);
        System.out.println(formattedText);
    }


}
