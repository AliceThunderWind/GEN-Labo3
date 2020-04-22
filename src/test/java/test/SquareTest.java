package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SquareTest {
    @BeforeAll
    void testClassExist(){
        try {
            Class.forName("monopoly.board.Square");
        } catch (ClassNotFoundException e) {
            Assertions.fail("Manque la classe Square");
        }
    }
}