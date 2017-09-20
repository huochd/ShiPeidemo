package bwie.com.shipeidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 制作.9图必须是png格式,如果图片是jpg的，那么也要把后缀名改为png，然后再去制作
 * 使用：把.9图，放到drawable文件夹下，在控件里直接引用即可f
 * 注意：如果是.9图或者不需要多个分辨率的图片，放到drawable文件夹即可，对应分辨率的图片要放到正确的文件夹，否则会有内存消耗过大的问题
 */
public class Picture9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture9);
    }
}
