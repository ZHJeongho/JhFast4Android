package volley;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/**
 * Created by Jeongho on 2016/12/23.
 */

public abstract class HttpResponse implements Response.Listener, Response.ErrorListener{

    @Override
    public void onErrorResponse(VolleyError error) {
        String e = error.getMessage();
        fail(e);
    }

    @Override
    public void onResponse(Object response) {
        ok((String) response);
    }

    public abstract void ok(String response);

    public abstract void fail(String error);
}
