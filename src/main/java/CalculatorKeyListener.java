import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CalculatorKeyListener implements KeyListener {

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP){
            AdvancedCalculator.getNewCalculator().getFormulaInput().setText(AdvancedCalculator.getLastCalculation());
        }
        else if(e.getKeyCode() == KeyEvent.VK_ENTER){
            Calculation.calculateFormula();
        }
    }

    public void keyTyped(KeyEvent e) {

    }
}
