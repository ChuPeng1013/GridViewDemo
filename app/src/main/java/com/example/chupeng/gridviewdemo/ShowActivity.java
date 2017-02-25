package com.example.chupeng.gridviewdemo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.ImageView;

/**
 * Created by ChuPeng on 2017/2/25.
 */

public class ShowActivity extends AppCompatActivity
{
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_show);
        ImageView showImageView = (ImageView) findViewById(R.id.showImageView);
        Intent intent = getIntent();
        Bitmap bitmap = intent.getParcelableExtra("data");
        showImageView.setImageBitmap(bitmap);
    }
}
