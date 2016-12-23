package volley;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.jeongho.fast4android.MyApplication;

/**
 * Created by Jeongho on 2016/12/23.
 */

public class VolleyRequestManager {

    private static RequestQueue sRequestQueue = Volley.newRequestQueue(MyApplication.getContext());


    public static void addRequest(String url,
                                  Response.Listener listener, Response.ErrorListener errorListener){
        StringRequest request = new StringRequest(url, listener, errorListener);
        sRequestQueue.add(request);
    }

    /**
     * default request method (GET)
     * @param url
     * @param response
     */
    public static void addRequest(String url, HttpResponse response){
        StringRequest request = new StringRequest(url, response, response);
        sRequestQueue.add(request);
    }

    public static void addRequest(StringRequest request){
        //StringRequest request = new StringRequest(url, response, response);
        sRequestQueue.add(request);
    }

    public static void addRequest(Request<?> request){
        sRequestQueue.add(request);
    }
}
