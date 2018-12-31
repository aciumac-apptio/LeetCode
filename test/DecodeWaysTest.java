import org.junit.Assert;
import org.junit.Test;

public class DecodeWaysTest {

    @Test
    public void decodeWays() {
        DecodeWays decodeWays = new DecodeWays();

        Assert.assertEquals(decodeWays.numDecodings("12"), 2);
        Assert.assertEquals(decodeWays.numDecodings("226"), 3);
        Assert.assertEquals(decodeWays.numDecodings("27"), 1);
        Assert.assertEquals(decodeWays.numDecodings("01"), 0);
        Assert.assertEquals(decodeWays.numDecodings("4854154937399897379975613984238125355884258369243193936685559588342434968134474812375281371442336859"),18432);
    }
}
