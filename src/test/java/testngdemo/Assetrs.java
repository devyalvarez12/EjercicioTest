package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Assetrs {
    @Test
    public void hardAssertExample(){

        String expectedResult="hard assert";
        String actualResult = "hard assert";
        Assert.assertEquals(expectedResult,actualResult);
        System.out.println("This should not be execute");

    }

    @Test
    public void softAssertExample(){
        
        SoftAssert softAssertions = new SoftAssert();
        softAssertions.assertEquals(1,2,"los numero no son iguales");
        softAssertions.assertEquals(1,3,"los numero no son iguales2");
        softAssertions.assertEquals(1,5,"los numero no son iguale3s");


        softAssertions.assertAll();
        System.out.println("This should  be execute");



    }
}
