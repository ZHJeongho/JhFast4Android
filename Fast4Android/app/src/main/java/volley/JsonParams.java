package volley;

import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Jeongho on 2016/12/29.
 */

public class JsonParams {
    protected final JSONObject params = new JSONObject();

    public JsonParams() {
    }

    public void put(String key, String value) {
        if (key != null && value != null) {
            try {
                params.put(key, value);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void put(String key, boolean value){
        if (key != null) {
            try {
                params.put(key, value);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void put(String key, int value){
        if (key != null) {
            try {
                params.put(key, value);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void put(String key, float value){
        if (key != null) {
            try {
                params.put(key, value);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void put(String key, JSONArray value){
        if (key != null && value != null) {
            try {
                params.put(key, value);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void put(String key, JSONObject value){
        if (key != null && value != null) {
            try {
                params.put(key, value);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void put(String key, String[] value){
        if (key != null && value != null) {
            try {
                params.put(key, Arrays.asList(value));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private String getEncoderParamString(){
        StringBuilder result = new StringBuilder();
        Iterator it = params.keys();
        while (it.hasNext()){
            if (result.length() > 0){
                result.append("&");
            }

            String key = (String) it.next();
            String value = params.optString(key);
            result.append(URLEncoder.encode(key));
            result.append("=");
            result.append(URLEncoder.encode(value));
        }
        return result.toString();
    }

    public String toQueryString(String url){
        String paramString = getEncoderParamString();
        if (TextUtils.isEmpty(paramString)){
            return url;
        }

        if (url.indexOf("?") == -1){
            url += "?" + paramString;
        }else {
            url += "&" + paramString;
        }

        return url;
    }
}
