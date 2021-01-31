package com.example.timomagic;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Regolamento extends AppCompatActivity {

    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regolamento);

        Button esci = (Button) findViewById(R.id.btnInd);
        esci.setOnClickListener(new View.OnClickListener() {
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
                                Regolamento.this.finish();
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

        Button antiMal = (Button) findViewById(R.id.btnAntiMalocchio);
        antiMal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Anti-Malocchio");

                alertDialogBuilder
                        .setMessage("Una creatura con antimalocchio non può essere bersaglio di magie o abilità controllate dai tuoi avversari, comprese le magie Aura. Le tue magie e le tue abilità, invece, possono bersagliarla.")
                        .setCancelable(false)

                        .setNegativeButton("Chiudi",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        Button attImpr = (Button) findViewById(R.id.btnAttImpr);
        attImpr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Attacco Imporvviso");

                alertDialogBuilder
                        .setMessage("Una creatura con attacco improvviso infligge il suo danno in combattimento prima delle creature senza attacco improvviso o doppio attacco.")
                        .setCancelable(false)

                        .setNegativeButton("Chiudi",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        Button cautela = (Button) findViewById(R.id.btnCautela);
        cautela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Cautela");

                alertDialogBuilder
                        .setMessage("Una creatura con cautela attacca senza TAPpare. (Tuttavia, cautela non permette di attaccare a una creatura TAPpata, né a una creatura che è entrata nel campo di battaglia in questo turno.)")
                        .setCancelable(false)

                        .setNegativeButton("Chiudi",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        Button rigenerare = (Button) findViewById(R.id.btnRigenera);
        rigenerare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Rigenerare");

                alertDialogBuilder
                        .setMessage("Quando rigeneri una creatura, eviti che venga distrutta. Invece di essere distrutta, la creatura viene TAPpata, rimossa dal combattimento (se è in combattimento) e guarita dai danni.")
                        .setCancelable(false)

                        .setNegativeButton("Chiudi",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        Button bersaglio = (Button) findViewById(R.id.btnBersaglio);
        bersaglio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Bersaglio");

                alertDialogBuilder
                        .setMessage("Se in una magia compare la parola “bersaglio”, scegli cosa influenzerà quella magia quando la lanci. Lo stesso vale per le abilità che attivi.")
                        .setCancelable(false)

                        .setNegativeButton("Chiudi",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        Button difensore = (Button) findViewById(R.id.btnDifensore);
        difensore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Difensore");

                alertDialogBuilder
                        .setMessage("Una creatura con difensore non può attaccare.")
                        .setCancelable(false)

                        .setNegativeButton("Chiudi",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        Button doppioAtt = (Button) findViewById(R.id.btnDoppio);
        doppioAtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Doppio Attacco");

                alertDialogBuilder
                        .setMessage("Una creatura con doppio attacco infligge danno due volte in ciascun combattimento: una prima delle creature senza attacco improvviso o doppio attacco e una quando le creature infliggono danno normalmente.")
                        .setCancelable(false)

                        .setNegativeButton("Chiudi",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        Button indistruttibile = (Button) findViewById(R.id.btnIndistrut);
        indistruttibile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Indistruttibile");

                alertDialogBuilder
                        .setMessage("Un permanente indistruttibile non può essere distrutto dal danno o dagli effetti che dicono “distruggi”. Può comunque essere sacrificato o esiliato. Se un effetto riduce la costituzione di una creatura indistruttibile a 0 o meno, viene comunque messa nel cimitero del suo proprietario.")
                        .setCancelable(false)

                        .setNegativeButton("Chiudi",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        Button intimidire = (Button) findViewById(R.id.btnIntimidire);
        intimidire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Intimidire");

                alertDialogBuilder
                        .setMessage("Una creatura con intimidire non può essere bloccata tranne che da creature artefatto e/o creature che condividono con essa un colore.")
                        .setCancelable(false)

                        .setNegativeButton("Chiudi",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        Button lampo = (Button) findViewById(R.id.btnLampo);
        lampo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Lampo");

                alertDialogBuilder
                        .setMessage("Una magia con lampo può essere lanciata in ogni momento in cui potresti lanciare un istantaneo, anche in risposta ad altre magie.")
                        .setCancelable(false)

                        .setNegativeButton("Chiudi",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        Button legameVitale = (Button) findViewById(R.id.btnLegame);
        legameVitale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Legame Vitale");

                alertDialogBuilder
                        .setMessage("Se una creatura con legame vitale infligge danno, il suo controllore guadagna anche altrettanti punti vita.")
                        .setCancelable(false)

                        .setNegativeButton("Chiudi",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        Button protezione = (Button) findViewById(R.id.btnProtezione);
        protezione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Protezione");

                alertDialogBuilder
                        .setMessage("Una creatura con protezione da un colore non può essere bloccata, incantata, bersagliata o subire danni da una qualsiasi carta di quel colore.")
                        .setCancelable(false)

                        .setNegativeButton("Chiudi",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        Button raggiungere = (Button) findViewById(R.id.btnRaggiungere);
        raggiungere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Raggiungere");

                alertDialogBuilder
                        .setMessage("Una creatura con raggiungere può bloccare le creature con volare (oltre a quelle senza volare).")
                        .setCancelable(false)

                        .setNegativeButton("Chiudi",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        Button rapidita = (Button) findViewById(R.id.btnRapidità);
        rapidita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Rapidità");

                alertDialogBuilder
                        .setMessage("Una creatura con rapidità può attaccare e puoi attivare le sue abilità di (TAPpare) non appena entra sotto il tuo controllo.")
                        .setCancelable(false)

                        .setNegativeButton("Chiudi",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        Button volare = (Button) findViewById(R.id.btnVolare);
        volare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Volare");

                alertDialogBuilder
                        .setMessage("Una creatura con volare non può essere bloccata tranne che da creature con volare e/o raggiungere.")
                        .setCancelable(false)

                        .setNegativeButton("Chiudi",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        Button toccoLetale = (Button) findViewById(R.id.btnTocco);
        toccoLetale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Tocco letale");

                alertDialogBuilder
                        .setMessage("Una creatura che subisce danni da una creatura con tocco letale viene distrutta.")
                        .setCancelable(false)

                        .setNegativeButton("Chiudi",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        Button travolgere = (Button) findViewById(R.id.btnTravolgere);
        travolgere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Travolgere");

                alertDialogBuilder
                        .setMessage("Se una creatura con travolgere sta per assegnare alle sue creature bloccanti danno sufficiente a distruggerle, puoi farle assegnare il resto del suo danno al giocatore o al planeswalker che sta attaccando.")
                        .setCancelable(false)

                        .setNegativeButton("Chiudi",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        Button planesWalker = (Button) findViewById(R.id.btnPlaneswalker);
        planesWalker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Planeswalker");

                alertDialogBuilder
                        .setMessage("I planeswalker sono alleati potenti a cui puoi fare appello affinché combattano al tuo fianco.")
                        .setCancelable(false)

                        .setNegativeButton("Chiudi",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });
    }
}