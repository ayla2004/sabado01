
    import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {

        int[] tempVector = new int[100];
        int number, counter;
        counter = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            tempVector[i] = number;
            counter++;
        }

        //Clean the tempVector
        int[] vector = new int[counter];
        for (int i = 0; i < counter; i++) {
            vector[i] = tempVector[i];
        }

        System.out.println("O maior número digitado: " + findSmallestNumber(vector));
        System.out.println("O menor número digitado: " + findLargestNumber(vector));
        System.out.println("A soma de todos os números: " + AddAllNumbers(vector));

        eachNumberLessLargest(vector);
        eachNumberPlusSmallest(vector);
        differenceBetweenAverage(vector);

    }

    static int findLargestNumber(int[] vector) {
        int largestNumber = 1;
        for (int i : vector) {
            if (i > largestNumber) {
                largestNumber = i;
            }
        }
        return largestNumber;
    }

    static int findSmallestNumber(int[] vector) {
        int smallestNumber = 100;
        for (int i : vector) {
            if (i < smallestNumber) {
                smallestNumber = i;
            }
        }
        return smallestNumber;
    }

    static int AddAllNumbers(int[] vector) {
        int sum = 0;
        for (int i : vector) {
            sum = sum + i;
        }
        return sum;
    }

    static void eachNumberLessLargest(int[] vector) {
        int largestNumber;
        largestNumber = findLargestNumber(vector);

        System.out.println("Cada número digitado subtraído do maior: ");
        for (int i : vector) {
            System.out.println(i - largestNumber);
        }
    }

    static void eachNumberPlusSmallest(int[] vector) {
        int smallestNumber;
        smallestNumber = findSmallestNumber(vector);

        System.out.println("Cada número digitado acrescido do menor: ");
        for (int i : vector) {
            System.out.println(i + smallestNumber);
        }
    }

    static void differenceBetweenAverage(int[] vector) {
        int average, sum;
        sum = AddAllNumbers(vector);
        average = sum / vector.length;

        System.out.println("A diferença entre o número digitado e a média de todos os números");
        for (int i : vector) {
            System.out.println(i - average);
        }
    }


}

