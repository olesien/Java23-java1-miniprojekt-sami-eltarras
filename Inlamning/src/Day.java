import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.Objects;

public class Day extends JPanel {

    private JPanel textfieldPanel;
    private JLabel label1, label2;
    private JTextField textField1;

    private JButton button1;

    private JTextArea textArea1;
    Day(Dates dates, int day, String dayTitle) {
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));

        label1 = new JLabel();
        label2 = new JLabel();
        label1.setText(dayTitle);
        //Lägger in dag + månad in i label.
        label2.setText(dates.day.get(day) + dates.month.get(day));

        //För att visa om det är denna dagen idag genom att ändra texten i label.
        if (Objects.equals(dates.week.get(day), LocalDate.now())) {
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
        button1.addActionListener(e -> {
            textArea1.setText(textField1.getText());
            textArea1.setVisible(true);
        });
        textfieldPanel.add(button1, BorderLayout.PAGE_END);

        //lägga in allt i sina paneler
        this.add(label1);
        this.add(label2);
        this.add(textArea1);
        this.add(textfieldPanel);
    }
}
