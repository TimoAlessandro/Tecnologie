package com.example.timomagic;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    final Context context = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button partita = (Button) findViewById(R.id.btnPartita);
        partita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Partita();
            }
        });

        Button crediti = (Button) findViewById(R.id.btnCrediti);
        crediti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Crediti();
            }
        });

        Button regole = (Button) findViewById(R.id.btnRegole);
        regole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Regolamento();
            }
        });

        Button esci = (Button) findViewById(R.id.btnEsci);
        esci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Esci");

                alertDialogBuilder
                        .setMessage("Sei sicuro di voler chiudere l'app?")
                        .setCancelable(false)
                        .setPositiveButton("Sì",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                finish();
                            }
                        })
                        .setNegativeButton("No",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
    }

    public void Partita() {
        Intent intent = new Intent(this, Partita.class);
        startActivity(intent);
    }

    public void Crediti() {
        Intent intent = new Intent(this, Crediti.class);
        startActivity(intent);
    }

    public void Regolamento() {
        Intent intent = new Intent(this, Regolamento.class);
        startActivity(intent);
    }
}