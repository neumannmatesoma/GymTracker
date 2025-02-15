package CalendarJava;

import android.app.Activity;
import android.app.Fragment;
import android.widget.TextView;

import com.example.gymtracker.HomeFragment;
import com.example.gymtracker.R;

import java.time.LocalDate;


public class CalendarDate {

    /*static Activity a;
    public CalendarDate(Activity activity) {
        this.a = activity;
    }*/

    public static void setMonth(HomeFragment activity, int id) {
        LocalDate date = LocalDate.now();

        String[] months = {"January", "February", "March", "April", "May", "Juna", "July", "August", "September", "October", "November", "December"};

        TextView tv = (TextView) activity.getView().findViewById(id);
        tv.setText(months[date.getMonthValue()-1]);
    }

    public void setWeekDates(HomeFragment activity, int id) {

    }
}
