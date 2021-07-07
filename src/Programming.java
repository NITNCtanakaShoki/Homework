public class Programming extends Homework {

    private int coding;
    
    public Programming( String name, int coding ) {
        super( name );
        this.coding = coding;
    }

    @Override
    public void proceed( int n ) {
        if ( n < coding ) {
            coding -= n;
            return;
        }
        coding = 0;
    }

    @Override
    public boolean isFinish() {
        return coding <= 0;
    }
    @Override
    public String toString() {
        return String.format("%s: coding(%d)", getName(), coding);
    }
}
