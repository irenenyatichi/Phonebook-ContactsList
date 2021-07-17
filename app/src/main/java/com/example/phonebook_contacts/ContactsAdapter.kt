package com.example.phonebook_contacts


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactsAdapter(var contactList: List<Contacts>,var context:Context):RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.contacts_item_list,parent,false)
        return ContactsViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact = contactList.get(position)
//        This should be tv instead of et
        holder.tvName1.text = currentContact.contactsname
        holder.tvPhone1.text = currentContact.contactphone
        holder.tvEmail1.text = currentContact.contactemail
        holder.cvContacts.setOnClickListener {
            var intent = Intent(context, contactDetailsActivity::class.java)
            intent.putExtra("name",currentContact.contactsname)
            intent.putExtra("phone",currentContact.contactphone)
            intent.putExtra("email",currentContact.contactemail)
            intent.putExtra("image",currentContact.imageUrl)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        }

//        6 you are telling picasso to get the images, load them and add them into the id Contact
        Picasso.get()
                .load(currentContact.imageUrl)
//                8 To resize and give the images a square shape
                .resize(80,80)
                .centerCrop()
                .into(holder.ivContact)

//        holder.cvContacts.setOnClickListener {
//            val intent=Intent()
//            Toast.makeText(context,"You have clicked on my face",Toast.LENGTH_LONG)
//        }
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

}
class ContactsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var tvName1 = itemView.findViewById<TextView> (R.id.tvname1)
        var tvPhone1 = itemView.findViewById<TextView> (R.id.tvphone1)
        var tvEmail1= itemView.findViewById<TextView> (R.id.tvemail1)
//    5
        var ivContact = itemView.findViewById<ImageView>(R.id.ivContact)
//    10
        var cvContacts = itemView.findViewById<CardView>(R.id.cvContact)


}