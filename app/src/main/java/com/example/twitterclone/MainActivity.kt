package com.example.twitterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.twitterclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        displayTweets()
    }

    private fun displayTweets() {
        val tweet1 = TweetData("Pau", "Ann", "@popo", "i love memes", 12, 23, 4)
        val tweet2 = TweetData("Nora", "Charles", "@nia", "i love travelling all over Kenya", 12, 23, 212)
        val tweet3 = TweetData("Mike", "Michael", "@mmike", "coding might be hard but it's really fun", 12, 23, 42)
        val tweet4 = TweetData("Sam", "Samael", "@saml", "The largest organ in the body is the skin", 12, 23, 482)
        val tweet5 = TweetData("Pau", "Ann", "@popo", "i love memes", 12, 23, 4)
        val tweet6 = TweetData("Nora", "Norani", "@nia", "i love travelling all over Kenya", 12, 23, 212)
        val tweet7 = TweetData("Mike", "Michael", "@mmike", "coding might be hard but it's really fun", 12, 23, 42)
        val tweet8 = TweetData("Sam", "Samael", "@saml", "The largest organ in the body is the skin", 12, 23, 482)
        val tweet9 = TweetData("Pau", "Ann", "@popo", "i love memes", 12, 23, 4)
        val tweet10 = TweetData("Nora", "Norani", "@nia", "i love travelling all over Kenya", 12, 23, 212)
        val tweet11 = TweetData("Mike", "Michael", "@mmike", "coding might be hard but it's really fun", 12, 23, 42)
        val tweet12 = TweetData("Sam", "Samael", "@saml", "The largest organ in the body is the skin", 12, 23, 482)

        val tweetLists = listOf(tweet1, tweet2, tweet3, tweet4, tweet5, tweet6, tweet7, tweet8, tweet9, tweet10, tweet11, tweet12)

        binding.rvTweets.layoutManager = LinearLayoutManager(this)
        val adapterTweets = TwitterRVAdapter(tweetLists)
        binding.rvTweets.adapter = adapterTweets
    }
}