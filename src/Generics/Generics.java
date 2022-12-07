package Generics;

public class Generics {

        public static void main(String[] args) {

            Integer[] intArr = {0, 95, 100, 155, 100, 155, 155};
            Double[] doubleArr = {0.0, 95.00, 100.00, 155.00, 100.00, 155.00, 155.00};

            int countIn = Generics.countGreaterThan(intArr, 95);
            int countDouble = Generics.countGreaterThan(doubleArr, 155.00);

            System.out.println("Counting of greater than 95 on Integer array: " + countIn);
            System.out.println("Counting of greater than 155.00 on Double array: " + countDouble);
        }

        private static <T extends Comparable<T>> int countGreaterThan(T[] elements, T number) {
            int count = 0;

            for (T element : elements) {
                if (element.compareTo(number) > 0)
                    count++;
            }
            return count;
        }
    }
