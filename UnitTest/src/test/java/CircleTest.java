import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CircleTest {

    private Circle circle;

    @BeforeClass
    public void createObj(){
        circle = new Circle(12);
    }

    @Test
    public void radTest(){
        double actualResult = circle.rad(12);
        double expectedResult = 75;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void areaTest(){
        double actualResult = circle.area(12);
        double expectedResult = 452;
        Assert.assertEquals(actualResult, expectedResult);
    }

}
