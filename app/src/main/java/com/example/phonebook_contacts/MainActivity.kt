package com.example.phonebook_contacts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
            Contacts("Babra Koskei","+254711234567","babrakoskei@gmail.com","https://cdn.pixabay.com/photo/2016/01/19/17/48/woman-1149911__340.jpg"),
            Contacts("Anyijukire Janet","+254711234567","anyijukirejanet@gmail.com","https://cdn.pixabay.com/photo/2018/07/21/03/55/girl-3551832__340.jpg"),
            Contacts("Esther Ayebaza","+254711234567","estherayebaza@gmail.com","https://cdn.pixabay.com/photo/2016/03/23/04/01/woman-1274056__340.jpg"),
            Contacts("Geraldine Kabatesi","+254711234567","geraldinekabatesi@gmail.com","https://cdn.pixabay.com/photo/2015/03/03/08/55/portrait-657116__340.jpg"),
            Contacts("Catherine Wanjiku","+254711234567","catherinewanjiku@gmail.com","https://cdn.pixabay.com/photo/2015/05/31/13/45/young-woman-791849__340.jpg"),
            Contacts("Irene Nyatichi","+254711234567","irenenyatichi@gmail.com","https://cdn.pixabay.com/photo/2015/01/12/10/44/woman-597173__340.jpg"),
            Contacts("Jane Kamau","+254711234567","janekamau@gmail.com","https://cdn.pixabay.com/photo/2016/11/29/06/46/adult-1867889__340.jpg"),
            Contacts("Promise Nuwa","+254711234567","promise@gmail.com","https://cdn.pixabay.com/photo/2017/05/31/04/59/girl-2359121__340.jpg"),
            Contacts("Grace Waceke ","+254711234567","gracewaceke@gmail.com","https://cdn.pixabay.com/photo/2017/01/20/18/25/woman-1995624__340.jpg"),
            Contacts("Constant Kavaya","+254711234567","constantkavaya@gmail.com","https://cdn.pixabay.com/photo/2013/03/27/12/21/woman-97088__340.jpg"),
            Contacts("Michelle Mbaitsa","+254711234567","michellembaitsa@gmail.com","https://cdn.pixabay.com/photo/2018/03/01/14/57/portrait-3190849__340.jpg")
        )
        rvContacts = findViewById(R.id.rvContacts)
//        rvContacts.layoutManager=LinearLayoutManager(baseContext)
        var contactsAdapter =
                ContactsAdapter(contactList = contactList, context = baseContext)
        val apply = rvContacts.apply {
            layoutManager = LinearLayoutManager(baseContext)
            rvContacts.adapter = contactsAdapter
        }
    }
}