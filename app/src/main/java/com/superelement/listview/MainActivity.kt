package com.superelement.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.superelement.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var userArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId= intArrayOf(
            R.drawable.captain,R.drawable.hulk,R.drawable.marvel,R.drawable.tony,R.drawable.spidey,R.drawable.scarlet,R.drawable.thor
        )
        val name= arrayOf(
            "Captain","Hulk","Marvel","Tony","Spidey","Scarlet","Thor"
        )
        val lastMessage= arrayOf(
            "Avengers Assemble","Whats Going","How are you","I am Iron Man","Lets Go","Hey Tony...","Am God of Thunder"
        )
        val lastMsgTime= arrayOf(
            "8:00 pm","9:25 pm","11:30 am","8:00 am","9:25 am","10:00 am","12.30 pm"
        )






    }
}