package les13Exception;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;
import java.util.jar.JarException;

/*
Метод static void throwException(Status status) throws JarException, FileNotFoundException,
AccessDeniedException принимает на вход enum и выбрасывает следующие исключения в зависимости от значения status:
если status FILE_NOT_FOUND, выбрасывает FileNotFoundException
если status ACCESS_DENIED, выбрасывает AccessDeniedException
если status JAR_ERROR, выбрасывает JarException.
При вызове метода throwException обработать исключения следующим образом: FileNotFoundException - выводить в консоль стек трейс,
AccessDeniedException - выводить в консоль сообщение исключения (метод getMessage()) и снова выбрасывать exception,
JarException - выводить в консоль стек трейс.
enum с необходимыми константами нужно создать.
 */

public class Except2 {
    public static void main(String[] args) {
        throwException(Status.ACCESS_DENIED);
    }

    enum Status {
        FILE_NOT_FOUND, ACCESS_DENIED, JAR_ERROR
    }

    public static void throwException(Status status){
        switch(status) {
            case FILE_NOT_FOUND:
                try {
                    throw new FileNotFoundException("File not found!");

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    break;

                }
            case ACCESS_DENIED:
                try {
                    throw new AccessDeniedException("File not found!");
                } catch (AccessDeniedException e) {
                    System.out.println(e.getMessage());
                    try {
                        throw new AccessDeniedException("File not found!");
                    } catch (AccessDeniedException ex) {
                        ex.printStackTrace();
                    }

                    break;
                }
            case JAR_ERROR:
                try {
                    throw new JarException("File not found!");
                } catch (JarException e) {
                    e.printStackTrace();
                    break;
                }
        }

    }

}
