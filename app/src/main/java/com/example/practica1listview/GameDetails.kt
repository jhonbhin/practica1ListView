package com.example.practica1listview

import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

import androidx.appcompat.app.AppCompatActivity
import com.example.practica1listview.data.DataGames
import com.example.practica1listview.databinding.ActivityGamesDetailsBinding
import com.example.practica1listview.model.Games

class GameDetails : AppCompatActivity() {
    private lateinit var binding: ActivityGamesDetailsBinding
    var id: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGamesDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        if(savedInstanceState == null)
        {
            val bundle = intent.extras
            if( bundle != null ){
                id = bundle.getInt("id" , 0)
            }
            else {
                id = savedInstanceState?.getSerializable("id") as Int
            }
        }

        val games: ArrayList<Games> = DataGames(applicationContext).getGames(id)

        with(binding)
        {
            when(games[0].id){
                1 -> {
                    ivMovie.setImageResource(R.drawable.pc1)
                    ivThumbMovie.setImageResource(R.drawable.pc1)
                    val v1 = findViewById<VideoView>(R.id.vvItem)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.trailer1)
                    val mc: MediaController = MediaController(this@GameDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }
                2 -> {
                    ivMovie.setImageResource(R.drawable.pc2)
                    ivThumbMovie.setImageResource(R.drawable.pc2)
                    val v1 = findViewById<VideoView>(R.id.vvItem)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.trailer2)
                    val mc: MediaController = MediaController(this@GameDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }
                3 -> {
                    ivMovie.setImageResource(R.drawable.pc1)
                    ivThumbMovie.setImageResource(R.drawable.pc1)
                    val v1 = findViewById<VideoView>(R.id.vvItem)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.trailer1)
                    val mc: MediaController = MediaController(this@GameDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)

                }
                4 -> {
                    ivMovie.setImageResource(R.drawable.pc2)
                    ivThumbMovie.setImageResource(R.drawable.pc2)
                    val v1 = findViewById<VideoView>(R.id.vvItem)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.trailer2)
                    val mc: MediaController = MediaController(this@GameDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }
                5 -> {
                    ivMovie.setImageResource(R.drawable.pc1)
                    ivThumbMovie.setImageResource(R.drawable.pc1)
                    val v1 = findViewById<VideoView>(R.id.vvItem)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.trailer1)
                    val mc: MediaController = MediaController(this@GameDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }
                6 -> {
                    ivMovie.setImageResource(R.drawable.pc2)
                    ivThumbMovie.setImageResource(R.drawable.pc2)
                    val v1 = findViewById<VideoView>(R.id.vvItem)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.trailer2)
                    val mc: MediaController = MediaController(this@GameDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }
                7 -> {
                    ivMovie.setImageResource(R.drawable.pc1)
                    ivThumbMovie.setImageResource(R.drawable.pc1)
                    val v1 = findViewById<VideoView>(R.id.vvItem)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.trailer1)
                    val mc: MediaController = MediaController(this@GameDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }
                8 -> {
                    ivMovie.setImageResource(R.drawable.pc2)
                    ivThumbMovie.setImageResource(R.drawable.pc2)
                    val v1 = findViewById<VideoView>(R.id.vvItem)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.trailer2)
                    val mc: MediaController = MediaController(this@GameDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }

            }
            tvTitle.text = games[0].title
            tvDate.text = games[0].date
            tvDescription.text = games[0].description
            tvGenero.text = games[0].genero
        }
    }


}
