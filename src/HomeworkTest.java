import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HomeworkTest {
    @Test
    public void 初期値() {
        Homework homework = new Homework("名前");
        assertEquals( "名前: text(50)", homework.toString() );
    }

    @Test
    public void nameのgetter() {
        Homework homework = new Homework("社会");
        assertEquals( "社会", homework.getName() );
    }

    @Test
    public void textのgetter() {
        Homework homework = new Homework("名前");
        assertEquals( 50, homework.getText() );
    }

    @Test
    public void 残り仕事量以下の処理() {
        Homework homework = new Homework("国語");
        homework.proceed(49);
        assertEquals( "国語: text(1)", homework.toString() );
        assertFalse( homework.isFinish() );
    }

    @Test
    public void 残り仕事量分の処理() {
        Homework homework = new Homework("数学");
        homework.proceed(50);
        assertEquals( "数学: text(0)", homework.toString() );
        assertTrue( homework.isFinish() );
    }

    @Test
    public void 残り仕事量より多いの処理() {
        Homework homework = new Homework("理科");
        homework.proceed(51);
        assertEquals( "理科: text(0)", homework.toString() );
        assertTrue( homework.isFinish() );
    }
}
