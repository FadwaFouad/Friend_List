package com.example.tabactivity.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tabactivity.Adapter.FriendAdapter
import com.example.tabactivity.Models.Friend
import com.example.tabactivity.R
import com.example.tabactivity.SampleFriends

class FavoritesFragment : Fragment() {
    private lateinit var recycleView : RecyclerView
    var sampleFriends = SampleFriends()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_favorites, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val friendsList : List<Friend> = sampleFriends.getFavFriends()
        recycleView= view.findViewById(R.id.friends_list)
        recycleView.layoutManager = LinearLayoutManager (requireContext())
        recycleView.adapter = FriendAdapter (requireContext(), friendsList)
    }
}
