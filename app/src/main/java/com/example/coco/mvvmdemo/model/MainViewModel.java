package com.example.coco.mvvmdemo.model;

import android.app.Activity;
import android.view.View;

import com.example.coco.mvvmdemo.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by coco on 2017/10/9.
 */

public class MainViewModel {
    ActivityMainBinding amb;

    public MainViewModel(Activity act ,ActivityMainBinding amb) {
        this.amb = amb;
        setGoods();
        setPrice();
        setList();
        setMap();
    }
    public void setMap(){
        HashMap<String,String>map = new HashMap<>();
        map.put("name","vivox20");
        map.put("price","2999");
        map.put("desc","全面屏");
        amb.setMap(map);
    }
    public void setList(){
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add("aaa"+i);
        }
        amb.setList(strings);
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
