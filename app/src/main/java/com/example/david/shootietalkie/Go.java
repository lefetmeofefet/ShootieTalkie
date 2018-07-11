package com.example.david.shootietalkie;

import android.os.Bundle;
import android.speech.SpeechRecognizer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;

import java.io.File;

public class Go extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON); // prevents the phone from sleeping.
        // Active speech recognition.
//        SpeechRecognizer recognizer;
//        recognizer = SpeechRecognizerSetup.defaultSetup()
//                .setAcousticModel(new File(modelsDir, "hmm/en-us-semi"))
//                .setDictionary(new File(modelsDir, "lm/cmu07a.dic"))
//                .setKeywordThreshold(1e-40f)
//                .getRecognizer();
//
//        recognizer.addListener(this);
//        recognizer.addKeyphraseSearch("keywordSearch", "oh mighty computer");
//        recognizer.startListening("keywordSearch);
    }

//    @Override
//    public void onPartialResult(Hypothesis hypothesis) {
//        if (hypothesis == null)
//            return;
//        String text = hypothesis.getHypstr();
//        if (text.equals(KEYPHRASE)) {
//            //  do something and restart listening
//            recognizer.cancel();
//            doSomething();
//            recognizer.startListening("keywordSearch");
//        }
//    }
}
