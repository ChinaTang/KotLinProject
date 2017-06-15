package com.example.administrator.kotlinproject.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.administrator.kotlinproject.R

/**
 * Created by Administrator on 2017/6/15.
 */

class ForecastListAdapter(val srcList: List<String>): RecyclerView.Adapter<ForecastListAdapter.ViewHolder>(){

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int = srcList.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class ViewHolder(val mView: View): RecyclerView.ViewHolder(mView){

        val mTextView: TextView

        init {
            mTextView = mView.findViewById(R.id.recycle_view)as TextView;
        }
    }

}
