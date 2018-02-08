package com.example.ysj.lb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private BannerLayout banner_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banner_layout = findViewById(R.id.banner_layout);

        List<String> list = new ArrayList<>();
        list.add("http://ysjvideo.oss-cn-beijing.aliyuncs.com/test.png");
        list.add("http://ysjvideo.oss-cn-beijing.aliyuncs.com/test2.png");
        list.add("http://ysjvideo.oss-cn-beijing.aliyuncs.com/%E6%B5%8B%E8%AF%95%E9%A6%96%E9%A1%B5/%E9%A6%96%E9%A1%B5%E7%83%AD%E9%97%A8%E4%B8%93%E4%B8%9A.png");
        list.add("http://ysjvideo.oss-cn-beijing.aliyuncs.com/%E6%B5%8B%E8%AF%95%E9%A6%96%E9%A1%B5/%E9%A6%96%E9%A1%B5%E7%83%AD%E9%97%A8%E4%B8%93%E4%B8%9A.png");

        banner_layout.removeAllViews();
        banner_layout.setViewUrls(list);
        banner_layout.setOnBannerItemClickListener(new BannerLayout.OnBannerItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this,"点击了" + position,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
