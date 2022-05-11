package dio.santander.bankline.ui.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dio.santander.bankline.R
import dio.santander.bankline.databinding.ActivityWelcomeBinding
import dio.santander.bankline.domain.Client
import dio.santander.bankline.ui.statement.StatementActivity

class WelcomeActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityWelcomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnContinue.setOnClickListener {
            val accountHolderId = binding.editAccountHolderId.text.toString().toInt()
            val accountHolder = Client(accountHolderId)

            val intent = Intent(this, StatementActivity::class.java).apply {
                putExtra(StatementActivity.EXTRA_ACCOUNT_HOLDER, accountHolder)
            }
            startActivity(intent)
        }
    }
}