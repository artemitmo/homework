package les11aud;
//Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
//Удалить из множества все числа больше 10.

import java.util.HashSet;
import java.util.Iterator;

public class HashSet3 {
    public static void main ( String[] args ) {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(19);
        set.add(18);
        set.add(17);
        set.add(14);
        set.add(15);
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(16);
        set.add(9);
        set.add(8);
        set.add(7);
        set.add(6);
        set.add(5);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(1);
        //То же самое
        for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext(); )
        if (iterator.next() > 10)
        iterator.remove();
        System.out.println(set);

        //set.removeIf(integer -> integer > 10);
        //System.out.println(set);

    }
}
