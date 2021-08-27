
    import java.util.Scanner;

    public class atividade4 {
    
        public static void main(String[] args) {
            int number;
    
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
    
            int[] vector = new int[number];
    
            for (int i = 0; i < vector.length; i++) {
                vector[i] = scanner.nextInt();
            }
    
            sortVector(vector);
    
            for (int i : vector) {
                System.out.println(i);
            }
        }
    
        static void sortVector(int[] vector) {
            int temp;
            for (int i = 0; i < vector.length; i++) {
                for (int j = 0; j < vector.length; j++) {
                    if (vector[i] < vector[j]) {
                        temp = vector[i];
                        vector[i] = vector[j];
                        vector[j] = temp;
                    }
                }
            }
        }
    }
    
