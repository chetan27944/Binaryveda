package com.android.binaryveda

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class GridAdapter(var context: Context) : RecyclerView.Adapter<GridAdapter.ViewHolder>() {

    var dataList = emptyList<DataModel>()


    internal fun setDataList(dataList: List<DataModel>) {
        this.dataList = dataList
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        init {
            image = itemView.findViewById(R.id.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.list_upload_image, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridAdapter.ViewHolder, position: Int) {
        var data = dataList[position]
        holder.image.setImageResource(data.image)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}