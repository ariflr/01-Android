package com.ariflr.projectpertama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //tipe data
    String namaFirst = "Arif";
    String namaLast = "Luqman";

    //deklarasi widget
    TextView txtWelcome;

    EditText txtNama, txtSkl;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Full name ;  " + namaFirst + namaLast);

        //memanggil id dari textView
        txtWelcome = (TextView) findViewById(R.id.txtWelcome);
        txtNama = (EditText) findViewById(R.id.txtNama);
        txtSkl = (EditText) findViewById(R.id.txtSkl);
        btnSubmit = (Button) findViewById(R.id.btnsubmit);

        //menambahkan aksi ketika btnSubmit di klik
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil nilai dari txtNama dan TxtSekola
                String nNama = txtNama.getText().toString();
                String nSkl = txtSkl.getText().toString();

                // untuk menampilkan hasil ke textView
                txtWelcome.setText("Haloo, " + nNama + nSkl);

            }
        });

    }
}
