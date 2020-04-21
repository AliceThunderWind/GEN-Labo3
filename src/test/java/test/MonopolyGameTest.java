package test;

import monopoly.MonopolyGame;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MonopolyGameTest {

    @Test
    void testClassExist(){
        try {
            Class.forName("monopoly.MonopolyGame");
        } catch (ClassNotFoundException e) {
            Assertions.fail("Manque la classe MonopolyGame");
        }
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, -4, 5, 9 })
    void testCreateNewGameFail(int input) {
        if (input < 2 || input > 8)
            assertThrows(RuntimeException.class, () -> new MonopolyGame(input));
    }

}