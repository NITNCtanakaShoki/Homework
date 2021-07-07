import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProgrammingTest {
    @Test
    public void 初期値() {
        Programming programming = new Programming("名前", 13);
        assertEquals( "名前: coding(13)", programming.toString() );
    }

    @Test
    public void 残りコーディング量以下の処理() {
        Programming programming = new Programming("名前", 13);
        programming.proceed(12);
        assertEquals( "名前: coding(1)", programming.toString() );
        assertFalse( programming.isFinish() );
    }

    @Test
    public void 残りコーディング量分の処理() {
        Programming programming = new Programming("名前", 15);
        programming.proceed(15);
        assertEquals( "名前: coding(0)", programming.toString() );
        assertTrue( programming.isFinish() );
    }

    @Test
    public void 残りコーディング量より多いの処理() {
        Programming programming = new Programming("名前", 17);
        programming.proceed(18);
        assertEquals( "名前: coding(0)", programming.toString() );
        assertTrue( programming.isFinish() );
    }
}
