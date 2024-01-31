package com.partialhelperapp.app.modules.halamanawalone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.partialhelperapp.app.R
import com.partialhelperapp.app.databinding.RowGridapaitubutawaBinding
import com.partialhelperapp.app.modules.halamanawalone.`data`.model.GridapaitubutawaRowModel
import kotlin.Int
import kotlin.collections.List

class GridapaitubutawaAdapter(
  var list: List<GridapaitubutawaRowModel>
) : RecyclerView.Adapter<GridapaitubutawaAdapter.RowGridapaitubutawaVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridapaitubutawaVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridapaitubutawa,parent,false)
    return RowGridapaitubutawaVH(view)
  }

  override fun onBindViewHolder(holder: RowGridapaitubutawaVH, position: Int) {
    val gridapaitubutawaRowModel = GridapaitubutawaRowModel()
    // TODO uncomment following line after integration with data source
    // val gridapaitubutawaRowModel = list[position]
    holder.binding.gridapaitubutawaRowModel = gridapaitubutawaRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridapaitubutawaRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: GridapaitubutawaRowModel
    ) {
    }
  }

  inner class RowGridapaitubutawaVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridapaitubutawaBinding = RowGridapaitubutawaBinding.bind(itemView)
    init {
      binding.btnPenjelasan.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, GridapaitubutawaRowModel())
      }
    }
  }
}
