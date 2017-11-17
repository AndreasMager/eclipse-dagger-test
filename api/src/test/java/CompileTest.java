import org.junit.Test;

public class CompileTest {

    @Test
    public void compileMe() {
        CommonComponent c = DaggerCommonComponent.create();
    }
    
    @Test
    public void compileApiToo() {
        CommonComponent c = DaggerAPIComponent.create();
    }
}
