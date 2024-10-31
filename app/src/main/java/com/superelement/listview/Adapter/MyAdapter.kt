package com.superelement.listview.Adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.superelement.listview.R
import com.superelement.listview.User

class MyAdapter(private val context:Activity,private val arrayList: ArrayList<User>):ArrayAdapter<User>(context,
          R.layout.list_item,arrayList) {

    @SuppressLint("MissingInflatedId", "InflateParams", "ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater:LayoutInflater=LayoutInflater.from(context)
        val view:View=inflater.inflate(R.layout.list_item,null)

        val imageView:ImageView=view.findViewById(R.id.profile_pic)
        val username:TextView=view.findViewById(R.id.person_name)
        val lastMsg:TextView=view.findViewById(R.id.last_message)
        val lastMsgTime:TextView=view.findViewById(R.id.Msg_time)


        imageView.setImageResource(arrayList[position].imageId)
        username.text=arrayList[position].name
        lastMsg.text=arrayList[position].lastMessage
        lastMsgTime.text=arrayList[position].lastMsgTime




        return super.getView(position, convertView, parent)
    }




}