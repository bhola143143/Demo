package com.example.demo210423

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demo210423.databinding.ListDataBinding


class ListAdapter(private val mList: List<Data>) :
    RecyclerView.Adapter<ListAdapter.ViewHolder>() {
    private lateinit var nListBinding: ListDataBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        nListBinding =
            ListDataBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(nListBinding.root)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemDetail = mList[position]
        nListBinding.model = itemDetail
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
    }
}