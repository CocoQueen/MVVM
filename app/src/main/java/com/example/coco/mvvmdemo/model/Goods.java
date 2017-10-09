package com.example.coco.mvvmdemo.model;

import android.databinding.ObservableField;

/**
 * Created by coco on 2017/10/8.
 */

public class Goods {
    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<Float> price = new ObservableField<>();
    public ObservableField<String> desc = new ObservableField<>();


    public Goods(String name, float price, String desc) {
        this.name.set(name);
        this.price.set(price);
        this.desc.set(desc);

    }
}
