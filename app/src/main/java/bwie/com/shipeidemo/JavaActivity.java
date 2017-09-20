package bwie.com.shipeidemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class JavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        ImageView imageView= (ImageView) findViewById(R.id.image);
        displayFigure(imageView);
    }
    private void displayFigure(ImageView imageView){
        Bitmap bm = null;
        try{
            //从assets目录中读取图片
            InputStream is = getAssets().open("aa.jpg");
            bm = BitmapFactory.decodeStream(is);

            if(bm != null) {
                imageView.setImageBitmap(bm);

                //将px转换成dp，并重新设置ImageView的布局尺寸
                DisplayMetrics metrics = getResources().getDisplayMetrics();
                int width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, bm.getWidth(), metrics);
                int height = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, bm.getHeight(), metrics);

                imageView.getLayoutParams().width = width;
                imageView.getLayoutParams().height = height;
            }
        }catch (OutOfMemoryError err){
            System.gc();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
