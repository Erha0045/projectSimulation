public class Planning extends ProjectParent {

    Communication communication = new Communication();
    private String name= "Planning";
    private double output;
    private int iteration = 2;
    private double input;


    public Planning() {
    }

    public Planning(String name, int iteration, double input, double output) {
        this.name = name;
        this.output = output;
        this.iteration = iteration;
        this.input = input;
    }

    public static double calculateBigIO (double input, double bigDouble){
        double bigIO = input * bigDouble;

        return bigIO;
    }

    public static double calculatelilleIO (double input, double smallDouble){
        double smallIO = input * smallDouble;

        return smallIO;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOutput() {
        return output;
    }

    public void setOutput(double output) {
        this.output = output;
    }

    public int getIteration() {
        return iteration;
    }

    public void setIteration(int iteration) {
        this.iteration = iteration;
    }

    public double getInput() {
        return input;
    }

    public void setInput(double input) {
        this.input = input;
    }
}
