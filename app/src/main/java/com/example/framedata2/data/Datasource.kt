package com.example.framedata2.data

import com.example.framedata2.R
import com.example.framedata2.model.Character

class Datasource {

    fun loadCharacters():List<Character>{
        return listOf<Character>(
            Character(R.string.anji),
            Character(R.string.axl),
            Character(R.string.chipp),
            Character(R.string.faust),
            Character(R.string.gio),
            Character(R.string.ino),
            Character(R.string.ky),
            Character(R.string.leo),
            Character(R.string.may),
            Character(R.string.millia),
            Character(R.string.nago),
            Character(R.string.pot),
            Character(R.string.ram),
            Character(R.string.sol),
            Character(R.string.zato),
        )


    }
}