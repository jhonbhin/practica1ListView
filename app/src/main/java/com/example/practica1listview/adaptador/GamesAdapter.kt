package com.example.practica1listview.adaptador

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import com.example.practica1listview.R
import com.example.practica1listview.databinding.GameElementBinding
import com.example.practica1listview.model.Games


class GamesAdapter(private val context: Context, val games: ArrayList<Games>, val onItemListener: OnItemListener) : RecyclerView.Adapter<GamesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GamesAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = GameElementBinding.inflate(layoutInflater)
        return ViewHolder(binding,onItemListener)
    }

    override fun onBindViewHolder(holder: GamesAdapter.ViewHolder, position: Int) {
        holder.bindData(games[position])
    }

    override fun getItemCount(): Int {
        return games.size
    }

    interface OnItemListener {
        fun clickGames(games: Games)
    }

    class ViewHolder(binding: GameElementBinding, onItemListener: OnItemListener) : RecyclerView.ViewHolder(binding.root), View.OnClickListener {
        private val binding = binding
        private val onItemListener = onItemListener
        private lateinit var games: Games

        init {
            binding.root.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            onItemListener.clickGames(games)
        }

        fun bindData(item: Games){
            with(binding)
            {
               when(item.id) {
                    1 -> ivItem.setImageResource(R.drawable.pc1)
                    2 -> ivItem.setImageResource(R.drawable.pc2)
                    3 -> ivItem.setImageResource(R.drawable.pc3)
                    4 -> ivItem.setImageResource(R.drawable.pc4)
                    5 -> ivItem.setImageResource(R.drawable.pc5)
                    6 -> ivItem.setImageResource(R.drawable.pc6)
                    7 -> ivItem.setImageResource(R.drawable.pc7)
                    8 -> ivItem.setImageResource(R.drawable.pc8)
                }
                //ivItem.setImageResource(R.drawable.demo)
                tvItemTitle.text = item.title+item.id
                tvItemDescription.text = item.description
                tvItemDate.text = item.date
            }

            games = item
        }



    }
}