import org.testng.annotations.Test;

public class TestNG_5_DataProvider1 {

    @Test(dataProvider = "setA", dataProviderClass = TestNG_6_DataProvider2.class)
    void print(String id, String pass) {
        System.out.println(id +" "+ pass);
    }
}