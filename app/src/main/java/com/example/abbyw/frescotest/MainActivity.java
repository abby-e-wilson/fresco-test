package com.example.abbyw.frescotest;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.facebook.datasource.BaseDataSubscriber;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSubscriber;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.ImagePipeline;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //show image1
        Uri uri1 = Uri.parse("http://cdn3-www.dogtime.com/assets/uploads/gallery/30-impossibly-cute-puppies/impossibly-cute-puppy-30.jpg");
        SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.pug_view);
        draweeView.setImageURI(uri1);
        //show image 2
        Uri uri2 = Uri.parse("https://i.ytimg.com/vi/a6KGPBflhiM/hqdefault.jpg");
        SimpleDraweeView draweeView2 = (SimpleDraweeView) findViewById(R.id.golden_view);
        draweeView2.setImageURI(uri2);
        //show image 3
        Uri uri3 = Uri.parse("http://cdn3-www.dogtime.com/assets/uploads/gallery/30-impossibly-cute-puppies/impossibly-cute-puppy-15.jpg");
        SimpleDraweeView draweeView3 = (SimpleDraweeView) findViewById(R.id.fluffypuppy_view);
        draweeView3.setImageURI(uri3);

    }
}
