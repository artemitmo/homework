package les13Exception;


/*
Создать список исключений и заполнить его 9 различными runtime исключениями. Например,
  try {
      int[] arr = new int[5];
      arr[7] = 12;
  } catch (Exception e) {
      exceptionsList.add(e);
  }
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Except3 {
    public static void main(String[] args) {
        List<Exception> list = new ArrayList<>();

        //ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[2];
            arr[3] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            list.add(e);
        }

        //ArithmeticException
        try {
            int newInt = 5/0;
        } catch (ArithmeticException e) {
            list.add(e);
        }

        //NegativeArraySizeException
        try {
            int[] arr1 = new int[-15];
        } catch (NegativeArraySizeException e) {
            list.add(e);
        }

        //NullPointerException
        try {
            String str = null;
            if(str.equals("request")){
            }
        } catch (NullPointerException e) {
            list.add(e);
        }

        //5
        try {
            Integer newInt = Integer.parseInt("abcdef");
        } catch (NumberFormatException e) {
            list.add(e);
        }

        //ArrayStoreException
        try {
            Object[] newStrArr = new String[15];
            newStrArr[2] = 10;
        } catch (ArrayStoreException e) {
            list.add(e);
        }

        //IllegalStateException
        try {
            List newArList = new ArrayList();
            newArList.add("asd");
            newArList.add("fdg");
            Iterator newIt = newArList.iterator();
            while(newIt.hasNext()){
                newIt.remove();
            }
        } catch (IllegalStateException e) {
            list.add(e);
        }

        //UnsupportedOperationException
        try {
            String new1str = "hsdj dsjjd ghjs sjggd";
            String[] str = new1str.split(" ");
            List<String> list2 = Arrays.asList(str);
            list2.add("asdasd");
        } catch (UnsupportedOperationException e) {
            list.add(e);
        }

        //ClassCastException

        try {
            Object i = Integer.valueOf(54);
            String s = (String)i;
        } catch (ClassCastException e) {
            list.add(e);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+1+ ") " + list.get(i));
        }
    }
}