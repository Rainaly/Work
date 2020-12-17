package com.example.day01;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.yc.video.player.VideoPlayer;
import com.yc.video.ui.view.BasisVideoController;

public class MainActivity extends AppCompatActivity {


    private String url = "http://yun918.cn/video/1578640184375179.mp4";
    private VideoPlayer mVideoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mVideoPlayer = (VideoPlayer) findViewById(R.id.video_player);

        //创建基础视频播放器，一般播放器的功能
        BasisVideoController controller = new BasisVideoController(this);
        //设置控制器
        mVideoPlayer.setController(controller);
        //设置视频播放链接地址
        mVideoPlayer.setUrl(url);
        //开始播放
        mVideoPlayer.start();

        mVideoPlayer.postDelayed(new Runnable() {
            @Override
            public void run() {
                mVideoPlayer.start();
            }
        },300);
    }
}
