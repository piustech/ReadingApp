package com.example.books.mybookview

import com.example.books.R

class BookSource {
    fun loadBookClass(): List<BookClass>{
        return listOf(
            BookClass(R.drawable.seven_husbands, R.string.title1, R.string.detail1, R.string.author1),
            BookClass(R.drawable.hunger_games, R.string.title2, R.string.detail2, R.string.author2),
            BookClass(R.drawable.ends_with_us, R.string.title3, R.string.detail3, R.string.author3),
            BookClass(R.drawable.love_hypothesis, R.string.title4,  R.string.detail4, R.string.author4),
            BookClass(R.drawable.spanish_love, R.string.title5, R.string.detail5, R.string.author5),
            BookClass(R.drawable.unhoneymooners, R.string.title6, R.string.detail6, R.string.author6),
            BookClass(R.drawable.hating_game, R.string.title7, R.string.detail7, R.string.author7),
            BookClass(R.drawable.ugly_love,  R.string.title8, R.string.detail8, R.string.author8),
            BookClass(R.drawable.heartless,  R.string.title9, R.string.detail9, R.string.author9),
            BookClass(R.drawable.shatter_me,  R.string.title10, R.string.detail10, R.string.author10),
            BookClass(R.drawable.inheritance_games, R.string.title11,  R.string.detail11, R.string.author11),
            BookClass(R.drawable.daughter,  R.string.title12, R.string.detail12, R.string.author12),
            BookClass(R.drawable.midnight_library, R.string.title13,  R.string.detail13, R.string.author13),
            BookClass(R.drawable.good_as_dead, R.string.title14,  R.string.detail14, R.string.author14),
            BookClass(R.drawable.cruel_prince,  R.string.title15, R.string.detail15, R.string.author15),
            BookClass(R.drawable.acotar,  R.string.title16, R.string.detail16, R.string.author16),
            BookClass(R.drawable.bright_places, R.string.title17,  R.string.detail17, R.string.author17),
            BookClass(R.drawable.ugly_cry, R.string.title18,  R.string.detail18, R.string.author18),
            BookClass(R.drawable.die, R.string.title19,  R.string.detail19, R.string.author19),
            BookClass(R.drawable.she_gone, R.string.title20,  R.string.detail20, R.string.author20)
        )
    }
}