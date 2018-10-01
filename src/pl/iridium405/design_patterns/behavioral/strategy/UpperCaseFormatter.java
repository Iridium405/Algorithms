package pl.iridium405.design_patterns.behavioral.strategy;

public class UpperCaseFormatter implements TextFormatterStrategy {


    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
