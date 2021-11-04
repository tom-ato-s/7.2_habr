//// программа сравнивает работу с LinketList и ArrayList
//// скорости их выполнения https://habr.com/ru/post/440436/
//
//import java.util.LinkedList;
//import java.util.ArrayList;
//public class Compare {
//    final int N= 1_000_000; //количество элементов в массиве
//    final int M = 1000; // количество взятых случайных значений из массивов
//    private ArrayList<Double> array; // сгенерированный массив Array
//    private LinkedList<Double> linked; // сгенерированный массив List
////
////    private ArrayList arraySel; // отобранный массив Array
////    private LinkedList linkedSel; // отобранный массив List
//
//    public Compare(ArrayList array, LinkedList linked) {
//        array = new ArrayList();
//        linked = new LinkedList();
//        this.array = array;
//        this.linked = linked;
//    }
//
//    public void fillLists(ArrayList array, LinkedList linked) {  // заполняем списки произвольными значениями
//        for(int i = 0; i<N; i++) {
//            array.add(Math.random());
//            linked.add(Math.random());
//        }
//    }
//
//    public void selectionArr(ArrayList array) {
// //       arraySel = new ArrayList();
//        long startTime = System.currentTimeMillis();
//        for( int i = 0; i<M; i++) {
//            int r = (int) Math.random() * (N-1);
//
//          array.get(r) ;
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("Total execution time: " + (endTime-startTime) + "ms");
//    }
//
//    public void selectionLink(LinkedList linked) {
// //       linkedSel = new LinkedList();
//        long startTime = System.currentTimeMillis();
//        for( int i = 0; i<M; i++) {
//            int r = (int) Math.random() * (N-1);
//           linked.get(r);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("Total execution time: " + (endTime-startTime) + "ms");
//    }
//
//}
