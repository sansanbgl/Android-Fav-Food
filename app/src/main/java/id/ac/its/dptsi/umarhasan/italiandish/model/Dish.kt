package id.ac.its.dptsi.umarhasan.italiandish.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Dish (
    var name: String = "",
    var from: String = "",
    var photo: String = "",
    var desc: String = "",
    var related: String = "",
    var misc: String = ""
    ):Parcelable