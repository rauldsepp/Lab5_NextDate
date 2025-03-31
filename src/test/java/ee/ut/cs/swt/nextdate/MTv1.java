package ee.ut.cs.swt.nextdate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MTv1 {

    private NextDate trialDate = new NextDate(3,4,1976);

    @Test
    public final void test1(){
        assertEquals("7/1/2001", trialDate.run(6, 30, 2001));
    }

    @Test
    public final void test2(){
        assertEquals("4/1/2001", trialDate.run(3, 31, 2001));
    }

    @Test
    public final void test3(){
        assertEquals("Invalid Next Year", trialDate.run(12, 31, 2021));
    }

    @Test
    public final void test4(){
        assertEquals("2/29/2004", trialDate.run(2, 28, 2004));
    }

}
