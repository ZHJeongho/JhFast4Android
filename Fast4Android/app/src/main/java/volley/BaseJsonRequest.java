package volley;

import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.JsonRequest;

import java.io.UnsupportedEncodingException;

/**
 * Created by Jeongho on 2016/12/29.
 */

public class BaseJsonRequest<T> extends JsonRequest{

    public BaseJsonRequest(int method, String url, JsonParams params, Response.Listener listener, Response.ErrorListener errorListener) {
        super(method, url, null == params ? null : params.toString(), listener, errorListener);
    }


    @Override
    protected Response parseNetworkResponse(NetworkResponse response) {

        if (response == null){
            return null;
        }
        String parsed = null;
        try {
            parsed = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return Response.success(parsed, HttpHeaderParser.parseCacheHeaders(response));
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
