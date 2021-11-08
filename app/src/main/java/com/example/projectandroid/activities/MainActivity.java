package com.example.projectandroid.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projectandroid.R;

public class MainActivity extends AppCompatActivity {

    private Button btnAllBooks, btnAlreadyReadBook,
            btnWantToRead, btnCurrentlyReadingBook,
            btnFavoriteBook, btnAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btnAllBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllBookActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {

        btnAllBooks = findViewById(R.id.btnAllBooks);
        btnAlreadyReadBook = findViewById(R.id.btnAlreadyReadBook);
        btnWantToRead = findViewById(R.id.btnWantToRead);
        btnCurrentlyReadingBook = findViewById(R.id.btnCurrentlyReading);
        btnFavoriteBook = findViewById(R.id.btnFavoriteBook);
        btnAbout = findViewById(R.id.btnAbout);
    }
}