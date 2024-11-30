
package com.aysusen.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //global assignment:
    EditText test1;
    EditText test2;
    TextView result;

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
        //start variable:
        test1 = findViewById(R.id.test);
        test2 = findViewById(R.id.test2);
        result = findViewById(R.id.result);
    }

    public void sum(View view) {
        if (test1.getText().toString().matches("") || (test2.getText().toString().matches(""))) {
            result.setText("Enter number!");
        } else {
            //gettext is editable class,toString method and to int
            //test1.getText().toString();//accesible because of global variable
            int number1 = Integer.parseInt(test1.getText().toString());
            int number2 = Integer.parseInt(test2.getText().toString());
            int result1 = number1 + number2;

            result.setText("Result: " + result1);
        }
    }

    public void multiplication(View viev) {
        if (test1.getText().toString().matches(" ") || (test2.getText().toString().matches(" "))) {
            result.setText("Enter number!");
        } else {
            //gettext is editable class,toString method and to int
            //test1.getText().toString();//accesible because of global variable
            int number1 = Integer.parseInt(test1.getText().toString());
            int number2 = Integer.parseInt(test2.getText().toString());
            int result1 = number1 * number2;

            result.setText("Result: " + result1);
        }
    }

    public void subt(View view) {
        if (test1.getText().toString().matches(" ") || (test2.getText().toString().matches(" "))) {
            result.setText("Enter number!");
        } else {
            //gettext is editable class,toString method and to int
            //test1.getText().toString();//accesible because of global variable
            int number1 = Integer.parseInt(test1.getText().toString());
            int number2 = Integer.parseInt(test2.getText().toString());
            int result1 = number1 - number2;

            result.setText("Result: " + result1);
        }
    }

    public void divide(View view) {
        if (test1.getText().toString().matches(" ") || (test2.getText().toString().matches(" "))) {
            result.setText("Enter number!");
        } else {
            //gettext is editable class,toString method and to int
            //test1.getText().toString();//accesible because of global variable
            int number1 = Integer.parseInt(test1.getText().toString());
            int number2 = Integer.parseInt(test2.getText().toString());
            if (number2 == 0) {
                result.setText("Cannot divide by zero!");
                int result1 =0;

                result.setText("Result: " + result1);
            }
                int result1 = number1 / number2;

                result.setText("Result: " + result1);
            }
        }
    }
