package volley;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jeongho.fast4android.R;
import com.orhanobut.logger.Logger;

/**
 * Created by Jeongho on 2016/12/23.
 */

public class TestActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        VolleyRequestManager.addRequest("www.stormzhang.com", new HttpResponse() {
//            @Override
//            public void ok(String response) {
//                Logger.d(response);
//            }
//
//            @Override
//            public void fail(String error) {
//                Logger.e(error);
//            }
//        });

        final JeonghoClient client = new JeonghoClient();

        new Thread(new Runnable() {
            @Override
            public void run() {
                client.get("/api/v1/home", new HttpResponse() {
                    @Override
                    public void ok(String response) {
                        Logger.d(response);
                    }

                    @Override
                    public void fail(String error) {
                        Logger.e(error);
                    }
                });
            }
        }).start();



    }
}
