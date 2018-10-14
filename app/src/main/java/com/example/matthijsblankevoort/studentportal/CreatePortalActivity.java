package com.example.matthijsblankevoort.studentportal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class CreatePortalActivity extends AppCompatActivity {

    private ListView listView;
    private Button addButton;

    private EditText titleInput;
    private EditText urlInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_portal);

        addButton = findViewById(R.id.button);

        urlInput = findViewById(R.id.urlInput);
        titleInput = findViewById(R.id.titleInput);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent = getIntent();

            String url = urlInput.getText().toString();
            String title = titleInput.getText().toString();
            intent.putExtra("title", title);
            intent.putExtra("url", url);
            setResult(RESULT_OK, intent);
            finish();
            }
        });
    }
}
