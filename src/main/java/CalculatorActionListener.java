import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorActionListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(AdvancedCalculator.getNewCalculator().getEvaluateButton().getText())){
            Calculation.calculateFormula();
        }
    }
}
