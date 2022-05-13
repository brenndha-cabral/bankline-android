package dio.santander.bankline.domain

data class Transaction(
    val id: Int,
    val dateHour: String,
    val value: Double,
    val description: String,
    val type: TypeTransaction,
    // TODO map idAccount -> idClient
    val idClient: Int
)
