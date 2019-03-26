import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FunctionList extends JList {

    public FunctionList(JList<FunctionListElement> list, JTextField textField, JTextArea textArea){
        FunctionListElement sinusFunction = new FunctionListElement("Sinus", "sin()");
        FunctionListElement cosinusFunction = new FunctionListElement("Cosinus", "cos()");
        FunctionListElement tangensFunction = new FunctionListElement("Tangens", "tan()");
        FunctionListElement logarithmFunction = new FunctionListElement("Logaithm","log()");
        FunctionListElement moduloFunction = new FunctionListElement("Modulo","mod()");
        FunctionListElement bernoulliNumbersFunction = new FunctionListElement("Bernoulli Number","Bern()");
        FunctionListElement piFunction = new FunctionListElement("PI","pi");
        FunctionListElement eFunction = new FunctionListElement("Euler's number","e");
        FunctionListElement goldenRatioFunction = new FunctionListElement("Golden ratio","[phi]");
        FunctionListElement lastResultFunction = new FunctionListElement("Last result","last_result");

        DefaultListModel<FunctionListElement> listModel = new DefaultListModel<>();
        listModel.addElement(sinusFunction);
        listModel.addElement(cosinusFunction);
        listModel.addElement(tangensFunction);
        listModel.addElement(logarithmFunction);
        listModel.addElement(moduloFunction);
        listModel.addElement(bernoulliNumbersFunction);
        listModel.addElement(piFunction);
        listModel.addElement(eFunction);
        listModel.addElement(goldenRatioFunction);
        listModel.addElement(lastResultFunction);

        list.addMouseListener(new CalculatorMouseListener());
        list.setModel(listModel);
    }

}
