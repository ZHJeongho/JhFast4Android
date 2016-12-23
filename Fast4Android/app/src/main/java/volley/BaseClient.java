package volley;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;

/**
 * Created by Jeongho on 2016/12/23.
 */

public abstract class BaseClient {
    public abstract String getHost();

    public void get(String url, HttpResponse response){
        StringRequest request = new StringRequest(getHost() + url , response, response);
        VolleyRequestManager.addRequest(request);
    }

    public void post(String url, HttpResponse response){
        StringRequest request = new StringRequest(Request.Method.POST, getHost() + url , response, response);
        VolleyRequestManager.addRequest(request);
    }
}
