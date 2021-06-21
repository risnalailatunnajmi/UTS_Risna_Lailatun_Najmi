package com.example.uts_risna_lailatun_najmi

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Nabi(
    val img_photo:Int,
    val tv_name: String,
    val tv_detail: String
) : Parcelable
