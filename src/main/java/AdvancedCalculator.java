import javax.swing.SwingUtilities;

public class AdvancedCalculator {

    public static CalculatorGUI getNewCalculator() {
        return newCalculator;
    }

    public static String getLastCalculation() {
        return lastCalculation;
    }

    public static void setLastCalculation(String lastCalculation) {
        AdvancedCalculator.lastCalculation = lastCalculation;
    }

    public static String getLestResult() {
        return lestResult;
    }

    public static void setLestResult(String lestResult) {
        AdvancedCalculator.lestResult = lestResult;
    }

    private static CalculatorGUI newCalculator;
    private static String lastCalculation = "";
    private static String lestResult;


    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                newCalculator = new CalculatorGUI();
                newCalculator.getFormulaInput().addKeyListener(new CalculatorKeyListener());
                newCalculator.getEvaluateButton().addActionListener(new CalculatorActionListener());
                new FunctionList(newCalculator.getFunctionList(),newCalculator.getFormulaInput(),newCalculator.getHistoryTextArea());

            }
        });

    }

}



