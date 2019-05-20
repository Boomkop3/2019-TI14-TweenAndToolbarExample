package com.appsfromholland.a2019tweenanimation;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private ImageView curvedArrowImageView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.curvedArrowImageView = findViewById(R.id.curvedArrowImageView);

        //this.initToolBar();
        this.toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.toolbar.setTitle("Tween!");
        setSupportActionBar(this.toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_items, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()) {
            case R.id.action_blink:
                Log.i("", "Blink item selected");
                Animation blink = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
                curvedArrowImageView.startAnimation(blink);
                return true;
            case R.id.action_rotate:
                Log.i("", "Rotate item selected");
                Animation rot = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                curvedArrowImageView.startAnimation(rot);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void doAnimate()
    {
        Animation blink = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        Animation rot = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        curvedArrowImageView.startAnimation(blink);
    }
}
