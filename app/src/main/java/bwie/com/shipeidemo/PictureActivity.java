package bwie.com.shipeidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 图片适配(根据主流的分辨率去切一套图，不会切多套图，因为图片体积非常大，会使app体积也变大)
 * 原因：在不同密度的手机上，图片大小会不一致，导致图片会变形
 * 解决方案：把不同的分辨率手机，所需要的图片，放在对应mipmap文件下载即可，系统会根据用户手机自动进行适配
 *实际运用：在1080*1920 这个手机上，一张图片变形了，非常不好看，那么我让美工根据这个分辨率在弄一张图片，然后放到对应的文件夹下即可
 * 提示：每个手机的频幕密度都会有所不同，因此当程序运行到手机时，系统会根据当前所对应的屏幕密度去找对应文件夹下的图片，比如我们启动一个屏幕密度
 * 为150dp的手机，那么他加载的图片就是mdpi下的图片，其他的就以此类推。如果图片就一张，那么系统会有就近原则，会在dp最靠近的文件夹下找文件
 *
 * 注意:把合适的图片放到对应的文件夹,可以节省内存,把高分辨率的图片放到低分辨率的文件夹下,会导致内存消耗随着差值越大,消耗越大
 提示:如果条件有限,就按照高分辨率的切一套图,放到高分辨率的文件夹下,这样就可以极大节省内存
 *
 */
public class PictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
    }
}
