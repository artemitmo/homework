package les13Exception;
import java.util.Scanner;
public class Except1 {
    /*
Написать калькулятор.
Калькулятор считывает с консоли одно из выражений (n+m / n-m / nХm / n/m, где n и m - целые числа)
или exit для завершения работы. Калькулятор выводит результат вычисления в консоль,
после чего ожидает ввода нового выражения или exit для завершения работы.
В случае если введенное выражение не совпадает с заданным шабломом, выбрасывает исключения:
отсутствуют n или m - выбрасывать один тип исключения, указан не тот оператор - выбрасывать другое исключение,
в качестве оператора указан /, а второй операнд 0, либо n или m не целые числа - выбрасывать третий тип исключения.
Необходимо написать свои классы исключений. Исключения должны быть проверяемыми (checked).
 Метод исключений getMessage() необходимо переопределить (реализация на Ваше усмотрение).
     */
    public static void main(String[] args) {
        while (true) {
            System.out.println("Калькулятор считывает с консоли одно из выражений (n+m / n-m / nХm / n/m, где n и m - целые числа)\n" +
                            "или exit для завершения работы. Калькулятор выводит результат вычисления в консоль,\n" +
                            "после чего ожидает ввода нового выражения или exit для завершения работы. " +  "Введите число ");
            Scanner in = new Scanner(System.in);
            String str = "";
            str = in.nextLine();
            String exitStr = "exit";
            if(str.equals(exitStr.toLowerCase())){
                break;
            } else{
                //достаю из строки числа и складываю их в переменные
                String[] str1 = new String[1];
                int number1 = 0;
                int number2 = 0;

                try {
                    str1 = str.replaceAll("[+xх/-]", ";").split(";");
                    number1 = Integer.parseInt(str1[0]);
                    number2 = Integer.parseInt(str1[1]);
                } catch (IndexOutOfBoundsException e){

                    System.out.println("Неправильный формат ввода данных!!");
                    continue;
                }
                catch (NumberFormatException e){
                    System.out.println("Неправильный формат ввода данных, можно вводить только целые числа!");
                    continue;
                }

                String str2 = str.replaceAll("[^+xх/-]", "");
                Integer number3 = 0;

                if (str2.equals("+") || str2.equals("-") || str2.equals("x") || str2.equals("х") || str2.equals("/")) {

                    switch (str2) {

                        case "+":
                            number3 = number1 + number2;
                            System.out.println("Результат: " + number3);
                            break;

                        case "-" :
                            number3 = number1 - number2;
                            System.out.println("Результат: " + number3);
                            break;

                        case "/":
                            try {
                                number3 = number1 / number2;
                                System.out.println("Результат: " + number3);
                                break;
                            } catch (ArithmeticException e) {
                                System.out.println("Деление на ноль запрещено.\n");
                                continue;
                            }
                    }
                } else {
                    System.out.println("Ввод не соответствует условия, попробуйте снова ");
                    continue;

                }
            }
        }
    }
}
