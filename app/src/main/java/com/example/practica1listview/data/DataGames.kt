package com.example.practica1listview.data

import android.content.Context
import com.example.practica1listview.model.Games


class DataGames(context: Context?) {

    val context = context

    fun getGames(): ArrayList<Games> {

    val tmpArrayList = ArrayList<Games>()


        val games1 = Games(
            1,
            "Blue Protocol  PC",
            "Project Sky Blue es el estudio responsable de este videojuego de rol multijugador producido por Bandai Namco. El título nos invita a sumergirnos en el planeta de Regnus, que otrora fue gobernado por una tribu divina. Sin embargo, nuestra historia se contextualiza milenios después...",
            "MMORPG",
            "Abril 2022"
        )
        tmpArrayList.add(games1)

        val games2 = Games(
            2,
            "Beyond Good & Evil 2  PC PS4 XBOne",
            "Beyond Good & Evil 2 es un videojuego de acción y aventura en tercera persona desarrollado y producido por Ubisoft para las plataformas de PC, PS4 y Xbox One...",
            "Aventura de acción / Mundo abierto",
            "Enero 2022"
        )
        tmpArrayList.add(games2)

        val games3 = Games(
            3,
            "Star Citizen  PC",
            "Star Citizen es un videojuego de simulación espacial para PC, aunque se desconoce si saldrá en PS4 o Xbox...",
            "Acción / Simulador espacial",
            "Septiembre, 2022"
        )
        tmpArrayList.add(games3)

        val games4 = Games(
            4,
            "Dead Island 2  PC PS4 XBOne",
            "Dead Island 2 es un videojuego de acción y rol en primera persona ambientado en un mundo abierto infestado de Zombis. ...",
            "Survival Horror / Zombis",
            "Marzo, 2022"
        )
        tmpArrayList.add(games4)

        val games5 = Games(
            5,
            "The Legend of Zelda: Breath of the Wild 2  Switch",
            "The Legend of Zelda: Breath of the Wild 2 es la segunda parte de Breath of the Wild, el título que revolucionó los mundos abiertos y el concepto de la saga Zelda en Nintendo Switch y Wii U....",
            "Aventura de acción / Mundo abierto",
            "Agosto, 2022"
        )
        tmpArrayList.add(games5)

        val games6 = Games(
            6,
            "Metroid Prime 4  Switch",
            "Metroid Prime 4, cuarta entrega de la saga Prime protagonizada por Samus Aran que salió en GameCube, Wii y Wii U a lo largo...",
            "Metroidvania / Shooter en primera persona",
            "Noviembre, 2022"
        )
        tmpArrayList.add(games6)

        val games7 = Games(
            7,
            "Granblue Fantasy: Relink  PC PS4 PS5",
            "Granblue Fantasy: Relink es un juego de rol y acción desarrollado por Cygames Osaka, que nos trasladará a un mundo abierto...",
            "Action-RPG",
            "Diciembre, 2022"
        )
        tmpArrayList.add(games7)

        val games8 = Games(
            8,
            "Bayonetta 3  Switch",
            "Bayonetta 3 es la tercera entrega, programada y desarrollada por PlatinumGames, de la famosa saga de hack and slash...",
            "Acción / Hack and Slash",
            "Mayo, 2022"
        )
        tmpArrayList.add(games8)



        return tmpArrayList
    }

    fun getGames( id: Int ): ArrayList<Games>
    {
        val allGames = getGames()

        val filteredGames = ArrayList<Games>()

        allGames.forEach { game ->
            if (game.id == id) {
                filteredGames.add(game)
            }
        }
        return filteredGames
    }

}
