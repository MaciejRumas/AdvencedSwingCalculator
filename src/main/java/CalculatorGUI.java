import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CalculatorGUI {

    public JTextArea getHistoryTextArea() {
        return historyTextArea;
    }

    public JTextField getFormulaInput() {
        return formulaInput;
    }

    public JList getFunctionList(){
        return functionList;
    }

    public JButton getEvaluateButton() {
        return evaluateButton;
    }

    private JPanel mainPanel;
    private JTextArea historyTextArea;
    private JTextField formulaInput;
    private JList<FunctionListElement> functionList;
    private JButton evaluateButton;
    private JScrollPane ScrollContainerPane;

    private void createUIComponents(){


        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;

        mainPanel = new JPanel();

        JFrame calculatorFrame = new JFrame();
        calculatorFrame.setTitle("Advanced Swing Calculator");
        calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculatorFrame.setSize(screenWidth/2,screenHeight/2);

        JMenuBar calculatorMenuBar = new JMenuBar();
        JMenu calculatorMenu = new JMenu("Options");
        JMenuItem resetItem, exitItem;


        resetItem = new JMenuItem("Reset");
        resetItem.setMnemonic(KeyEvent.VK_R);
        resetItem.addActionListener(e -> {
            historyTextArea.setText("");
            formulaInput.setText("");
        });

        exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic(KeyEvent.VK_E);
        exitItem.addActionListener(e -> System.exit(0));

        calculatorMenu.add(resetItem);
        calculatorMenu.add(exitItem);

        calculatorMenuBar.add(calculatorMenu);

        calculatorFrame.setJMenuBar(calculatorMenuBar);
        calculatorFrame.setVisible(true);
        calculatorFrame.setContentPane(mainPanel);

    }

}
