package SingleTonPattern;

public class Employer {

    //this is an eager way to do, so everytime it will create an object because
    // static function will create an object, even though we are not using this object
    private static Employer employer = new Employer();

    public static Employer getEmployer() {
        return employer;
    }
}
