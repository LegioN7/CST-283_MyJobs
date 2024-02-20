// This class represents a paint job. It extends the Job class and adds
// a field for the area to be painted. It also
// provides methods to calculate the cost and time for the job.
public class PaintJob extends Job {
    private final double COST_PER_SQ_FT = 0.85;   // Dollars
    private final double TIME_PER_SQ_FT = 0.012;  // Hours per square foot
    private double area;

    public PaintJob() {
        super();
        area = 0;
    }

    public PaintJob(String d, int p, double a) {
        super(d, p);   // Pass description and priority to superclass
        area = a;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double a) {
        area = a;
    }

    public double calcCost() {
        return area * COST_PER_SQ_FT;
    }

    public double calcTime() {
        return area * TIME_PER_SQ_FT;
    }

    public String toString() {
        return super.toString() + " - " + "Paint area: " + area;
    }
}

