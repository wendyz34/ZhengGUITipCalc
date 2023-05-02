import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class TipCalc extends JFrame implements ActionListener, KeyListener{
    private JTextArea Tip;
    private JButton addTip;
    private JTextField textField1;
    private JButton button4;
    private JPanel text;
    private JButton button2;
    private JButton button3;
    private JTextField textField2;
    private JTextArea TotalInput;
    private JTextArea people;
    private TipCalculator calc;
    private int percent = 0;

    public TipCalc(){
        createUIComponents();
    }
    public void createUIComponents(){
        setContentPane(text);
        setTitle("MY GUI!");
        setSize(500,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addTip.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        textField1.addKeyListener(this);
        setVisible(true);


    }
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        double value = 0;
        if (source instanceof JButton) {
            if (source instanceof JButton) {
                JButton button = (JButton) source;
                String text = button.getText();
                if (button.equals(addTip)) {
                    value++;
                   // value = Double.parseDouble(textField1.getText());
                    people.setText(value + "");

                    /*percent = Integer.parseInt(textField1.getText());
                    button.setText(textField1.getText());*/


                }
            }


        }



    }
}

