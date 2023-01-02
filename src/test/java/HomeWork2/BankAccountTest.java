package HomeWork2;

import HomeWork1.BankAccountClass;
import org.junit.*;

public class BankAccountTest {
    BankAccountClass acc;
    public static final double doubleBalance = 239.9;
    public static final double intBalance = 10;
    public static final double zeroBalance = 0;

    @Before
    public void init() {
        BankAccountClass acc = new BankAccountClass();
    }

    @Test
    public void verifyDoubleBalance() {
        double expectedBalance = 23.9;
        acc.setBalance(doubleBalance);
        double actualBalance = acc.getBalance();
        Assert.assertEquals(expectedBalance, actualBalance, 0);
    }

    @Test
    public void verifyIntBalance() {
        double expectedBalance = 10;
        acc.setBalance(intBalance);
        double actualBalance = acc.getBalance();
        Assert.assertEquals(expectedBalance, actualBalance, 0);
    }

    @Test
    public void verifyZeroBalance() {
        double expectedBalance = 0;
        acc.setBalance(zeroBalance);
        double actualBalance = acc.getBalance();
        Assert.assertEquals(expectedBalance, actualBalance, 0);
    }

    @After
    public void close() {
        acc = null;
    }
}

