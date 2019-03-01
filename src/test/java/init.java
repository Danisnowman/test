import org.testng.annotations.BeforeClass;

public class init {

    protected int testd = 1;

    @BeforeClass
    public void init(){
        testd++;
    }
}
