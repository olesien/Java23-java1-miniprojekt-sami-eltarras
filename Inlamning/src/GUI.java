import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;


public class GUI extends JFrame {

    Dates dates = new Dates();
    private JFrame frame;
    GUI(){

        frame = new JFrame();
        frame.setSize(1000,600);
        frame.setTitle("Kalender");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Layout på frame för att få panelerna att hämta på en rad
        frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.X_AXIS));

        String[] dayTitles = {"Måndag", "Tisdag", "Onsdag", "Torsdag", "Fredag", "Lördag", "Söndag"};
        //Rendera dagar.
        for (int i = 0; i < 7; i++) {
            frame.add(new Day(dates, i, dayTitles[i]));
        }

        
        frame.setVisible(true);
    }

}
