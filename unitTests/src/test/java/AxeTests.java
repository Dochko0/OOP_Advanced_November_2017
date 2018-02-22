import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

public class AxeTests {
    private Axe axe = null;
    private Dummy dummy = null;

    @Before
    public void before(){
        axe = new Axe(5,10);
        dummy = new Dummy(10, 0);
    }

    @Test
    public void axeLosesDurability(){
        //act
        axe.attack(dummy);

        //assert

        //int expexted = 9;
        Assert.assertEquals("Wrong durability lose", 9, axe.getDurabilityPoints());

    }

    @Test(expected = IllegalStateException.class)
    public void attackWithBrokenAxe(){
        //act
        axe.attack(dummy);
        axe.attack(dummy);
        axe.attack(dummy);
    }

    @Test
    public void testAxeTestsFirstUnitTest() throws NoSuchMethodException {
        AxeTests axeTests=new AxeTests();
Class axeTestClass = AxeTests.class;
        Method m = axeTestClass.getDeclaredMethod("axeLosesDurability");

        Assert.assertTrue("No such method", m!=null);

    }

    @After
    public void after(){
        System.out.println("success");
    }
}
