import com.Utils;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class UtilsTest {
    private Utils utils = new Utils();

    @Test
    void concatenateWordsTest() {
        String word1 = "TestWord";
        String word2 = "SecondTestWord";
        String correctResult = word1 + word2;

        assertEquals(utils.concatenateWords(word1, word2), correctResult);
    }

    @Test
    void concatenateWordsTestWithNulls() {
        String word1 = null;
        String word2 = "SecondTestWord";
        String correctResult = word1 + word2;

        assertEquals(utils.concatenateWords(word1, word2), correctResult);
    }

    @Test
    void concatenateWordsTestWithEmptyString() {
        String word1 = "TestWord";
        String word2 = "";
        String correctResult = word1 + word2;

        assertEquals(utils.concatenateWords(word1, word2), correctResult);
    }

    @Test
    void concatenateWordsTestWithNonLatin() {
        String word1 = "TestWord";
        String word2 = "Проверка";
        String correctResult = word1 + word2;

        assertEquals(utils.concatenateWords(word1, word2), correctResult);
    }
    @Test
    void computeFactorialTest() {
        int correctResult = 24;

        assertEquals(utils.computeFactorial(4), correctResult);
    }
    @Test
    @Ignore
    @Timeout(value = 10,unit = TimeUnit.MILLISECONDS)
    void computeFactorialTestWithTimeout() {
        Random random = new Random();

        utils.computeFactorial(random.nextInt(100000));
    }
}
