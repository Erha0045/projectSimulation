import java.util.Objects;

public class Communication extends ProjectParent {

    Planning planning = new Planning();

    private double initialInput= 1;
    private double input;
    private double output;
    private int iteration = 1;

    public Communication(){

    }

    public Communication(String name, int iteration, double output, double input) {
        super(name);
        this.input = input;
        this.output = output;
        this.iteration= iteration;
    }

    public double getInput() {
        return input;
    }

    public void setInput(double input) {
        this.input = input;
    }

    public double getOutput() {
        return output;
    }

    public void setOutput(double output) {
        this.output = output;
    }

    public double calculateInput(double input, double output, double iteration) {
        if (iteration == 1){
            return input = 1;
        }else if( iteration > 1){
             input = planning.calculateOutput();
        }
            return input;
        }


    @Override
    public double calculateOutput() {
         output = initialInput * output;
        return output;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Communication)) return false;
        Communication that = (Communication) o;
        return Double.compare(that.input, input) == 0 && Double.compare(that.output, output) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, output);
    }

    @Override
    public String toString() {
        return "Communication{" +
                "input=" + input +
                ", output=" + output +
                '}';
    }
}
