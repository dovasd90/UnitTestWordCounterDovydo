package com.example.wordcounterdovydo;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.graphics.Insets;
import androidx.activity.EdgeToEdge;

public class MainActivity extends AppCompatActivity {

    EditText edUserInput;
    TextView tvResults;
    Spinner spSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        spSelection = findViewById(R.id.spSelection);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.multiple_options,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spSelection.setAdapter(adapter);

        edUserInput = findViewById(R.id.edUserInput);
        tvResults = findViewById(R.id.tvResults);
    }

    public void btnCountClick(View view) {
        String phrase = edUserInput.getText().toString().trim();

        if (TextUtils.isEmpty(phrase)) {
            edUserInput.setError("Please input something");
            tvResults.setText(""); // Clear previous results
            return;
        }

        String selectedOption = spSelection.getSelectedItem().toString();
        if ("Chars".equalsIgnoreCase(selectedOption)) {
            int charsCount = TextCounter.getCharsCount(phrase);
            tvResults.setText("Character count: " + charsCount);
        } else if ("Words".equalsIgnoreCase(selectedOption)) {
            int wordCount = TextCounter.getWordsCount(phrase);
            tvResults.setText("Word count: " + wordCount);
        }
    }
}
