import java.time.LocalDate;
import java.util.ArrayList;

public class Dates {

    //Egenskaper
    LocalDate today = LocalDate.now();
    int dayOfWeek = today.getDayOfWeek().getValue();
    ArrayList <LocalDate> week = new ArrayList<>();
    ArrayList <String> day = new ArrayList<>();
    ArrayList <String> month = new ArrayList<>();

    //Konstruktor så det alltid körs så jag kan få rätt vecka + rätt dag + rätt månad.
    Dates (){
        createWeek();
        getDayMonth();
    }

    // loopar getdayofweek för att alltid få fram måndag-söndag.
    public void createWeek (){
        for (int i = 1; i < dayOfWeek; i++){
        week.add(today.minusDays(dayOfWeek-i));
    }
        for (int i = dayOfWeek; i <= 7; i++){
        week.add(today.plusDays(i-dayOfWeek));
        }
    }

    //getter för att få ut och komma åt veckan.
    public ArrayList <LocalDate> getWeek (){
        return week;
    }

    //gå igenom min week array och plocka sedan ut dag + månad och spara i separat array.
    public void getDayMonth (){
        for (LocalDate dayOfWeek : week){
            day.add(String.valueOf(dayOfWeek.getDayOfMonth()));
            month.add(String.valueOf(dayOfWeek.getMonth()));
        }
    }

    //getter för att komma åt dagen.
    public ArrayList <String> getDay(){
        return day;
    }

    //getter för att komma åt månaden.
    public ArrayList <String> getMonth(){
        return month;
    }
}
