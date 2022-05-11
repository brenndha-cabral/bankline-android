package dio.santander.bankline.ui.statement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dio.santander.bankline.R
import dio.santander.bankline.databinding.ActivityStatementBinding
import dio.santander.bankline.databinding.ActivityWelcomeBinding
import dio.santander.bankline.domain.Client
import java.lang.IllegalArgumentException

class StatementActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_ACCOUNT_HOLDER = "dio.santander.bankline.ui.statement.EXTRA_ACCOUNT_HOLDER"
    }

    private val binding by lazy {
        ActivityStatementBinding.inflate(layoutInflater)
    }

    private val accountHolder by lazy {
        intent.getParcelableExtra<Client>(EXTRA_ACCOUNT_HOLDER) ?: throw IllegalArgumentException()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}