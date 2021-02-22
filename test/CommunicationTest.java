import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommunicationTest {

    Communication communication = new Communication("Communication", 1, 1, 1);
    @Test
    void calculateInput() {
        //arrange
        double exp = communication.getInput();

        //act
        double result = communication.getOutput();
        //assert
        assertEquals(exp, result,"fejl fejl");

    }

    @Test
    void calculateOutput() {
    }
}