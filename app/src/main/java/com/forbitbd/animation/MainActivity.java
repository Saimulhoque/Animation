package com.forbitbd.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnzoomin, btnzoomout, btnblink, btnfadein, btnfadeout, btncrossfade, btnrotate, btnmove, btnbounce, btnslideup, btnslidedown, btnsequental;
    ImageView imageView;
    Animation animZoomIn, animZoomOut,animBlink,animFadeIn,animFadeOut,animCrossFade, animRotate, animMove, animBounce, animSlideup, animSlideDown,animSequental;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image);
        btnzoomin = findViewById(R.id.zoomin);
        btnzoomout = findViewById(R.id.zoomout);
        btnblink = findViewById(R.id.blink);
        btnfadein = findViewById(R.id.fadein);
        btnfadeout = findViewById(R.id.fadeout);
        btncrossfade = findViewById(R.id.crossfade);
        btnrotate = findViewById(R.id.rotate);
        btnmove = findViewById(R.id.move);
        btnbounce = findViewById(R.id.bounce);
        btnslideup = findViewById(R.id.slideup);
        btnslidedown = findViewById(R.id.slidedown);
        btnsequental = findViewById(R.id.sequental);

        btnzoomin.setOnClickListener(this);
        btnzoomout.setOnClickListener(this);
        btnblink.setOnClickListener(this);
        btnfadein.setOnClickListener(this);
        btnfadeout.setOnClickListener(this);
        btncrossfade.setOnClickListener(this);
        btnrotate.setOnClickListener(this);
        btnmove.setOnClickListener(this);
        btnbounce.setOnClickListener(this);
        btnslideup.setOnClickListener(this);
        btnslidedown.setOnClickListener(this);
        btnsequental.setOnClickListener(this);

        animZoomIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
        animZoomOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
        animBlink = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        animCrossFade = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.cross_fading);
        animRotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        animMove = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        animBounce = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
        animSlideup = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
        animSlideDown = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
        animSequental = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sequental);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.zoomin:
                imageView.startAnimation(animZoomIn);
                break;
            case R.id.zoomout:
                imageView.startAnimation(animZoomOut);
                break;
            case R.id.blink:
                imageView.startAnimation(animBlink);
                break;
            case R.id.fadein:
                imageView.startAnimation(animFadeIn);
                break;
            case R.id.fadeout:
                imageView.startAnimation(animFadeOut);
                break;
            case R.id.crossfade:
                imageView.startAnimation(animCrossFade);
                break;
            case R.id.rotate:
                imageView.startAnimation(animRotate);
                break;
            case R.id.move:
                imageView.startAnimation(animMove);
                break;
            case R.id.bounce:
                imageView.startAnimation(animBounce);
                break;
            case R.id.slideup:
                imageView.startAnimation(animSlideup);
                break;
            case R.id.slidedown:
                imageView.startAnimation(animSlideDown);
                break;
            case R.id.sequental:
                imageView.startAnimation(animSequental);
                break;
        }
    }
}