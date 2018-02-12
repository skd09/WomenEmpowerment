package com.sharvari.womenempowerment.Activities;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;

import com.sharvari.womenempowerment.MainActivity;
import com.sharvari.womenempowerment.R;
import com.sharvari.womenempowerment.Utils.BlurBuilder;

/**
 * Created by sharvari on 09-Feb-18.
 */

public class LoginActivity extends AppCompatActivity {


    private EditText mobile, password;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        /*ImageView resultImage = (ImageView) findViewById(R.id.loginBG);
        Bitmap resultBmp = BlurBuilder.blur(this, BitmapFactory.decodeResource(getResources(), R.drawable.bg));
        resultImage.setImageBitmap(resultBmp);*/
        mobile = findViewById(R.id.et_mobile);
        password = findViewById(R.id.et_password);

        Drawable ic_mobile = getResources().getDrawable(R.drawable.ic_mobile);
        ic_mobile.setBounds(0,0,70,70);

        Drawable ic_password = getResources().getDrawable(R.drawable.ic_password);
        ic_password.setBounds(0,0,70,70);

        mobile.setCompoundDrawables(ic_mobile,null,null,null);
        password.setCompoundDrawables(ic_password,null,null,null);

        findViewById(R.id.txtRegister).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(i);
            }
        });
        findViewById(R.id.btnLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
