import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReportTest {
    @Test
    public void 初期値() {
        Report report = new Report("名前", 45);
        assertEquals( "名前: text(50) experiment(45)", report.toString() );
    }

    @Test
    public void 実験未終了時の処理() {
        Report report = new Report("名前", 45);
        report.proceed(100);
        assertEquals( "名前: text(50) experiment(45)", report.toString() );
    }

    @Test
    public void 実験終了時の処理() {
        Report report = new Report("名前", 0);
        report.proceed(100);
        assertEquals( "名前: text(0) experiment(0)", report.toString() );
    }

    @Test
    public void 実験量以下の実験を行う() {
        Report report = new Report("名前", 100);
        report.proceedExperiment(99);
        assertEquals( "名前: text(50) experiment(1)", report.toString() );
    }

    @Test
    public void 実験量分の実験を行う() {
        Report report = new Report("名前", 100);
        report.proceedExperiment(100);
        assertEquals( "名前: text(50) experiment(0)", report.toString() );
    }

    @Test
    public void 実験量以上の実験を行う() {
        Report report = new Report("名前", 100);
        report.proceedExperiment(101);
        assertEquals( "名前: text(50) experiment(0)", report.toString() );
    }
}
