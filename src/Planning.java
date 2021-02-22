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
    public double calculateInput(double input, double output, double iteration) {
        if( iteration >2 && iteration < 4){
            input = communication.calculateOutput();
        }
        return input;
    }


    @Override
    public double calculateOutput() {
        double newOutput = input * output;
        return newOutput;
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
