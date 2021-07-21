package com.example.framedata2.data

import com.example.framedata2.R
import com.example.framedata2.model.Character

class Datasource {

    fun loadCharacters():List<Character>{
        return listOf<Character>(
            Character(R.string.anji, R.drawable.anji),
            Character(R.string.axl, R.drawable.axl),
            Character(R.string.chipp, R.drawable.chipp),
            Character(R.string.faust, R.drawable.faust),
            Character(R.string.gio, R.drawable.gio),
            Character(R.string.ino, R.drawable.ino),
            Character(R.string.ky, R.drawable.ky),
            Character(R.string.leo, R.drawable.leo),
            Character(R.string.may, R.drawable.may),
            Character(R.string.millia, R.drawable.millia),
            Character(R.string.nago, R.drawable.nago),
            Character(R.string.pot, R.drawable.pot),
            Character(R.string.ram, R.drawable.ram),
            Character(R.string.sol, R.drawable.sol),
            Character(R.string.zato, R.drawable.zato),
        )


    }
}