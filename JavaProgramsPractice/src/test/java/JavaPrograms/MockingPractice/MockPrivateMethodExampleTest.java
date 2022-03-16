package JavaPrograms.MockingPractice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MockPrivateMethodExample.class)
public class MockPrivateMethodExampleTest {

    private MockPrivateMethodExample mockPrivateMethodExample;

    @Test
    public void testPrivateMethod() throws Exception {
        mockPrivateMethodExample = new MockPrivateMethodExample();
        MockPrivateMethodExample mockPrivateMethod = PowerMockito.spy(mockPrivateMethodExample);
        PowerMockito.doReturn("IamTest").when(mockPrivateMethod,"iAmPrivate");
        String value = mockPrivateMethod.getDetails();
        assertEquals(value, "Mock Private Method exampleIamTest");
    }

}