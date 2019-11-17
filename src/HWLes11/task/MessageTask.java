package HWLes11.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритела
        //  Ответ в консоль
        int lowPriority = 0;
        int mediumPriority = 0;
        int highPriority = 0;
        int urgentPriority = 0;

        for (int i = 0; i < messageList.size(); i++) {
            switch(messageList.get(i).getPriority()){
                case LOW:
                    lowPriority +=1;
                    break;
                case MEDIUM:
                    mediumPriority +=1;
                    break;
                case HIGH:
                    highPriority +=1;
                    break;
                case URGENT:
                    urgentPriority +=1;
                    break;
            }
        }
        System.out.println("Кол-во сообщений LOW-приоритета - " + lowPriority);
        System.out.println("Кол-во сообщений MEDIUM-приоритета - " + mediumPriority);
        System.out.println("Кол-во сообщений HIGH-приоритета - " + highPriority);
        System.out.println("Кол-во сообщений URGENT-приоритета - " + urgentPriority);
    }


    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
        ArrayList <Integer> codeArrList = new ArrayList<>(messageList.size());
        HashSet<String> codeHashSet = new HashSet<>();
        
        for (int i = 0; i <messageList.size(); i++) {
            codeArrList.add(messageList.get(i).getCode());
        }

        for (int i = 0; i < codeArrList.size(); i++) {
            String str = "Сообщений с кодом " + codeArrList.get(i) +" найдено " + Collections.frequency(codeArrList, codeArrList.get(i)) + " раз.\n";
            codeHashSet.add(str);
        }
        System.out.println(codeHashSet);
        System.out.println("Количество сообщений для данного кода  - " + messageList.size());

    }

    private static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль

        ArrayList<Message> mesArrList1 = new ArrayList<>();

        for (int i = 0; i < messageList.size(); i++) {
            if( (Collections.frequency(messageList, messageList.get(i)) == 1)){
                mesArrList1.add(messageList.get(i));
            }
        }

        System.out.println("Всего " + mesArrList1.size() + " уникальных сообщений.\n");
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList){
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        ArrayList<Message> mesArrList1 = new ArrayList<>();

        for (int i = 0; i < messageList.size(); i++) {
            if( (Collections.frequency(messageList, messageList.get(i)) == 1)){
                mesArrList1.add(messageList.get(i));
            }
        }
        System.out.println(mesArrList1);
        return messageList;
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority){
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
        System.out.println("Начальный размер списка - " + messageList.size() + " List - " + messageList);
        int counter = 0;
        for (int i = 0; i < messageList.size(); i++) {
            if(messageList.get(i).getPriority()==priority){
                messageList.remove(i);
                --i;
                counter += 1;
            }
        }

        System.out.println("Размер списка после удаления из коллекции - " + messageList.size() + " List - " + messageList);
        System.out.println("Удалено " + counter + " элементов. ");
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority){
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
        System.out.println("Начальный размер списка - " + messageList.size() + " List - " + messageList);
        int counter = 0;
        for (int i = 0; i < messageList.size(); i++) {
            if(messageList.get(i).getPriority()!=priority){
                messageList.remove(i);
                --i;
                counter += 1;
            }
        }
        System.out.println("Размер списка после удаления из коллекции - " + messageList.size() + " List - " + messageList);
        System.out.println("Удалено " + counter + " элементов. ");
    }

    public static void main(String[] args) {
        // вызов методов
        List c = MessageGenerator.generate(15);

        countEachPriority(c);
        System.out.println();

        countEachCode(c);
        System.out.println();

        uniqueMessageCount(c);
        System.out.println();

        uniqueMessagesInOriginalOrder(c);
        System.out.println();

        removeEach(c, MessagePriority.MEDIUM);
        System.out.println();

        removeOther(c, MessagePriority.HIGH);
    }


}
