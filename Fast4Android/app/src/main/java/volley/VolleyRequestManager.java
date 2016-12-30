package volley;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.jeongho.fast4android.MyApplication;

/**
 * Created by Jeongho on 2016/12/23.
 * 如果更换网络请求框架 直接修改此类 以及HttpCallback类
 */

public class VolleyRequestManager {

    private static RequestQueue sRequestQueue = Volley.newRequestQueue(MyApplication.getContext());

    public static void addRequest(Request<?> request){
        sRequestQueue.add(request);
    }

    public static void sendRequest(int method, String url, JsonParams params, HttpCallback callback){
        String fullURl = url;
        if (method == Request.Method.GET && params != null){
            fullURl = params.toQueryString(url);
        }

        BaseJsonRequest request = new BaseJsonRequest(method, url, params, callback, callback);
        addRequest(request);
    }
}
