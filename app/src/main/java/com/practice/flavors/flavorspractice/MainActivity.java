package com.practice.flavors.flavorspractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.practice.flavors.PhraseGenerator;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @BindView(R.id.tvHello) TextView hello;
    @BindView(R.id.etNombre) EditText nombre;
    @BindView(R.id.etEdad) EditText edad;
    @BindView(R.id.btnSave) Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.setDebug(true);
        ButterKnife.bind(this);

        setUpView();
    }

    private void setUpView(){
        hello.setText(PhraseGenerator.get());
    }

    @OnClick(R.id.btnSave)
    public void save(){
        Toast.makeText(this, nombre.getText(), Toast.LENGTH_LONG).show();
        startActivity(new Intent(this, SecondActivity.class));
    }

}
