import java.util.Random;

/**
 * @author Vitalijs
 * version dated 28.02.2020
 */


public class HelloWorld {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World! " + random.nextInt(10)); // output

        }


    }

}
