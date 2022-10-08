package help;

public class CreateRandomNumber {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.println(GenerateRandomNumber(5));

        }

    }

    static int GenerateRandomNumber(int _max) {

        int _random = (int) (Math.random() * (_max + 1));

        return _random;

    }

}
