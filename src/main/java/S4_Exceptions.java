public class S4_Exceptions {
    public static void main(String[] args) {
        System.out.println("Hello World 1");
        try {
            int x = 1 / 0;
        } catch (ArithmeticException e) {
//            e.printStackTrace();
        }
        System.out.println("Hello World 2");
    }

//    public static void main(String[] args) {
//        System.out.println("Hello World 1");
//            int x = 1 / 0;
//        System.out.println("Hello World 2");
//        System.out.println("Hello World 3");
//    }
}