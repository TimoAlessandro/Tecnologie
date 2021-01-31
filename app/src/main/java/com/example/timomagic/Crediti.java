package com.example.timomagic;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Crediti extends AppCompatActivity {

    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crediti);

        Button sito = (Button) findViewById(R.id.btnSito);
        sito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://magic.wizards.com/it");
            }
        });

        Button youtube = (Button) findViewById(R.id.btnYT);
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/user/wizardsmtg");
            }
        });

        Button instagram = (Button) findViewById(R.id.btnInsta);
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/wizards_magic/");
            }
        });

        Button menu = (Button) findViewById(R.id.btnMenu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Esci");

                alertDialogBuilder
                        .setMessage("Vuoi tornare al menù principale?")
                        .setCancelable(false)
                        .setPositiveButton("Sì",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                Crediti.this.finish();
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

    private void gotoUrl(String s) {
        Uri link = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, link));
    }
}