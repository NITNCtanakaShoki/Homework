public class Report extends Homework {

    private int experiment;

    public Report( String name, int experiment ) {
        super( name );
        if ( experiment < 0 ) throw new IllegalArgumentException();
        this.experiment = experiment;
    }

    public void proceedExperiment( int n ) {
        if ( n < experiment ) {
            experiment -= n;
            return;
        }
        experiment = 0;
    }

    @Override
    public void proceed( int n ) {
        if ( experiment != 0 ) return;
        super.proceed( n );
    }

    @Override
    public String toString() {
        return String.format(
                "%s: text(%d) experiment(%d)",
                getName(),
                getText(),
                experiment
        );
    }
}
