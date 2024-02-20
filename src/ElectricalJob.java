// This class handles electrical jobs.  It extends the Job class and adds
// the number of wiring tasks to the job description.  It also provides
// methods to calculate the cost and time for the job.

class ElectricalJob extends Job {
    private final double COST_PER_TASK = 15.00;  // Dollars
    private final double TIME_PER_TASK = 0.25;  // Hours per square wiring task
    private int wiringTasks;

    public ElectricalJob() {
        super();
        wiringTasks = 0;
    }

    public ElectricalJob(String d, int p, int t) {
        super(d, p);   // Pass description and priority to superclass
        wiringTasks = t;
    }

    public double getWiringTasks() {
        return wiringTasks;
    }

    public void setWiringTasks(int t) {
        wiringTasks = t;
    }

    public double calcCost() {
        return wiringTasks * COST_PER_TASK;
    }

    public double calcTime() {
        return wiringTasks * TIME_PER_TASK;
    }

    public String toString() {
        return super.toString() + " - " + "Wiring tasks: " + wiringTasks;
    }
}

