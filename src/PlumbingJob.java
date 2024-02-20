// This class handles plumbing jobs.  It extends the Job class and adds
// the number of fixture installations to the job description.  It also
// provides methods to calculate the cost and time for the job.
public class PlumbingJob extends Job
{
    private int fixtureInstalls;

    private final double COST_PER_TASK  = 100.00;  // Dollars
    private final double TIME_PER_TASK  = 1.5;  // Hours per square wiring task

    public PlumbingJob()
    {
        super();
        fixtureInstalls = 0;
    }

    public PlumbingJob(String d, int p, int t)
    {
        super(d, p);   // Pass description and priority to superclass
        fixtureInstalls = t;
    }

    public void setFixtureInstalls(int t)
    {
        fixtureInstalls = t;
    }
    public double getFixtureInstalls() {
        return fixtureInstalls;
    }

    public double calcCost()
    {
        return fixtureInstalls * COST_PER_TASK;
    }

    public double calcTime()
    {
        return fixtureInstalls * TIME_PER_TASK;
    }

    public String toString()
    {
        return  super.toString() + " - " + "Fixture Installations: " + fixtureInstalls;
    }
}

