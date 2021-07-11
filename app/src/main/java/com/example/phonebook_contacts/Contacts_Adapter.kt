package com.example.phonebook_contacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class Contacts_Adapter(var contactList:List<Contacts>):RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.contacts_item_list,parent,false)
        return ContactsViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact = contactList.get(position)
        holder.etName1.text = currentContact.contactsname
        holder.etphone1.text = currentContact.contactphone
        holder.etEmail1.text = currentContact.contactemail
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

}
class ContactsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var etName1 = itemView.findViewById<TextView> (R.id.etName1)
        var etphone1 = itemView.findViewById<TextView> (R.id.etPhone1)
        var etEmail1= itemView.findViewById<TextView> (R.id.etEmail1)


}