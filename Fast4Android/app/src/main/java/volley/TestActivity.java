package volley;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.jeongho.fast4android.R;
import com.orhanobut.logger.Logger;

/**
 * Created by Jeongho on 2016/12/23.
 */

public class TestActivity extends AppCompatActivity {
    private ImageView mImageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView) findViewById(R.id.iv);

        final JeonghoClient client = new JeonghoClient();

        client.get("http://www.baidu.com", new HttpCallback() {
            @Override
            public void ok(Object response) {
                String result = (String) response;
                Logger.d(result);
            }

            @Override
            public void fail(String error) {

            }
        });

    }
}
