package pl.iridium405.design_patterns.behavioral.strategy;

public class LowerCaseFormatter implements TextFormatterStrategy {



    @Override
    public String format(String text) {
        return text.toLowerCase();
    }
}
