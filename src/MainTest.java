import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void reverseOrder() {
        String input = "000111";
        String result = Main.reverseOrder(input);

        Assertions.assertEquals(result, "111000");

    }

    @Test
    void negateOnes() {
        String ones = "1111";
        String result =  Main.negate(ones);

        Assertions.assertEquals(result,"0000");
    }

    @Test
    void negateZeros() {
        String ones = "0000";
        String result =  Main.negate(ones);

        Assertions.assertEquals(result,"1111");
    }

    @Test
    void negateMixed() {
        String ones = "0101";
        String result =  Main.negate(ones);

        Assertions.assertEquals(result,"1010");
    }


    @Test
    void foldPaperOne() {
        String input = "1";
        String result = Main.foldPaper(input);

        Assertions.assertEquals(result, "110");
    }

    @Test
    void foldPaperTwo() {
        String input = "110";
        String result = Main.foldPaper(input);

        Assertions.assertEquals(result, "1101100");
    }
    @Test
    void foldPaperThree() {
        String input = "1101100";
        String result = Main.foldPaper(input);

        Assertions.assertEquals(result, "110110011100100");
    }
    @Test
    void foldPaperFour() {
        String input = "110110011100100";
        String result = Main.foldPaper(input);

        Assertions.assertEquals(result, "1101100111001001110110001100100");
    }

}
