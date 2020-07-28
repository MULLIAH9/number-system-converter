import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class NumberSystemConverter {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputString = reader.readLine();
            String[] strings = inputString.split(" ");
            int mainDigit = Integer.parseInt(strings[0]);
            int radixFrom = Integer.parseInt(strings[1]);
            int radixTo = Integer.parseInt(strings[2]);

            if ((radixFrom>= 2) && (radixTo <=10)){
                BigInteger tmp = new BigInteger(String.valueOf(mainDigit), radixFrom);
                System.out.println(tmp.toString(radixTo));
            } else throw new Exception();

        } catch (Exception e) {
            System.out.println(-1);
        }

    }
}
