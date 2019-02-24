package com.example.anthonyshorter.secondactivity

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class secondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data = intent.extras

        if (data != null ){
            var name = data.get("name")
            var char = data.getChar("char")
            var int = data.getInt("int")

            Toast.makeText(this, name.toString() + ", char: " + char + ", int: "+ int, Toast.LENGTH_LONG).show()
        }

        goBackButton.setOnClickListener {

            var returnIntent = this.intent
            returnIntent.putExtra("return", "Hello from second activity")
            setResult(Activity.RESULT_OK, returnIntent)
            finish()

        }
    }


}