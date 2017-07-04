package com.moruna.templatepattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class TemplatePatternTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_pattern_test);

        Book book = new Book();
        book.setBookName("Thinking in Java");
        book.setPages(880);
        book.setPrice(68);
        book.setAuthor("Bruce Eckel");

        //完全供其他调用，需要哪种格式就调用哪种，代码可阅读性更强
        Formatter xmlFormatter = new XmlFormatter();
        xmlFormatter.formatBook(book);

        Formatter jsonFormatter = new JsonFormatter();
        jsonFormatter.formatBook(book);
    }
}
