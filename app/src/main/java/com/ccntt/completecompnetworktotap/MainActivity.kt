package com.ccntt.completecompnetworktotap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ccntt.completecompnetworktotap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    val pictCompServWire = listOf<Int>(R.drawable.computer_game_comp_up,R.drawable.computer_game_comp_right,R.drawable.computer_game_comp_down,R.drawable.computer_game_comp_left,
    R.drawable.computer_game_server_up,R.drawable.computer_game_server_right,R.drawable.computer_game_server_down,R.drawable.computer_game_server_left,
    R.drawable.computer_game_wire_up_right,R.drawable.computer_game_wire_down_right,R.drawable.computer_game_wire_down_left,R.drawable.computer_game_wire_up_left,
    R.drawable.computer_game_wire_not_down,R.drawable.computer_game_wire_not_left,R.drawable.computer_game_wire_not_up,R.drawable.computer_game_wire_not_right,
        R.drawable.computer_game_wire_up_down, R.drawable.computer_game_wire_left_right,R.drawable.computer_game_wire_up_down, R.drawable.computer_game_wire_left_right)
    val pictureMatrixComp = mutableListOf<Int>(0,16,8,
    0,4,12,
    12,12,8,
    0,8,0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showAllPictureComp()
        binding.imageView.setOnClickListener { changeDirectionOfPict(0) }
        binding.imageView2.setOnClickListener { changeDirectionOfPict(1) }
        binding.imageView3.setOnClickListener { changeDirectionOfPict(2) }
        binding.imageView4.setOnClickListener { changeDirectionOfPict(3) }
        binding.imageView5.setOnClickListener { changeDirectionOfPict(4) }
        binding.imageView6.setOnClickListener { changeDirectionOfPict(5) }
        binding.imageView7.setOnClickListener { changeDirectionOfPict(6) }
        binding.imageView8.setOnClickListener { changeDirectionOfPict(7) }
        binding.imageView9.setOnClickListener { changeDirectionOfPict(8) }
        binding.imageView10.setOnClickListener { changeDirectionOfPict(9) }
        binding.imageView11.setOnClickListener { changeDirectionOfPict(10) }
        binding.imageView12.setOnClickListener { changeDirectionOfPict(11) }


    }
    fun showAllPictureComp(){
        binding.imageView.setImageResource(pictCompServWire[pictureMatrixComp[0]])
        binding.imageView2.setImageResource(pictCompServWire[pictureMatrixComp[1]])
        binding.imageView3.setImageResource(pictCompServWire[pictureMatrixComp[2]])
        binding.imageView4.setImageResource(pictCompServWire[pictureMatrixComp[3]])
        binding.imageView5.setImageResource(pictCompServWire[pictureMatrixComp[4]])
        binding.imageView6.setImageResource(pictCompServWire[pictureMatrixComp[5]])
        binding.imageView7.setImageResource(pictCompServWire[pictureMatrixComp[6]])
        binding.imageView8.setImageResource(pictCompServWire[pictureMatrixComp[7]])
        binding.imageView9.setImageResource(pictCompServWire[pictureMatrixComp[8]])
        binding.imageView10.setImageResource(pictCompServWire[pictureMatrixComp[9]])
        binding.imageView11.setImageResource(pictCompServWire[pictureMatrixComp[10]])
        binding.imageView12.setImageResource(pictCompServWire[pictureMatrixComp[11]])
    }
    fun changeDirectionOfPict(num:Int){
        pictureMatrixComp[num] += 1
        if ((pictureMatrixComp[num] % 4) == 0) {pictureMatrixComp[num] -= 4}
        showAllPictureComp()
    }


}