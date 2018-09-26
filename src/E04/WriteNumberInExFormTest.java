package E04;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class WriteNumberInExFormTest {

    @Test
    public void testSomething() {
      assertEquals("10 + 2", WriteNumberInExForm.expandedForm(12));
      assertEquals("40 + 2", WriteNumberInExForm.expandedForm(42));
      assertEquals("70000 + 300 + 4", WriteNumberInExForm.expandedForm(70304));
    }
}