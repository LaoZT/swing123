import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends FocusAdapter{
    JPanel myPanel = new JPanel();
    JLabel label_txt = new JLabel();
    JTextArea textArea_A = new JTextArea();
    JTextArea textArea_B = new JTextArea();

    //    构造方法;
    public App () {
        textArea_A.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                textArea_A.setText("");
            }
        });
        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (textArea_A.getText().equals("王大锤")) {
                        textArea_B.setText("回答正确");

                    } else {
                        textArea_B.append("丑拒");
                    }
                    textArea_A.setText("");
                }
            }
        });

    }

    //显示常规方法
    void go() {
        textArea_A.setBounds(100, 100, 300, 100);
        textArea_A.setBackground(Color.YELLOW);
        textArea_A.append("魔镜魔镜，谁最美");


        textArea_B.setBounds(100, 200, 300, 100);
        textArea_B.setBackground(Color.PINK);
        myPanel.add(textArea_A);
        myPanel.add(textArea_B);

        JFrame frame = new JFrame("键盘监听");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 512, 720);
        frame.setVisible(true);
        textArea_B.dispatchEvent(new FocusEvent(textArea_B,FocusEvent.FOCUS_GAINED,true));
        textArea_B.requestFocusInWindow();
    }

    public static void main(String[] args) {
        new App().go();
    }
}
