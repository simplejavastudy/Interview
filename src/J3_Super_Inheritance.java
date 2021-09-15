public class J3_Super_Inheritance {

}

class Patent {
    int house = 1000000;

    void car() {
        System.out.println("BMW");
    }
}

class Child extends Patent {
    int house = 500000;

    void car() {
        System.out.println("Honda");
    }

    void print() {

        System.out.println(super.house);
        System.out.println(house);

        super.car();
        car();
    }

    public static void main(String[] args) {
        new Child().print();
    }
}