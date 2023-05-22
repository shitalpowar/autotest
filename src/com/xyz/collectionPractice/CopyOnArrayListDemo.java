package src.com.xyz.collectionPractice;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayListDemo {
    public static void main(String[] args) throws Exception {

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        System.out.println("initial capacity:" + getCapacity(list));

        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add(null);
        list.add("AAA");

        System.out.println(list);

        System.out.println("initial capacity:" + getCapacity(list));

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());
            list.add("zzz");
            //itr.remove();

        }


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        ListIterator<String> ltr = list.listIterator();

        while (ltr.hasNext()) {
            System.out.println(ltr.next());
            list.add("zzz");
            ltr.remove();
        }
    }

    public static int getCapacity(Collection cl) throws Exception, Exception {
        Field field = CopyOnWriteArrayList.class.getDeclaredField("array");
        field.setAccessible(true);
        return ((Object[]) field.get(cl)).length;
    }

    }
