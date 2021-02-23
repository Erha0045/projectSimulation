public class ProjectParent {

    protected String name;
    protected int iteration;
    protected double input;

    protected double bigDouble = 0.8;
    protected double smallDouble = 0.2;

    public ProjectParent(String name, int iteration, double input, double bigDouble, double smallDouble) {
        this.name = name;
        this.iteration = iteration;
        this.input = input;
        this.bigDouble = bigDouble;
        this.smallDouble = smallDouble;
    }

    public ProjectParent() {
    }

    public static double calculateBigIO (double input, double bigDouble){
        double bigIO = input * bigDouble;

      return bigIO;
    }

    public static double calculatelilleIO (double input, double smallDouble){
        double smallIO = input * smallDouble;

        return smallIO;
    }


//    public static double calculateBigInput (double input, double bigDouble){
//
//        double bigInput = bigOutput;
//
//        return smallInput;
//    }
//
//    public static double calculatelilleInput (double input, double smallDouble){
//        double smallOutput = input * smallDouble;
//
//        return smallOutput;
//    }
}

