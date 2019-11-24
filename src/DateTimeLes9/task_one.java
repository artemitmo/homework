package DateTimeLes9;
import java.time.LocalTime;
public class task_one {
        /*
        1. Есть три рабочие смены:
        1. с 7:00 до 15:00
        2. с 15:00 до 23:00
        3. с 23:00 до 7:00
        Определить, какая сейчас смена(относительно текущего времени)
        */

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        method1(time);
    }

    public static void method1 (LocalTime tm){
        if (tm.isAfter(LocalTime.of(7,0)) && tm.isBefore(LocalTime.of(15,0))) {
            System.out.println("Работает 1 смена");
        }
        else if (tm.isAfter(LocalTime.of(15,0)) && tm.isBefore(LocalTime.of(23,0))) {
            System.out.println("Работает 2 смена");
        }
        else {
            System.out.println("Работает 3 смена");
        }
    }
}
