package volley;

import android.graphics.Bitmap;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by Jeongho on 2016/12/23.
 */

public abstract class BaseClient {

    public abstract String getHost();

    public void get(String url, HttpCallback callback){
        this.get(url, null, callback);
    }

    public void get(String url, JsonParams params, HttpCallback callback){
        VolleyRequestManager.sendRequest(Request.Method.GET, getHost() + url, params, callback);
    }

    public void post(String url, HttpCallback callback){
        this.post(url, null, callback);
    }

    public void post(String url, JsonParams params, HttpCallback callback){
        VolleyRequestManager.sendRequest(Request.Method.POST, getHost() + url, params, callback);
    }





    public void getBitmap(String url, int maxWidth, int maxHeight,
                          ImageView.ScaleType scaleType, Bitmap.Config config, HttpCallback<Bitmap> callback){
        ImageRequest imageRequest = new ImageRequest(url, callback, maxWidth, maxHeight, scaleType,
                config, callback);
        VolleyRequestManager.addRequest(imageRequest);
    }

    public void getJsonObject(String url, HttpCallback<JSONObject> callback){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(url, null, callback, callback);
        VolleyRequestManager.addRequest(jsonObjectRequest);
    }

    public void getJsonArray(String url, HttpCallback<JSONArray> callback){
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(url, callback, callback);
        VolleyRequestManager.addRequest(jsonArrayRequest);
    }


}
