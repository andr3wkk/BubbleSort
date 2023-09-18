import java.util.Random;
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    static String cont;

    public static void main(String[] args) {

        do {
            System.out.println("Hello, user!");
            System.out.println("How would You like to create an array of values?(Please, type: Random or Manually)");
            String answer = in.nextLine();

            if (answer.equals("Random")) {
                Random();

            } else if (answer.equals("Manually"))
                Manually();

            in.nextLine();
            System.out.println("Do You want to continue?(Please, type: Yes or No)");
            cont = in.nextLine();
        } while (cont.equals("Yes"));
    }

        //print
        public static void printArray ( int[] array){
            System.out.println("Array: ");
            for (int i : array) {
                System.out.println(i + "");
            }
        }
        //random
        public static int[] randomArray ( int length){
            int[] array = new int[length];
            Random random = new Random();
            for (int i = 0; i < length; i++) {
                array[i] = random.nextInt(0, 25);
            }
            return array;
        }
        //userInput
        public static int[] inputArray (Scanner in,int length){
            int[] array = new int[length];
            System.out.println("Your input:");
            for (int i = 0; i < length; i++) {
                array[i] = in.nextInt();
            }
            return array;
        }
        //swap Random
        public static void swapR ( int[] array, int k, int l){
            int step = array[k];
            array[k] = array[l];
            array[l] = step;
        }
        public static void swapM ( int[] array, int k, int l){
            int step = array[k];
            array[k] = array[l];
            array[l] = step;
        }
        public static void Random(){
            System.out.println("Please, enter length of Your array");
            int[] randomArray = randomArray(in.nextInt());
            printArray(randomArray);

            System.out.println("Here is your sorted array: ");
            for (int i = 0; i < randomArray.length; i++) {
                for (int j = 0; j < randomArray.length - 1; j++) {
                    if (randomArray[j] > randomArray[j + 1]) {
                        swapR(randomArray, j, j + 1);
                    }
                }

            }
            for (int i = 0; i < randomArray.length; i++) {
                System.out.println(randomArray[i]);
            }
        }

        public static void Manually(){
            System.out.println("Please, enter length of Your array");
            int[] userArray = inputArray(in, in.nextInt());
            printArray(userArray);
            System.out.println("Here is your sorted array: ");
            for (int i = 0; i < userArray.length; i++) {
                for (int j = 0; j < userArray.length - 1; j++) {
                    if (userArray[j] > userArray[j + 1]) {
                        swapR(userArray, j, j + 1);
                    }
                }

            }
            for (int i = 0; i < userArray.length; i++) {
                System.out.println(userArray[i]);
            }
        }

    }