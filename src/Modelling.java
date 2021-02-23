import java.util.Objects;

public class Modelling {

    private String name= "Modelling";
    private double output;
    private int iteration = 2;
    private double input;

    public Modelling(String name, double output, int iteration, double input) {

        this.name = name;
        this.output = output;
        this.iteration = iteration;
        this.input = input;
    }

    public Modelling() {
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
        if (!(o instanceof Modelling)) return false;
        Modelling modelling = (Modelling) o;
        return Double.compare(modelling.output, output) == 0 && iteration == modelling.iteration && Double.compare(modelling.input, input) == 0 && Objects.equals(name, modelling.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, output, iteration, input);
    }

    @Override
    public String toString() {
        return "Modelling{" +
                "name='" + name + '\'' +
                ", output=" + output +
                ", iteration=" + iteration +
                ", input=" + input +
                '}';
    }
}
