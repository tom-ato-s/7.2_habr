//// программа сравнивает работу с LinketList и ArrayList
//// скорости их выполнения https://habr.com/ru/post/440436/

//Данный класс - вариант от Автора
// остальгые вкладки - варианты моию
import java.util.ArrayList;
import java.util.LinkedList;

public class OrifinOfAvtore {

    public static void main(String[] args) {


        final int N = 1_000_000; //количество элементов в массиве
        final int M = 1000; // количество взятых случайных значений из массивов
        ArrayList<Double> array = new ArrayList<>(); // сгенерированный массив Array
        LinkedList<Double> linked = new LinkedList<>(); // сгенерированный массив List

        for(int i = 0; i<N; i++) {
            array.add(Math.random());
            linked.add(Math.random());
        }


        long startTime = System.currentTimeMillis();
        for( int i = 0; i<M; i++) {
            int r = (int) Math.random() * (N-1);

            array.get(r) ;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime) + "ms");

         startTime = System.currentTimeMillis();
        for( int i = 0; i<M; i++) {
            int r = (int) Math.random() * (N-1);
            linked.get(r);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime) + "ms");




    }
}
