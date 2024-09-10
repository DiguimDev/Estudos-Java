package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaUtil implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of((temporal.get(ChronoField.DAY_OF_WEEK)));
        int addDays = 1;
        switch (dayOfWeek){
            case FRIDAY: addDays = 3;
            break;
            case SATURDAY: addDays = 2;
            break;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        ObterProximoDiaUtil obterProximoDiaUtil = new ObterProximoDiaUtil();
        Temporal temp = obterProximoDiaUtil.adjustInto(now);
        System.out.println(temp);
    }
}
