package com.database.android.database;

import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

/**
 * Created by admin on 31-10-2016.
 */

public class AddContactActivity extends Activity{
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add_contact, menu);
        return true;
    }

    public void cancel(View view) {
        finish();
    }
    public void addContact(View view) {
        DatabaseManager dbMgr = new DatabaseManager(this);
        String firstName = ((TextView) findViewById(
                R.id.firstName)).getText().toString();
        String lastName = ((TextView) findViewById(
                R.id.lastName)).getText().toString();
        String phone = ((TextView) findViewById(
                R.id.phone)).getText().toString();
        String email = ((TextView) findViewById(
                R.id.email)).getText().toString();
        Contact contact = new Contact(firstName, lastName,
                phone, email);
        dbMgr.addContact(contact);
        finish();
    }
}
