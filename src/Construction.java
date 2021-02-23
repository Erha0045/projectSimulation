import java.util.Objects;

public class Construction {

    private String name= "Construction";
    private double output;
    private int iteration = 4;
    private double input;

    public Construction(String name, double output, int iteration, double input) {
        this.name = name;
        this.output = output;
        this.iteration = iteration;
        this.input = input;
    }

    public Construction() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Construction)) return false;
        Construction that = (Construction) o;
        return Double.compare(that.output, output) == 0 && iteration == that.iteration && Double.compare(that.input, input) == 0 && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, output, iteration, input);
    }


    @Override
    public String toString() {
        return "Construction{" +
                "name='" + name + '\'' +
                ", output=" + output +
                ", iteration=" + iteration +
                ", input=" + input +
                '}';
    }
}
