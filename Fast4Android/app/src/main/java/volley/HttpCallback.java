package volley;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/**
 * Created by Jeongho on 2016/12/23.
 */

public abstract class HttpCallback<T> implements Response.Listener<T>, Response.ErrorListener{

    @Override
    public void onErrorResponse(VolleyError error) {
        String e = error.getMessage();
        fail(e);
    }

    @Override
    public void onResponse(T response) {
        ok(response);
    }

    public abstract void ok(T response);

    public abstract void fail(String error);
}
