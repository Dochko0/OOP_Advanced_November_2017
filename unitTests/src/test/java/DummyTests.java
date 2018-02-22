import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

public class DummyTests {

    @Test
    public void losesHealthProperly(){
        //arrange
        Dummy dummy = new Dummy(2, 2);
        Axe axe = new Axe(1, 10);

        //act
        axe.attack(dummy);

        //assert
        Assert.assertEquals("Dummy do not lose health properly!",1,dummy.getHealth());
    }

    @Test (expected = IllegalStateException.class)
    public void deadDummyThrowsExeption(){
        //arrange
        Dummy dummy = new Dummy(2, 2);
        Axe axe = new Axe(3, 10);

        //act
        axe.attack(dummy);
        axe.attack(dummy);

        //assert
        //Assert.assertEquals("Attack dead dumy",1,dummy.getHealth());
    }
}
