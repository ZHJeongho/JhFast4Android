package volley;

import android.graphics.Bitmap;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by Jeongho on 2016/12/23.
 */

public abstract class BaseClient {
    public abstract String getHost();

    public void get(String url, HttpCallback<String> callback){
        StringRequest request = new StringRequest(getHost() + url , callback, callback);
        VolleyRequestManager.addRequest(request);
    }

    public void post(String url, HttpCallback<String> callback){
        StringRequest request = new StringRequest(Request.Method.POST, getHost() + url , callback, callback);
        VolleyRequestManager.addRequest(request);
    }

    public void getBitmap(String url, int maxWidth, int maxHeight,
                          ImageView.ScaleType scaleType, Bitmap.Config config, HttpCallback<Bitmap> callback){
        ImageRequest imageRequest = new ImageRequest(url, callback, maxWidth, maxHeight, scaleType,
                config, callback);
        VolleyRequestManager.addRequest(imageRequest);
    }

    public void getJsonObject(String url, HttpCallback<JSONObject> callback){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(url, null, callback, callback);
    }

    public void getJsonArray(String url, HttpCallback<JSONArray> callback){
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(url, callback, callback);
    }
}
