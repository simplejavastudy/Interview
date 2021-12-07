import org.testng.annotations.DataProvider;

public class TestNG_6_DataProvider2 {
    @DataProvider(name = "setA")
    Object[][] getDataSet() {

        Object [][] data = {{"abc@gmail.com", "abc"},{"xyz@gmail.com", "xyz"},{"123@gmail.com", "123"}};
        return data;
    }

}