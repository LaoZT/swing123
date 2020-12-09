import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {


    JPanel myPanel = new JPanel();
    JLabel label_txt = new JLabel();
    List<JLabel> label_list = new ArrayList<>();

    public App(){
        label_list.add(new JLabel());
        label_list.add(new JLabel());
        label_list.add(new JLabel());

        java.net.URL imgURL = App.class.getResource("img/ball.png");

        label_list.get(0).setIcon(new ImageIcon(imgURL));
        label_list.get(0).setBounds(100,100,800,500);

        label_list.get(1).setIcon(new ImageIcon(imgURL));
        label_list.get(1).setBounds(200,100,800,500);
        label_list.get(2).setIcon(new ImageIcon(imgURL));
        label_list.get(2).setBounds(300,100,800,500);
        myPanel.add(label_list.get(0));
        myPanel.add(label_list.get(1));
        myPanel.add(label_list.get(2));

    }

    void go(){
        label_txt.setText("这是一个Lagel");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("test");
        frame.setContentPane(myPanel);
        frame.setBounds(100,100,500,720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App().go();
    }
}
