import java.util.Objects;

public class Deployement {
    private String name= "Deployement";
    private double input;

    public Deployement(String name, double input) {
        this.name = name;
        this.input = input;
    }

    public Deployement() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (!(o instanceof Deployement)) return false;
        Deployement that = (Deployement) o;
        return Double.compare(that.input, input) == 0 && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, input);
    }

    @Override
    public String toString() {
        return "Deployement{" +
                "name='" + name + '\'' +
                ", input=" + input +
                '}';
    }
}
