package com.mobileapps.piglatin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private static String word;

    TextView tvResult;
    EditText etWord;
    Button btnButton;
    int start = 0;
    int firstVowel = 0;



    @Override
    protected onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult=findViewById(R.id.tvResult);
        etWord=findViewById(R.id.etWord);
        btnButton=findViewById(R.id.btnToPigLatin);

        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvResult.setText(etWord);

            }
        });

        int end = etWord.length();

        final char [] vowels = {'a','e','i','o','u'};

            for(int i = 0; i < end; i++) {
                char c = Character.toLowerCase(word.charAt(i));
                if(Arrays.asList(vowels).contains(c)) {
                    firstVowel = i;
                    break;
                }
            }
            if(start != firstVowel) {
                String startString = etWord.(firstVowel, end);
                String endString = etWord.(start, firstVowel) + "ay";
                return startString+endString;

            }


        }


        }
