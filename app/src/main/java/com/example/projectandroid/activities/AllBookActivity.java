package com.example.projectandroid.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projectandroid.R;
import com.example.projectandroid.adapters.BookRecViewAdapter;
import com.example.projectandroid.objects.Book;

import java.util.ArrayList;

public class AllBookActivity extends AppCompatActivity {

    private RecyclerView booksRecView;
    private BookRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_book);

        adapter = new BookRecViewAdapter(this);
        booksRecView =findViewById(R.id.booksRecView);

        booksRecView.setAdapter(adapter);
        booksRecView.setLayoutManager(new GridLayoutManager(this,2));

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1,"Đắc Nhân Tâm", "Nguyễn Văn Phước",1999,"https://firstnews.com.vn/public/uploads/products/dac-nhan-tam-biamem2019-76k-bia1.jpg"
        ,"Những ai có thể đặt mình vào vị trí người khác","Những ai có thể đặt mình vào vị trí người khác,những ai có thể hiểu những suy tư, cảm nhận của mọi người thì không bao giờ phải lo lắng cho tương lai."));
        adapter.setBooks(books);
    }
}