package volley;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jeongho on 2016/12/26.
 */
public class JeonghoClientTest {

    private JeonghoClient mClient;
    @Before
    public void setUp() throws Exception{
        mClient = new JeonghoClient();
    }

    @Test
    public void getHost() throws Exception {

    }

    @Test
    public void add() throws Exception {
        Assert.assertEquals(3, mClient.add(1, 2));
    }

}