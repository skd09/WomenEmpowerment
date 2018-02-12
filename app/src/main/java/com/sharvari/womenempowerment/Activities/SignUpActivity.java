package com.sharvari.womenempowerment.Activities;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

import com.sharvari.womenempowerment.R;

/**
 * Created by sharvari on 12-Feb-18.
 */

public class SignUpActivity  extends AppCompatActivity {


    private EditText mobile, password, retype, name, country, city;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            w.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        }

        mobile = findViewById(R.id.et_mobile);
        password = findViewById(R.id.et_password);
        retype = findViewById(R.id.et_repassword);
        name = findViewById(R.id.et_name);
        country = findViewById(R.id.et_country);
        city = findViewById(R.id.et_city);

        Drawable ic_mobile = getResources().getDrawable(R.drawable.ic_mobile);
        ic_mobile.setBounds(0,0,70,70);

        Drawable ic_password = getResources().getDrawable(R.drawable.ic_password);
        ic_password.setBounds(0,0,70,70);

        Drawable ic_name = getResources().getDrawable(R.drawable.ic_user);
        ic_name.setBounds(0,0,70,70);

        Drawable ic_country = getResources().getDrawable(R.drawable.ic_country);
        ic_country.setBounds(0,0,70,70);

        Drawable ic_city = getResources().getDrawable(R.drawable.ic_city);
        ic_city.setBounds(0,0,70,70);

        mobile.setCompoundDrawables(ic_mobile,null,null,null);
        password.setCompoundDrawables(ic_password,null,null,null);
        retype.setCompoundDrawables(ic_password,null,null,null);
        name.setCompoundDrawables(ic_name,null,null,null);
        country.setCompoundDrawables(ic_country,null,null,null);
        city.setCompoundDrawables(ic_city,null,null,null);
    }
}