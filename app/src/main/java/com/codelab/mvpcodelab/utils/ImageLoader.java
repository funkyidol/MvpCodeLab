package com.codelab.mvpcodelab.utils;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by kshitij on 18/2/16.
 */
public class ImageLoader {
    public static void loadImage(String url, ImageView imageView, Context context){
        Picasso.with(context).load(url).into(imageView);
    }
}
