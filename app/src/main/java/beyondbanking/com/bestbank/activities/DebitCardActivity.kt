package beyondbanking.com.bestbank.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import beyondbanking.com.bestbank.R

class DebitCardActivity : AppCompatActivity() {

    companion object {
        fun getStartIntent(context: Context) : Intent {
            val intent : Intent = Intent(context, DebitCardActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.debit_card_activity)
    }
}