package com.sgffsg.patternlockview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.patternlock_setting).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,PatternLockActivity.class);
                intent.putExtra("type","setting");
                startActivity(intent);
            }
        });
        findViewById(R.id.patternlock_open).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,PatternLockActivity.class);
                intent.putExtra("type","open");
                startActivity(intent);
            }
        });
    }
}
