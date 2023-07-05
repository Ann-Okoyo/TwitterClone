package com.example.twitterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBind
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
fun displayTweets(){
    var tweet1 =TweetData("Hello world","Ann Muyale","Wakahia","Mobile developer",71,405,890)
    var tweet2 =TweetData("Hello world","Ann Muyale","Wakahia","Mobile developer",71,405,890)
    var tweet3 =TweetData("Hello world","Ann Muyale","Wakahia","Mobile developer",71,405,890)
    var tweet4=TweetData("Hello world","Ann Muyale","Wakahia","Mobile developer",71,405,890)
    var tweetList= listOf<TweetData>(tweet1,tweet2,tweet3,tweet4)
    binding.rvTweets.layoutManager=LinearLayoutManager
    var tweetsRvAdapter=tweetsrvAdapter(tweetList)
    binding.rvTweets


}

