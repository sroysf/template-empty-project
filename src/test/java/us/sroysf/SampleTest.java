package us.sroysf;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * SampleTest
 *
 * @author sroy
 */
public class SampleTest {

    @Mock
    TestInterface testInterface;

    @BeforeMethod
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCoolFeature() {
        Mockito.when(testInterface.sayHello()).thenReturn("SecretMessage");
        Assert.assertEquals(testInterface.sayHello(), "SecretMessage");
    }

    private interface TestInterface {
        String sayHello();
    }
}
