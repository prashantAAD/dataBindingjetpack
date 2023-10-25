package www.revengerfitness.blogspot.com.databindingjetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import www.revengerfitness.blogspot.com.databindingjetpack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
      //  binding.quoteText.text="man is made by its belief"
       // binding.quoteAuthor.text="prashant chauhan"

        val quoteObj=Quote("man is made by its belief","prashant chauhan")
        binding.quote=quoteObj

    }
}