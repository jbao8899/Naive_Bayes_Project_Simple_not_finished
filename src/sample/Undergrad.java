package sample;

public class Undergrad extends Person {
    public Undergrad(int age, String degree) {
        super(age, degree, "undergrad");
    }
    private static double proportionWithAge18to22;
    private static double proportionWithAge23to29;
    private static double proportionWithAge30plus;
    private static double proportion;
    private static double proportionNoDegree;
    private static double proportionBachelor;
    private static double proportionMaster;
    private static double proportionPhD;

    public static double getProportion() {
        return proportion;
    }

    public static void setProportion(double proportion) {
        Undergrad.proportion = proportion;
    }

    public static double getProportionNoDegree() {
        return proportionNoDegree;
    }

    public static void setProportionNoDegree(double proportionNoDegree) {
        Undergrad.proportionNoDegree = proportionNoDegree;
    }

    public static double getProportionBachelor() {
        return proportionBachelor;
    }

    public static void setProportionBachelor(double proportionBachelor) {
        Undergrad.proportionBachelor = proportionBachelor;
    }

    public static double getProportionMaster() {
        return proportionMaster;
    }

    public static void setProportionMaster(double proportionMaster) {
        Undergrad.proportionMaster = proportionMaster;
    }

    public static double getProportionPhD() {
        return proportionPhD;
    }

    public static void setProportionPhD(double proportionPhD) {
        Undergrad.proportionPhD = proportionPhD;
    }

    public static double getProportionWithAge18to22() {
        return proportionWithAge18to22;
    }

    public static void setProportionWithAge18to22(double proportionWithAge18to22) {
        Undergrad.proportionWithAge18to22 = proportionWithAge18to22;
    }

    public static double getProportionWithAge23to29() {
        return proportionWithAge23to29;
    }

    public static void setProportionWithAge23to29(double proportionWithAge23to29) {
        Undergrad.proportionWithAge23to29 = proportionWithAge23to29;
    }

    public static double getProportionWithAge30plus() {
        return proportionWithAge30plus;
    }

    public static void setProportionWithAge30plus(double proportionWithAge30plus) {
        Undergrad.proportionWithAge30plus = proportionWithAge30plus;
    }
}
