public class J4_Final_Finally_Finalize {

    public static void main(String[] args) {
        final int x = 10;
//        // x = 40;
//        // x = 30000;
//
        try {
            int y = 300;
        } catch (Exception e) {
            System.out.println("Error is : "+e);
        }
        finally {
            System.out.println("There was not exception ");
        }
    }
}