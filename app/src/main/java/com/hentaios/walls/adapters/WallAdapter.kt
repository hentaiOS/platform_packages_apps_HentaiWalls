package com.hentaios.walls.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.hentaios.walls.R
import com.hentaios.walls.models.Collection
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.wall_item.*

class WallAdapter(private val context: Context) :
    RecyclerView.Adapter<WallAdapter.WallViewHolder>() {
    private var collectionList: List<Collection> = mutableListOf()


    class WallViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
        LayoutContainer

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = WallViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.wall_item, parent, false
        )
    )

    override fun getItemCount() = collectionList.size

    override fun onBindViewHolder(holder: WallViewHolder, position: Int) {
        val item = collectionList[position]
        val circularProgressDrawable = CircularProgressDrawable(context)
        circularProgressDrawable.strokeWidth = 7f
        circularProgressDrawable.centerRadius = 40f
        circularProgressDrawable.start()
        Glide.with(context).load(item.wallpapers[0].url).placeholder(circularProgressDrawable)
            .into(holder.image)
        holder.collection_name.text = item.name
    }

    fun updateData(newData: List<Collection>) {
        collectionList = newData
        notifyDataSetChanged()
    }
}
