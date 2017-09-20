package bwie.com.shipeidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * dimens适配，Android开发最常用的适配，主要对控件的长度，控件之间距离机进行一个适配
 *使用步骤：1.创建对应的Values-分辨率的值，文件夹
 *         2.在对应目录下复制一份dimens.xlm
 *         3.在文件下创建dimen条目，设置自定义条目名，dp属性
 *         4.在要用到dp的控件引用dimen条目即可：格式->@dimen/xx
 */

public class DimensActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dimens);
    }
}
