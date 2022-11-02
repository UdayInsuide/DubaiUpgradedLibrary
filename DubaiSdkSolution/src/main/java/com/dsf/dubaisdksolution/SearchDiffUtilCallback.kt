package com.dsf.dubaisdksolution

import androidx.recyclerview.widget.DiffUtil
import com.dsf.dubaisdksolution.model.PoiDataModel

/**
 * Created by Furqan on 22-03-2018.
 */
class SearchDiffUtilCallback : DiffUtil.ItemCallback<PoiDataModel>() {
    override fun areItemsTheSame(oldItem: PoiDataModel, newItem: PoiDataModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: PoiDataModel, newItem: PoiDataModel): Boolean {
        return oldItem.poiMultilingual?.en == newItem.poiMultilingual?.en
    }

/* override fun areItemsTheSame(oldItem: NlpChatModel, newItem: NlpChatModel): Boolean {
        return oldItem.hashCode() == newItem.hashCode()
    }

    override fun areContentsTheSame(oldItem: NlpChatModel, newItem: NlpChatModel): Boolean {
        return oldItem.msg == newItem.msg
    }*/
}