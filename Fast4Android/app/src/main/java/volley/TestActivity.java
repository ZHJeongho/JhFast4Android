package volley;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.jeongho.fast4android.R;

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

        client.getBitmap("http://p3.qhimg.com/t01fd7e086ea804717d.jpg", 600, 600,
                ImageView.ScaleType.CENTER_INSIDE, Bitmap.Config.ARGB_8888, new HttpCallback<Bitmap>() {
                    @Override
                    public void ok(Bitmap response) {
                        mImageView.setImageBitmap(response);
                    }

                    @Override
                    public void fail(String error) {

                    }
                });
    }
}
