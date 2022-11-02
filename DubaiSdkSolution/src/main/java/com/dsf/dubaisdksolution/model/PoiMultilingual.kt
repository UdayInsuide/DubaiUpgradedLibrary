package com.dsf.dubaisdksolution.model

import android.os.Parcel
import android.os.Parcelable

data class PoiMultilingual(
    val ar: Locale?,
    val en: Locale,
    val zh: Locale?

) : Parcelable {

    val arabic: Locale
        get() = ar ?: en
    val chinese: Locale
        get() = zh ?: en

    constructor(parcel: Parcel) : this(
        parcel.readParcelable(Locale::class.java.classLoader)!!,
        parcel.readParcelable(Locale::class.java.classLoader)!!,
        parcel.readParcelable(Locale::class.java.classLoader)!!

    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeParcelable(ar, flags)
        parcel.writeParcelable(en, flags)
        parcel.writeParcelable(zh, flags)

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PoiMultilingual> {
        override fun createFromParcel(parcel: Parcel): PoiMultilingual {
            return PoiMultilingual(parcel)
        }

        override fun newArray(size: Int): Array<PoiMultilingual?> {
            return arrayOfNulls(size)
        }
    }
}

data class Locale(
    var name: String? = null,
    var description: String? = null
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(description)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Locale> {
        override fun createFromParcel(parcel: Parcel): Locale {
            return Locale(parcel)
        }

        override fun newArray(size: Int): Array<Locale?> {
            return arrayOfNulls(size)
        }
    }
}