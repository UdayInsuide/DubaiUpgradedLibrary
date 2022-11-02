package com.dsf.dubaisdksolution.model

import android.os.Parcel
import android.os.Parcelable

data class PoiDataModel(
    val id: String,
    val appName: String,
    val category: String,
    val description: String,
    val keywords: ArrayList<String>,
    var locations: List<PoiLocation>?,
    val logoUrl: String,
    val nature: String,
    val locationText: String,
    val natureFlight: String,
    val naturePresence: String,
    var audioUrl: String,
    val audioListUrl: List<PoiMedia>?,
    val picUrl: List<PoiMedia>?,
    val videoListUrl: List<PoiMedia>?,
    var poiMultilingual: PoiMultilingual?,
    val subcategory: String,
    val isPartner: Boolean = false,
    var isFavourite: Boolean = false,
    var tripName:String?="",
    var tripArName:String?="",
    var isAudioPlay: Boolean = false,
    var audioCurrentPosition:Int=0,
    var audioDuration:Int=0,
    var nearestPoiId:String,
    var currentlyNearestPoiId:String="",
    var savedaudioCurrentPosition:Int=0,
    var isPoiAlreadySelectedId:String=""


    ) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.createStringArrayList()!!,
        parcel.createTypedArrayList(PoiLocation),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.createTypedArrayList(PoiMedia)!!,
        parcel.createTypedArrayList(PoiMedia)!!,
        parcel.createTypedArrayList(PoiMedia)!!,
        parcel.readParcelable(PoiMultilingual::class.java.classLoader),
        parcel.readString()!!,
        parcel.readByte() != 0.toByte(),
        parcel.readByte() != 0.toByte(),
        parcel.readString(),
        parcel.readString(),
        parcel.readByte() != 0.toByte(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!

        )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(appName)
        parcel.writeString(category)
        parcel.writeString(description)
        parcel.writeStringList(keywords)
        parcel.writeTypedList(locations)
        parcel.writeString(logoUrl)
        parcel.writeString(nature)
        parcel.writeString(locationText)
        parcel.writeString(natureFlight)
        parcel.writeString(naturePresence)
        parcel.writeString(audioUrl)
        parcel.writeTypedList(audioListUrl)
        parcel.writeTypedList(picUrl)
        parcel.writeTypedList(videoListUrl)
        parcel.writeParcelable(poiMultilingual, flags)
        parcel.writeString(subcategory)
        parcel.writeByte(if (isPartner) 1 else 0)
        parcel.writeByte(if (isFavourite) 1 else 0)
        parcel.writeString(tripName)
        parcel.writeString(tripArName)
        parcel.writeByte(if(isAudioPlay) 1 else 0)
        parcel.writeInt(audioCurrentPosition)
        parcel.writeInt(audioDuration)
        parcel.writeString(nearestPoiId)
        parcel.writeString(currentlyNearestPoiId)
        parcel.writeInt(savedaudioCurrentPosition)
        parcel.writeString(isPoiAlreadySelectedId)

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PoiDataModel> {
        override fun createFromParcel(parcel: Parcel): PoiDataModel {
            return PoiDataModel(parcel)
        }

        override fun newArray(size: Int): Array<PoiDataModel?> {
            return arrayOfNulls(size)
        }
    }
}