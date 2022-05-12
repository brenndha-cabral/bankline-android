package dio.santander.bankline.ui.statement

import androidx.lifecycle.ViewModel
import dio.santander.bankline.data.BanklineRepository

class StatementViewModel : ViewModel() {
    fun findStatement(accountHolderId: Int) =
        BanklineRepository.findStatement(accountHolderId)
}