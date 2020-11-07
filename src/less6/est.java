package less6;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

public class est {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<String> test = new ArrayList<>();
        System.out.println(stringList.size());
        for (int i = 0; i < 109; i++) {
            stringList.add(String.valueOf(i));
        }
        System.out.println(stringList.size());

        int recordSize = stringList.size();
        int steps = recordSize / 10;
        int min = 0;
        int max = 0;
        for (int i = 0; i <= steps; i++) {
            min = max;
            max = Math.min(min + 10, recordSize);

            int maxRange = Math.min((min + 10), recordSize);
            List<String> paymentModelsSkip = stringList.subList(min, maxRange);
            int size = paymentModelsSkip.size();


            for (int iter = 0; iter < size; iter++) {
                test.add(paymentModelsSkip.get(iter));
            }
            if (min + 10 >= recordSize) break;
        }

        System.out.println(test.size());
    }
}
