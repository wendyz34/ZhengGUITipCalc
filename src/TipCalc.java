import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class TipCalc extends JFrame implements ActionListener, KeyListener{
    private JTextArea Tip;
    private JButton button1;
    private JTextField textField1;
    private JButton button4;
    private JPanel text;
    private JButton button2;
    private JButton button3;
    private JTextField textField2;
    private JTextArea Total;
    private JTextArea textArea1;
    private int percent = 0;

    public TipCalc(){
        createUIComponents();
    }
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source instanceof JButton){
            JButton button = (JButton) source;
            String text = button.getText();


        }

    }

    @Override
    public void keyTyped(KeyEvent e){}
    @Override
    public void keyPressed(KeyEvent e){

    }
    @Override
    public void keyReleased(KeyEvent e){}




    public void createUIComponents(){
        setContentPane(text);
        setTitle("MY GUI!");
        setSize(500,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        button1.addActionListener(this);
        button2.addActionListener(this);
        textField1.addKeyListener(this);
        setVisible(true);

        text = new JPanel();
        textField1 = new JTextField();
        System.out.println(textField1.getText());

        text.add(textField1);
        textField2 = new JTextField();
        text.add(textField2);
        Tip = new JTextArea();
        text.add(Tip);
        button1 = new JButton("Add");
        text.add(button1);
        button2 = new JButton("Add");
        text.add(button2);
        button3 = new JButton("Minus");
        text.add(button3);
        button4 = new JButton("Minus");
        text.add(button4);
        setVisible(true);







    }


}

