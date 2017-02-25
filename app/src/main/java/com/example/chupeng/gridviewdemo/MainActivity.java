package com.example.chupeng.gridviewdemo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity
{
    private List<Bitmap> list;
    private Bitmap bitmap;
    private GridView gridView;
    private ImageAdapter adapter;
    private Handler handler;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        gridView = (GridView) findViewById(R.id.gridView);

        handler = new Handler()
        {
            public void handleMessage(Message msg)
            {
                switch (msg.what)
                {
                    case 123:
                        adapter = new ImageAdapter(MainActivity.this, (List<Bitmap>) msg.obj);
                        gridView.setAdapter(adapter);
                        break;
                }
            }
        };

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(MainActivity.this, ShowActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("data", list.get(position));
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        new Thread(new Runnable()
        {
            public void run()
            {
                list = new ArrayList<Bitmap>();
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.beer);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.bread);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.breakfast);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.burger);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.cake);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.carrot);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.check);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.chicken);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.closed);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.cocktails);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.coffeecup);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.croissant);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.cutlery1);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.cutlery);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.favorite);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.fish);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.fork);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.fruits);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.icecream);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.invoice);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.juice);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.kettle1);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.kettle);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.lobster);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.menu);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.mushrooms);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.napkins);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.open);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.pan);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.paymentmethod);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.pieceofcake);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.pizza);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.reserved);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.restaurant);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.saltandpepper);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.sausage);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.skewer);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.soup);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.spoon);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.steak);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.sushi);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.sushi1);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.sushi);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.table);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.teacup);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.terrace);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.tray1);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.tray);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.vegetables);
                list.add(bitmap);
                bitmap = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.wine);
                list.add(bitmap);
                Message message = new Message();
                message.what = 123;
                message.obj = list;
                handler.sendMessage(message);
            }
        }).start();
    }
}
