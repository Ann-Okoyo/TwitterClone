package com.example.twitterclone


import android.view.LayoutInflater
import android.view.SurfaceHolder
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView

class TweetsRvAdapter (var tweetsList: List<TweetData>):RecyclerView.Adapter {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        var binding = TweetListItemBinding.inflate(LayoutInflater.from(parent))
        return TweetsViewHolder(binding)

    }
    override  fun onBindViewHolder(holder: TweetsViewHolder,position:Int)
      var tweet=tweetsList[position]
      holder.binding.tvDispla
}



