import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JList;

public class CalculatorMouseListener implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        JList list = (JList)e.getSource();
        if(e.getClickCount() == 2){
            if(list.getSelectedIndex() >= 0 && list.getSelectedIndex() <= 8) {
                AdvancedCalculator.getNewCalculator().getFormulaInput().setText(((FunctionListElement) (list.getSelectedValue())).getExpression());
                AdvancedCalculator.getNewCalculator().getFormulaInput().requestFocusInWindow();

                if (list.getSelectedIndex() <= 5) {
                    String textField = AdvancedCalculator.getNewCalculator().getFormulaInput().getText();
                    AdvancedCalculator.getNewCalculator().getFormulaInput().setCaretPosition(textField.length() - 1);
                }
            }
            else if(list.getSelectedIndex() == 9){
                AdvancedCalculator.getNewCalculator().getFormulaInput().setText(AdvancedCalculator.getLestResult());
                AdvancedCalculator.getNewCalculator().getFormulaInput().requestFocusInWindow();
            }
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }
}
