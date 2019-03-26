public class FunctionListElement {
    private String name;
    private String expression;

    public FunctionListElement(String name, String expression) {
        this.name = name;
        this.expression = expression;
    }

    public String toString() {
        return name;
    }

    public String getExpression() {
        return expression;
    }
}
