package com.example.practica1listview.ui.games


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practica1listview.GameDetails
import com.example.practica1listview.adaptador.GamesAdapter
import com.example.practica1listview.data.DataGames
import com.example.practica1listview.databinding.FragmentGamesBinding
import com.example.practica1listview.model.Games


//  class GamesFragment : Fragment(), GamesAdapter.OnItemListener{
class GamesFragment : Fragment(), GamesAdapter.OnItemListener {

    private lateinit var binding: FragmentGamesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGamesBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Get the data
        val data = DataGames(requireContext()).getGames()
        val adapterGames = GamesAdapter(requireContext(), data,this)
        with(binding){
            val lm = LinearLayoutManager(requireContext())
            rvGames.addItemDecoration(DividerItemDecoration(requireContext(),lm.orientation))
            rvGames.layoutManager = lm
            rvGames.adapter = adapterGames
        }

    }

    override fun clickGames(games: Games) {
        //Toast.makeText(requireContext(), "Games: ${games.title}", Toast.LENGTH_SHORT).show()
        val intent = Intent(activity, GameDetails::class.java)
        intent.putExtra("id", games.id)
        startActivity(intent)
    }


}