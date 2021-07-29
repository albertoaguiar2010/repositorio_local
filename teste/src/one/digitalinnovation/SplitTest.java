package one.digitalinnovation;

import static junit.framework.Assert.assertEquals;

public class SplitTest {

    @Test
    public void testSplit() {
        String cpf = "001.002.003-04";
        String[] output = cpf.split("-");
        System.out.println(output[0]);
        System.out.println(output[1]);
        assertEquals(2, output.length);
    }

    @Test
    public void testSplitDot() {
        String cpf = "001.002.003-04";
        String[] output = cpf.split("\\.");
        System.out.println(output[0]);
        System.out.println(output[1]);
        System.out.println(output[2]);
        assertEquals(3, output.length);
    }
}