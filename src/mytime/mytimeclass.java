package mytime;

import org.jetbrains.annotations.NotNull;
import sun.invoke.empty.Empty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class mytimeclass {

    public static Date getNDate(int n, Object d){
        Date o = null;
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        if(d instanceof Date) {
            o = (Date) d;
        }
        else if(d instanceof String) {
            try {
                o = ft.parse(d.toString());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        Calendar now = Calendar.getInstance();
        now.setTime(o);
        now.set(Calendar.DATE,now.get(Calendar.DATE)+n);
        return now.getTime();
    }

    public static int getWeekOfDate(Object d){
        Date o = null;
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        if(d instanceof Date) {
            o = (Date) d;
        }
        else if(d instanceof String) {
            try {
                o = ft.parse(d.toString());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(o);
        return cal.get(Calendar.DAY_OF_WEEK) - 1;
    }
}
