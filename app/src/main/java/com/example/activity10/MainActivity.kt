package com.example.activity10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.take_picture -> {
                Toast.makeText(this, "Take a picture", Toast.LENGTH_SHORT).show()
            }
            R.id.help -> {
                Toast.makeText(this, "Help", Toast.LENGTH_SHORT).show()
            }
            R.id.delete -> {
                AlertDialog.Builder(this)
                    .setTitle("Delete confirmation")
                    .setMessage("Are you sure you want to delete?")
                    .setPositiveButton("Yes") { _, _ ->
                        Toast.makeText(this, "Picture Deleted", Toast.LENGTH_SHORT).show()
                    }
                    .setNegativeButton("No") { _, _ ->
                        Toast.makeText(this, "Not deleted", Toast.LENGTH_SHORT).show()
                    }
                    .setCancelable(false)
                    .create()
                    .show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}