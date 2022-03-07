package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class ActivityHasil extends AppCompatActivity {

    //Deklarasi variabel dengan tipe data TextView
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        //Menghubungkan variabel txEmail dan txPassword dengan componen TextView pada Layout
        txEmail = findViewById(R.id.tvEmail);
        txPassword = findViewById(R.id.tvPassword);

        //Membuat objek bundle dan mengambil data yang dikirimkan dari activity sebelumnya
        Bundle bundle = getIntent().getExtras();

        //Membuat variabel string untuk menyimpan data yang dikirimkan dari activity sebelumnya dengan kunci "a" dan "b"
        String email = bundle.getString("a");
        String pass = bundle.getString("b");

        //Menampilkan value dari variabel email kedalam txEmail dan pass kedalam txPassword
        txEmail.setText(email);
        txPassword.setText(pass);
    }
}