package com.example.administrator.listview;

import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new MyAdapter());
    }


    public class MyAdapter extends BaseAdapter {
        private String[] names = { "京东商城", "QQ", "QQ斗地主", "新浪微博", "天猫",
                "UC浏览器", "微信" };

        private int[]  icons = {R.drawable.jd,R.drawable.qq,R.drawable.qq_dizhu,
                R.drawable.sina,R.drawable.tmall,R.drawable.uc,
                R.drawable.weixin};


        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int position) {
            return names[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v = View.inflate(MainActivity.this, R.layout.list_item, null);
            ImageView image = (ImageView)v.findViewById(R.id.image);
            image.setBackgroundResource(icons[position]);

            TextView textView = (TextView) v.findViewById(R.id.text);
            textView.setText(names[position]);
            return v;
        }
    }


}
