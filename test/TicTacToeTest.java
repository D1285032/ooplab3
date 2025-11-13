import static org.junit.Assert.*;
import org.junit.Test;

public class TicTacToeTest {

    @Test
    public void testHorizontalWin() {
        TicTacToe t = new TicTacToe();
        t.set(0,0,'O');
        t.set(0,1,'O');
        t.set(0,2,'O');
        assertEquals("O", t.evaluate());
    }

    @Test
    public void testVerticalWin() {
        TicTacToe t = new TicTacToe();
        t.set(0,1,'X');
        t.set(1,1,'X');
        t.set(2,1,'X');
        assertEquals("X", t.evaluate());
    }

    @Test
    public void testDiagonalWin() {
        TicTacToe t = new TicTacToe();
        t.set(0,0,'O');
        t.set(1,1,'O');
        t.set(2,2,'O');
        assertEquals("O", t.evaluate());
    }

    @Test
    public void testDraw() {
        TicTacToe t = new TicTacToe();
        t.set(0,0,'X'); t.set(0,1,'O'); t.set(0,2,'X');
        t.set(1,0,'X'); t.set(1,1,'O'); t.set(1,2,'O');
        t.set(2,0,'O'); t.set(2,1,'X'); t.set(2,2,'X');
        assertEquals("Draw", t.evaluate());
    }

    @Test
    public void testNotFinished() {
        TicTacToe t = new TicTacToe();
        t.set(0,0,'X');
        assertEquals("None", t.evaluate());
    }
}
