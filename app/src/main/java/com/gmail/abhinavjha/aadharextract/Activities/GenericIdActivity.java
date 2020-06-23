package com.gmail.abhinavjha.aadharextract.Activities;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abhinavjha.aadahrextract.R;


public class GenericIdActivity extends AppCompatActivity {


    private Button ocr;
    private ImageView imageview;
    static final int REQUEST_TAKE_PHOTO = 1;
    private Bitmap mImageBitmap;
    private TextView mTextView;
    private CardView mCardView;
    private Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genericid);
    }









}
