package DateTimeLes9;
import java.time.DayOfWeek;
import java.time.LocalDate;

 /*
 2. Наши занятия закончатся 20 января 2020 года. Сколько занятий осталось, если они
 проходят 3 раза в неделю(пн, ср, пт). Праздничные дни не учитывать.
 */

public class task_two {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate lastLessonDate = LocalDate.of(2020, 01, 20);
        int counter = 0;

        for(LocalDate date = today; date.isBefore(lastLessonDate); date = date.plusDays(1)){
            if(date.getDayOfWeek()== DayOfWeek.MONDAY || date.getDayOfWeek()== DayOfWeek.WEDNESDAY || date.getDayOfWeek()== DayOfWeek.FRIDAY){
                counter += 1;
            }
        }
        System.out.println("Еще " + counter + " урока до конца обучения");
    }
}
