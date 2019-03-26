import org.mariuszgromada.math.mxparser.Expression;
import java.text.MessageFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Calculation {

    public static void calculateFormula(){
        String lastCalculation = AdvancedCalculator.getNewCalculator().getFormulaInput().getText();
        Expression expression = new Expression(lastCalculation);
        AdvancedCalculator.setLastCalculation(lastCalculation);

        if(expression.checkSyntax()){
            double calculated = expression.calculate();
           String result = MessageFormat.format(
                    "{2} = {0} \t Calculated at {1,time} on {1,date}. \n",
            calculated, new Date(), AdvancedCalculator.getLastCalculation());
           AdvancedCalculator.getNewCalculator().getHistoryTextArea().append(result);
           AdvancedCalculator.getNewCalculator().getFormulaInput().setText("");
           String lastResult = "";
           lastResult += calculated;
           AdvancedCalculator.setLestResult(lastResult);

        }
        else {
            String errorMessage = expression.getErrorMessage();
            JOptionPane.showMessageDialog(null,"Invalid argument","Error",JOptionPane.ERROR_MESSAGE);
            AdvancedCalculator.getNewCalculator().getFormulaInput().setText("");
        }

    }

}
