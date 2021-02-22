public class ProjectParent  {

    protected String name;
    protected int iteration;
    protected double input;
    protected double output;
//    private  double bigOutput = input * 0.8;
//    private  double smallOutput = input * 0.2;

    public ProjectParent(){

    }

    public ProjectParent(String name, int iteration, double input, double output) {
        this.name = name;
        this.iteration = iteration;
        this.input = input;
        this.output = output;
    }

    public ProjectParent(String name, int iteration, double output) {
    }

    public ProjectParent(String name, int iteration) {
    }

    public ProjectParent(String name) {
    }


    public double calculateOutput(){
       return input;
   }

    public double calculateInput(){
        return input;
    }

}
