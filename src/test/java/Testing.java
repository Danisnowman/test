import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing extends init{
    @Test(groups = {"testing"}, description = "Description test f ")
    public void f(){
        System.out.println("holas");
        Assert.assertEquals(1, 2, "rip");
    }

    @Test(groups = {"testing2"}, description = "Description test fee")
    public void fee(){
        System.out.println("holas");
        Assert.assertEquals(1, 2, "rip");
    }
}
