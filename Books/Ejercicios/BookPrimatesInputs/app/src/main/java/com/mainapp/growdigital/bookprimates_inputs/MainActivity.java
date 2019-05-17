package com.mainapp.growdigital.bookprimates_inputs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  EditText inputText;
  Button  okButton;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    /* variables*/

    inputText =findViewById(R.id.name_input);
    okButton = findViewById(R.id.the_button);
    final String someName = "Anakin";

    /* set click button */

    okButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        String name = (inputText.getText().toString().equals(someName)) ? "Get a Life" : inputText.getText().toString();
        Toast.makeText(MainActivity.this,"Hello "+name,Toast.LENGTH_LONG).show();
      }
    });
  }

  @Override
  protected void onPause() {
    super.onPause();
    inputText.setText("ON PAUSE METHOD CALLED");
  }
}
