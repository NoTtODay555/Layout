package com.example.napat.layout

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.any_list.view.*

class ItemAdater(val items: ArrayList<String>, val context: Context, private var actionItemClick1: () -> Unit) : RecyclerView.Adapter<ItemAdater.ViewHolder>() {

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }

    // Inflates the item views
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.any_list, parent, false))
    }

    // Binds each animal in the ArrayList to a view
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.onBindData(items[position])
    }

    inner  class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each animal to
        var btlist = view.bt_list

        fun onBindData(str: String) {
            view.apply {
                btlist.text = str
                btlist.setOnClickListener {
                    actionItemClick1.invoke()

                }
            }
        }
    }
}



