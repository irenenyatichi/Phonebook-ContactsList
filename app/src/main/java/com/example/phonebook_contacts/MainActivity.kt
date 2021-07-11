package com.example.phonebook_contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContacts:RecyclerView
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            display()
    }
    fun display(){
        var contactList= listOf(
            Contacts("Babra Koskei","+254711234567","babrakoskei@gmail.com"),
            Contacts("Anyijukire Janet","+254711234567","anyijukirejanet@gmail.com"),
            Contacts("Esther Ayebaza","+254711234567","estherayebaza@gmail.com"),
            Contacts("Geraldine Kabatesi","+254711234567","geraldinekabatesi@gmail.com"),
            Contacts("Catherine Wanjiku","+254711234567","catherinewanjiku@gmail.com"),
            Contacts("Irene Nyatichi","+254711234567","irenenyatichi@gmail.com"),
            Contacts("Jane Kamau","+254711234567","janekamau@gmail.com"),
            Contacts("Promise","+254711234567","promise@gmail.com"),
            Contacts("Grace Waceke ","+254711234567","gracewaceke@gmail.com"),
            Contacts("Constant Kavaya","+254711234567","constantkavaya@gmail.com"),
            Contacts("Michelle Mbaitsa","+254711234567","michellembaitsa@gmail.com")
        )
        rvContacts = findViewById(R.id.rvContacts)
        var Contacts_Adapter = Contacts_Adapter(contactList)
        rvContacts.layoutManager=LinearLayoutManager(baseContext)
        rvContacts.adapter=Contacts_Adapter
    }
}