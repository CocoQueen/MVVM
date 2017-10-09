package com.example.coco.mvvmdemo.model;

import android.app.Activity;
import android.view.View;

import com.example.coco.mvvmdemo.databinding.ActivityMainBinding;

/**
 * Created by coco on 2017/10/9.
 */

public class MainViewModel {
    ActivityMainBinding amb;

    public MainViewModel(Activity act ,ActivityMainBinding amb) {
        this.amb = amb;
        setGoods();
        setPrice();
    }
    public void setGoods(){
        amb.setGoods(new Goods("vivox20",88.88f,"hahaha"));
    }
    public void setPrice(){
        amb.setPrice(this);
    }
    public void click(View v){
        Goods goods = new Goods("vivox20",((float)(Math.random()*100.0f)),"啦啦啦");
        amb.setGoods(goods);
    }
}
