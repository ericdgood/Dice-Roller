package example.pia.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private var randomRoll: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRoll.setOnClickListener {
            rollDice()
        Toast.makeText(this, "You rolled a $randomRoll /n Try again", Toast.LENGTH_SHORT).show()}
    }

     private fun rollDice() {
     randomRoll = (Random().nextInt(6) + 1)

         val diceImage =  when(randomRoll){
             1 -> R.drawable.dice_1
             2 -> R.drawable.dice_2
             3 -> R.drawable.dice_3
             4 -> R.drawable.dice_4
             5 -> R.drawable.dice_5
             else -> R.drawable.dice_6
         }

         imgDice.setImageResource(diceImage)
     }
}
