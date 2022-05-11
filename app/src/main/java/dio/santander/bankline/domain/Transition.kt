package dio.santander.bankline.domain

data class Transition(
    val id: Int,
    val dateHour: String,
    val value: Double,
    val description: String,
    val type: TypeTransition,
    // TODO map idAccount -> idClient
    val idClient: Int
)
