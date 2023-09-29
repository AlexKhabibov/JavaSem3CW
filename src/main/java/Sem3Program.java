//public class Sem3Program {
//    public static void main(String[] args) {
//        public static void main(String[] args) {
//
//            Object o = new Object();
//
//            ArrayList<Integer> list = new ArrayList<>();
//            ArrayList<Integer> list1 = new ArrayList<>();
//            List<Integer> list2 = new ArrayList<>(Arrays.asList(0,1,2,3));
//
//            for (int i = 0; i < 10; i++) {
//                list.add(new Random().nextInt(10));
//                list1.add(new Random().nextInt(10));
//            }
//
//// list.add(1);
//// list.add(0, 2);
//// list1.addAll(0, list);
//// Integer i = 1;
//// list.remove(1);
//// list.remove(i);
//// list.contains(i);
//// i = list.get(0);
//// list.set(0, 3);
//// list.indexOf(5);
//// list.lastIndexOf(5);
//// list.subList(0, list.size()/2).clear();
//
//// System.out.println(list);
//// System.out.println(list1);
//// System.out.println("-".repeat(16));
//
//// list.removeAll(list1);
//// list.retainAll(list1);
//// list.removeIf(n -> n%2==0);
//
//// list.sort((o1, o2) -> {
//// if (list2.get(o1)%2==0) return 1;
//// if (list2.get(o2)%2==0) return -1;
//// return 0;
//// });
////
//// System.out.println(list);
//
//            for (int i = 0; i < list.size(); i++) {
//                System.out.print(list.get(i)+", ");
//            }
//
//            for (int i: list) {
//                System.out.print(i);
//            }
//
//            ListIterator<Integer> iterator = list.listIterator(list.size()/2);
//            while (iterator.hasPrevious()){
//                int i = iterator.previous();
//                iterator.add(1);
//                iterator.set(7);
//                System.out.println(i);
//                iterator.remove();
//                iterator.nextIndex();
//            }
//
//            list.forEach(n -> System.out.println(n));
//
//        }
//    }
//}

//Задание:
//        Создать два целочисленных списка.
//        Первый заполнить случайным числом, второй заполнить чётными элементами первого.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

//public class Sem3Program {
//    public static void main(String[] args) {
//
//        ArrayList<Integer> list1 = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list1.add(new Random().nextInt(10));
//        }
//        System.out.println(list1);
//        ArrayList<Integer> list2 = new ArrayList<>(list1);
//        list2.removeIf(n -> n%2 == 1);
//        System.out.println(list2);
//    }
//}

//Задание 2:
//        Создать два списка, Один инт второй стринг.
//        Заполнить первый случайным числом. Второй строковыми значениями первого.

//public class Sem3Program {
//    public static void main(String[] args) {
//        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<String> list2 = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            list1.add(new Random().nextInt(10));
////            list2.add(String.valueOf(list1.get(i)));
//        }
//        list1.forEach(n -> list2.add(0, String.valueOf(n)));
//
//        System.out.println(list1);
//        System.out.println(list2);
//    }
//}

//Задание 3:
//        Создать целочисленный список, найти средний по значению элемент.
//Вариант 1 - Ищем медиану

//public class Sem3Program {
//    public static void main(String[] args) {
//        ArrayList<Integer> list1 = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list1.add(new Random().nextInt(10));
//        }
//        ArrayList<Integer> list2 = new ArrayList<>(list1);
//        list2.sort(Comparator.naturalOrder());
//        int n = list2.get(list2.size()/2);
//
//        System.out.println(list1);
//        System.out.println(list2);
//
//        System.out.println(list1.indexOf(n));
//    }
//}

//Вариает 2 - Ищем ср. арифм.

public class Sem3Program {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(new Random().nextInt(10));
        }
        System.out.println(list1);

//        int sum = 0;
//        for (int i = 0; i < list1.size(); i++) {
//            sum += list1.get(i);
//        }
        int [] n = {list1.stream().mapToInt(e -> e).sum() / list1.size()};
        System.out.println(n[0]);
        list1.sort((o1, o2) -> Math.abs(o1 - n[0]) - Math.abs(o2 - n[0]));
        System.out.println(list1);
    }
}