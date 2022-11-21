import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {

    JPanel Calcula;
    private JTextField result;
    private JButton btnClear;
    private JButton btn7;
    private JButton btn8;
    private JButton btn4;

    private JButton btnMod;

    private JButton btn5;
    private JButton btn1;
    private JButton btn2;
    private JButton btnDelete;

    private JButton btnDiv;
    private JButton btnMulti;
    private JButton btn6;
    private JButton btnResta;
    private JButton btn3;
    private JButton btnMas;
    private JButton btnDouZero;
    private JButton btnZero;
    private JButton btnDot;
    private JButton btnIgual;


    public Calculadora() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "1");
            }
        });
    }
}
