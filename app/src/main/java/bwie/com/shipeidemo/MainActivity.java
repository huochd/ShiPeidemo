package bwie.com.shipeidemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button pic;
    private Button lay;
    private Button wet;
    private Button ninepci;
    private Button dim;
    private Button ja;
    private Button bf;
    private Button auto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }


    private void initView() {
        pic = (Button) findViewById(R.id.pic);
        lay = (Button) findViewById(R.id.lay);
        wet = (Button) findViewById(R.id.wet);
        ninepci = (Button) findViewById(R.id.ninepci);
        dim = (Button) findViewById(R.id.dim);
        ja = (Button) findViewById(R.id.ja);
        bf = (Button) findViewById(R.id.bf

        );
        auto = (Button) findViewById(R.id.auto);

        pic.setOnClickListener(this);
        lay.setOnClickListener(this);
        wet.setOnClickListener(this);
        ninepci.setOnClickListener(this);
        dim.setOnClickListener(this);
        ja.setOnClickListener(this);
        bf.setOnClickListener(this);
        auto.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pic://图片适配
            startActivity(new Intent(MainActivity.this,PictureActivity.class));
                break;
            case R.id.lay://layout适配
                startActivity(new Intent(MainActivity.this,LayoutActivity.class));
                break;
            case R.id.wet://权重适配
                startActivity(new Intent(MainActivity.this,WeightActivity.class));
                break;
            case R.id.ninepci://.9图适配
                startActivity(new Intent(MainActivity.this,Picture9Activity.class));
                break;
            case R.id.dim://dimens适配
                startActivity(new Intent(MainActivity.this,DimensActivity.class));
                break;
            case R.id.ja://java代码适配
                startActivity(new Intent(MainActivity.this,JavaActivity.class));
                break;
            case R.id.bf://百分比适配
                startActivity(new Intent(MainActivity.this,BFActivity.class));
                break;
            case R.id.auto://自动化适配
                startActivity(new Intent(MainActivity.this,AutoActivity.class));
                break;
        }
    }
}
