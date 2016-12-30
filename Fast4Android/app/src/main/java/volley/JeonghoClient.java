package volley;

/**
 * Created by Jeongho on 2016/12/23.
 *
 * Url Manage
 */

public class JeonghoClient extends BaseClient{

    private static final String QA = "http://stormzhang.cn";
    //private static final String PRODUCTION = "http://stormzhang.com";
    private static final String PRODUCTION = "";

    /**
     * get host IP or website of the server
     * @return
     */
    public String getHost(){
        return PRODUCTION;
    }

    public int add(int a, int b){
        return a + b;
    }
}
