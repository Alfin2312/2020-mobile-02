package id.putraprima.marketplacelayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class logn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logn);
    }

    public void login(View view) {
        Intent i = new Intent(logn.this, profi.class);
        startActivity(i);
    }

    public void regis(View view) {
        Intent i = new Intent(logn.this, regis.class);
        startActivity(i);
    }

}

