class J1_Static {
    static int familyBankAccount = 500;

    void rocee() {
        familyBankAccount = 50;
        System.out.println("Rocee took out $450: " + familyBankAccount);
    }

    static void rabbil() {
        familyBankAccount = 300;
        System.out.println("Rabbil deposited $250: " + familyBankAccount);
    }
}

class account {
    public static void main(String[] args) {

        System.out.println(J1_Static.familyBankAccount);
        J1_Static.rabbil();
    }
}


//    public static void main(String[] args) {
//        System.out.println("Account balance: " + familyBankAccount);
//
//        J1_Static spend = new J1_Static();
//        spend.rocee();
//        rabbil();
//    }

//    int idNumber;
//    static int countHowManyObjects = 0;
//    String school;
//
//    J1_Static() {
//        countHowManyObjects++;
//    }
//
//    static void method() {
//        System.out.println("hello");
//    }
//
//    public static void main(String[] args) {
//        System.out.println(countHowManyObjects);
//
//        J1_Static rocee = new J1_Static();
//        J1_Static rabbil = new J1_Static();
//        J1_Static kash = new J1_Static();
//        J1_Static x = new J1_Static();
//        J1_Static s = new J1_Static();
//        J1_Static f = new J1_Static();
//        J1_Static e = new J1_Static();
//
////        countHowManyObjects = 300;
//
//        System.out.println(countHowManyObjects);
//
//    }


// “static” is a keyword used to assign a unique memory location.
// If the variable/method is “static” then its memory location is shared everywhere.
// A single copy to be shared by all objects of that class.
// We use "static" for main() method, so CPU can access main() method without making an object.
