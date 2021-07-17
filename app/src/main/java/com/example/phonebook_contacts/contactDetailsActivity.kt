package com.example.phonebook_contacts

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.squareup.picasso.Picasso

class contactDetailsActivity : AppCompatActivity() {
    lateinit var cvContact:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)
        val name2 = intent.getStringExtra("name")
        val phone2 = intent.getStringExtra("phone")
        val email2 = intent.getStringExtra("email")
        val imageurl = intent.getStringExtra("image")

        val intentName = findViewById<TextView>(R.id.tvname2)
        val intentPhone = findViewById<TextView>(R.id.tvphone2)
        val intentEmail = findViewById<TextView>(R.id.tvemail2)
        val image = findViewById<ImageView>(R.id.ivContact2)
        Picasso.get()
                .load(imageurl)
                .resize(200,200)
                .centerCrop()
                .into(image)
        intentName.text = name2
        intentPhone.text= phone2
        intentEmail.text = email2

//        Toast.makeText(baseContext,name,Toast.LENGTH_LONG).show()
    }
}