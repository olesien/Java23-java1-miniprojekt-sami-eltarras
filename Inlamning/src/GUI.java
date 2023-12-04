import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;


public class GUI extends JFrame implements ActionListener {

    Dates dates = new Dates();
    private JFrame frame;
    private JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7, textfieldPanel;
    private JLabel label1, label2, label3, label4,label5,label6,label7,label8, label9, label10, label11, label12,label13,label14;
    private JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7;
    private JButton button1, button2, button3, button4, button5, button6, button7;
    private JTextArea textArea1, textArea2, textArea3, textArea4,textArea5,textArea6,textArea7;
    GUI(){

        frame = new JFrame();
        frame.setSize(1000,600);
        frame.setTitle("Kalender");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Layout på frame för att få panelerna att hämta på en rad
        frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.X_AXIS));

        //Panel 1 med allt innehåll för måndag.
        panel1 = new JPanel();
        //panel för att innehållet ska gå ner
        panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));

        label1 = new JLabel();
        label2 = new JLabel();
        label1.setText("Måndag");
        //Lägger in måndagens dag + månad in i label.
        label2.setText(dates.day.get(0) + dates.month.get(0));

        //För att visa om det är måndag idag genom att ändra texten i label.
        if (Objects.equals(dates.week.get(0), LocalDate.now())) {
            label1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        }

        //textarea som visas efter man skapar event.
        textArea1 = new JTextArea();
        textArea1.setVisible(false);

        //textfield för input om sitt event
        textField1 = new JTextField();
        textField1.setFont(new Font("Times New Roman", Font.PLAIN,20));
        textField1.setText("Skapa Event");

        //Panel med borderlayout för att ha textrutan i center
        textfieldPanel = new JPanel(new BorderLayout(10,0));
        textfieldPanel.add(textField1, BorderLayout.CENTER);

        //button hamnar i botten,
        button1 = new JButton("Skapa event");
        button1.addActionListener(this);
        textfieldPanel.add(button1, BorderLayout.PAGE_END);

        //lägga in allt i sina paneler
        panel1.add(label1);
        panel1.add(label2);
        panel1.add(textArea1);
        panel1.add(textfieldPanel);
        frame.add(panel1);

        //Panel 2 med samma uppsättning som panel1.
        panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2,BoxLayout.Y_AXIS));

        label3 = new JLabel();
        label4 = new JLabel();
        label3.setText("Tisdag");
        label4.setText(dates.day.get(1) + " " + dates.month.get(1));

        if (Objects.equals(dates.week.get(1), LocalDate.now())) {
            label3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        }

        textArea2 = new JTextArea();
        textArea2.setVisible(false);

        textField2 = new JTextField();
        textField2.setText("Skapa event");
        textField2.setFont(new Font("Times New Roman", Font.PLAIN,20));

        textfieldPanel = new JPanel(new BorderLayout(10,0));
        textfieldPanel.add(textField2, BorderLayout.CENTER);

        button2 = new JButton("Skapa event");
        button2.addActionListener(this);
        textfieldPanel.add(button2, BorderLayout.PAGE_END);

        panel2.add(label3);
        panel2.add(label4);
        panel2.add(textArea2);
        panel2.add(textfieldPanel);
        frame.add(panel2);

        //Panel 3 med allt innehåll för onsdag
        panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3,BoxLayout.Y_AXIS));

        label5 = new JLabel();
        label6 = new JLabel();
        label5.setText("Onsdag");
        label6.setText(dates.day.get(2) + " " + dates.month.get(2));

        if (Objects.equals(dates.week.get(2), LocalDate.now())) {
            label5.setFont(new Font("Times New Roman", Font.BOLD, 20));
        }

        textArea3 = new JTextArea();
        textArea3.setVisible(false);

        textField3 = new JTextField();
        textField3.setText("Skapa event");
        textField3.setFont(new Font("Times New Roman", Font.PLAIN,20));

        textfieldPanel = new JPanel(new BorderLayout(10,0));
        textfieldPanel.add(textField3, BorderLayout.CENTER);

        button3 = new JButton("Skapa event");
        button3.addActionListener(this);
        textfieldPanel.add(button3, BorderLayout.PAGE_END);

        panel3.add(label5);
        panel3.add(label6);
        panel3.add(textArea3);
        panel3.add(textfieldPanel);
        frame.add(panel3);

        //Panel 4 med allt innehåll för torsdag
        panel4 = new JPanel();
        panel4.setLayout(new BoxLayout(panel4,BoxLayout.Y_AXIS));

        label7 = new JLabel();
        label8 = new JLabel();
        label7.setText("Torsdag");
        label8.setText(dates.day.get(3) + " " + dates.month.get(3));

        if (Objects.equals(dates.week.get(3), LocalDate.now())) {
            label7.setFont(new Font("Times New Roman", Font.BOLD, 20));
        }

        textArea4 = new JTextArea();
        textArea4.setVisible(false);

        textField4 = new JTextField();
        textField4.setText("Skapa event");
        textField4.setFont(new Font("Times New Roman", Font.PLAIN,20));

        textfieldPanel = new JPanel(new BorderLayout(10,0));
        textfieldPanel.add(textField4, BorderLayout.CENTER);

        button4 = new JButton("Skapa event");
        button4.addActionListener(this);
        textfieldPanel.add(button4, BorderLayout.PAGE_END);

        panel4.add(label7);
        panel4.add(label8);
        panel4.add(textArea4);
        panel4.add(textfieldPanel);
        frame.add(panel4);

        //Panel 5 med allt innehåll för fredag
        panel5 = new JPanel();
        panel5.setLayout(new BoxLayout(panel5,BoxLayout.Y_AXIS));

        label9 = new JLabel();
        label10 = new JLabel();
        label9.setText("Fredag");
        label10.setText(dates.day.get(4) + " " + dates.month.get(4));

        if (Objects.equals(dates.week.get(4), LocalDate.now())) {
            label9.setFont(new Font("Times New Roman", Font.BOLD, 20));
        }

        textArea5 = new JTextArea();
        textArea5.setVisible(false);

        textField5 = new JTextField();
        textField5.setText("Skapa event");
        textField5.setFont(new Font("Times New Roman", Font.PLAIN,20));

        textfieldPanel = new JPanel(new BorderLayout(10,0));
        textfieldPanel.add(textField5, BorderLayout.CENTER);

        button5 = new JButton("Skapa event");
        button5.addActionListener(this);
        textfieldPanel.add(button5, BorderLayout.PAGE_END);

        panel5.add(label9);
        panel5.add(label10);
        panel5.add(textArea5);
        panel5.add(textfieldPanel);
        frame.add(panel5);

        //Panel 6 med allt innehåll för lördag
        panel6 = new JPanel();
        panel6.setLayout(new BoxLayout(panel6,BoxLayout.Y_AXIS));

        label11 = new JLabel();
        label12 = new JLabel();
        label11.setText("Lördag");
        label12.setText(dates.day.get(5) + " " + dates.month.get(5));

        if (Objects.equals(dates.week.get(5), LocalDate.now())) {
            label11.setFont(new Font("Times New Roman", Font.BOLD, 20));
        }

        textArea6 = new JTextArea();
        textArea6.setVisible(false);

        textField6 = new JTextField();
        textField6.setText("Skapa event");
        textField6.setFont(new Font("Times New Roman", Font.PLAIN,20));

        textfieldPanel = new JPanel(new BorderLayout(10,0));
        textfieldPanel.add(textField6, BorderLayout.CENTER);

        button6 = new JButton("Skapa event");
        button6.addActionListener(this);
        textfieldPanel.add(button6, BorderLayout.PAGE_END);

        panel6.add(label11);
        panel6.add(label12);
        panel6.add(textArea6);
        panel6.add(textfieldPanel);
        frame.add(panel6);

        //Panel 7 med allt innehåll för söndag
        panel7 = new JPanel();
        panel7.setLayout(new BoxLayout(panel7,BoxLayout.Y_AXIS));

        label13 = new JLabel();
        label14 = new JLabel();
        label13.setText("Söndag");
        label14.setText(dates.day.get(6) + " " + dates.month.get(6));

        if (Objects.equals(dates.week.get(6), LocalDate.now())) {
            label13.setFont(new Font("Times New Roman", Font.BOLD, 20));
        }

        textArea7 = new JTextArea();
        textArea7.setVisible(false);

        textField7 = new JTextField();
        textField7.setText("Skapa event");
        textField7.setFont(new Font("Times New Roman", Font.PLAIN,20));

        textfieldPanel = new JPanel(new BorderLayout(10,0));
        textfieldPanel.add(textField7, BorderLayout.CENTER);

        button7 = new JButton("Skapa event");
        button7.addActionListener(this);
        textfieldPanel.add(button7, BorderLayout.PAGE_END);

        panel7.add(label13);
        panel7.add(label14);
        panel7.add(textArea7);
        panel7.add(textfieldPanel);
        frame.add(panel7);

        
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Metod för att hämta text från textField och lägga in i textArea + visa textArea efter man tryckt på knapp.
        if (e.getSource()==button1){
            textArea1.setText(textField1.getText());
            textArea1.setVisible(true);
        } else if (e.getSource()==button2) {
            textArea2.setText(textField2.getText());
            textArea2.setVisible(true);
        } else if (e.getSource()==button3) {
            textArea3.setText(textField3.getText());
            textArea3.setVisible(true);
        } else if (e.getSource()==button4) {
            textArea4.setText(textField4.getText());
            textArea4.setVisible(true);
        }else if (e.getSource()==button5) {
            textArea5.setText(textField5.getText());
            textArea5.setVisible(true);
        }else if (e.getSource()==button6) {
            textArea6.setText(textField6.getText());
            textArea6.setVisible(true);
        }else if (e.getSource()==button7) {
            textArea7.setText(textField7.getText());
            textArea7.setVisible(true);
        }
    }
}
