package com.example.deekshithamanjunath.manageroptions;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button add, delete, edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = (Button) findViewById(R.id.addItems);
        add.setOnClickListener(this);
        delete = (Button) findViewById(R.id.deleteItems);
        delete.setOnClickListener(this);
        edit = (Button) findViewById(R.id.editItems);
        edit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.addItems:
                break;
            case R.id.editItems:
                break;
            case R.id.deleteItems:
                Log.d("Tag","Delete Mode");
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                View view = getLayoutInflater().inflate(R.layout.delete_popup_window,null);
                TextView message = (TextView) view.findViewById(R.id.textView);
                Button yes = (Button) view.findViewById(R.id.buttonYes);
                Button no = (Button) view.findViewById(R.id.buttonNo);
                builder.setView(view);
                final AlertDialog dialog = builder.create();
                dialog.show();

                yes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });

                no.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();

                    }
                });

                break;
        }

    }
}
