package com.example.tabactivity

import com.example.tabactivity.Models.Friend

class SampleFriends {
    val LIST_OF_FRIEDS: List<Friend> = listOf(
        Friend("Mohnad Abdalla", R.drawable.avatar_man1, "School", true),
        Friend("Ahmed Ali", R.drawable.avatar_man2, "University", false),
        Friend("Fadwa Fuad", R.drawable.avatar_girl, "Work", true),
        Friend("Ali Ali", R.drawable.avatar_man3, "Work", false),
        Friend("Mohmaed Abdalla", R.drawable.avatar_man4, "School", true),
        Friend("Mai Sami", R.drawable.avatar_girl2, "University", true),
        Friend("Maher Fuad", R.drawable.avatar_man1, "Work", false),
        Friend("sameer Hassan", R.drawable.avatar_man4, "School", true),
        Friend("Aya Yaser", R.drawable.avatar_girl2, "University", true),
        Friend("Freed Kamal", R.drawable.avatar_man1, "Work", false),
        Friend("Sara Yaser", R.drawable.avatar_girl2, "University", true),
        Friend("Izzat Jalal", R.drawable.avatar_man1, "Work", false),
    )

    fun getFavFriends(): List<Friend> {
        var favList: MutableList<Friend> = emptyList<Friend>().toMutableList()
        for (item in LIST_OF_FRIEDS) {
            if (item.fav)
                favList.add(item)
        }

        return favList
    }
}