public class J2_This_N_Constructors {

    int x;
    int y;

    J2_This_N_Constructors() {
        System.out.println("Called empty constructor");
    }

    J2_This_N_Constructors(int x, int y) {
        this.x = x;
        this.y = y;

        System.out.println("Called int x, constructors");
    }

    J2_This_N_Constructors(String x) {
        System.out.println("Called String x, constructor");
    }

    J2_This_N_Constructors(boolean x) {
        System.out.println("Called boolean x, constructor");

    }
}

class ObjectofClass {

    public static void main(String[] args) {
        new J2_This_N_Constructors();
    }
}