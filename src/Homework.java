public class Homework {

    private String name;
    private int text;

    public Homework( String name ) {
        this.name = name;
        text = 50;
    }

    public String getName() {
        return name;
    }

    public int getText() {
        return text;
    }

    public void proceed(int n) {
        if ( n < text ) {
            text -= n;
            return;
        }
        text = 0;
    }

    public boolean isFinish() {
        return text <= 0;
    }

    @Override
    public String toString() {
        return String.format("%s: text(%d)", name, text);
    }
}
