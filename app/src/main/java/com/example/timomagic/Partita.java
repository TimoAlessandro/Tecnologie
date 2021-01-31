package com.example.timomagic;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Telephony;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class Partita extends AppCompatActivity {

    private static int count;
    private Chronometer chrono;
    private boolean run;
    private long pause;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partita);
        count  = 20;

        chrono = findViewById(R.id.cronometro);

        Button incrementa = (Button) findViewById(R.id.btninc);
        incrementa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                count ++;
                TextView puntiVita = (TextView) findViewById(R.id.textLife);
                puntiVita.setText(""+count);
            }
        });

        Button decrementa = (Button) findViewById(R.id.btndec);
        decrementa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(count>0) {
                    count--;
                    TextView puntiVita = (TextView) findViewById(R.id.textLife);
                    puntiVita.setText("" + count);
                }
                if(count==0) {
                    decrementa.setEnabled(false);
                    incrementa.setEnabled(false);
                    TextView ris = (TextView) findViewById(R.id.txtRisultato);
                    ris.setVisibility(View.VISIBLE);
                    pauseChrono();
                }
            }
        });

        Button nuovaPartita = (Button) findViewById(R.id.btnNuovaPartita);
        nuovaPartita.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                count=20;
                TextView puntiVita = (TextView) findViewById(R.id.textLife);
                puntiVita.setText("" + count);
                decrementa.setEnabled(true);
                incrementa.setEnabled(true);
                TextView ris = (TextView) findViewById(R.id.txtRisultato);
                ris.setVisibility(View.INVISIBLE);
                resetChrono();
                startChrono();
            }
        });

        Button menu = (Button) findViewById(R.id.btnIndietro);
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
                                Partita.this.finish();
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

        Button dado = (Button) findViewById(R.id.btnDado);
        dado.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Random rn = new Random();
                int max = 6;
                int min = 1;
                int ris = rn.nextInt(max - min + 1) + min;
                TextView dadoRis = (TextView) findViewById(R.id.txtDado);
                dadoRis.setText(""+ris);
            }
        });
    }













    public void startChrono(){
        if (!run) {
            chrono.setBase(SystemClock.elapsedRealtime() - pause);
            chrono.start();
            run = true;
        }
    }

    public void pauseChrono(){
        if (run) {
            chrono.stop();
            pause = SystemClock.elapsedRealtime() - chrono.getBase();
            run = false;
        }
    }

    public void resetChrono() {
        chrono.setBase(SystemClock.elapsedRealtime());
        pause = 0;
    }
}