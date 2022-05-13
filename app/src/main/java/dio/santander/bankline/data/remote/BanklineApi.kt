package dio.santander.bankline.data.remote

import dio.santander.bankline.domain.Transaction
import retrofit2.http.GET
import retrofit2.http.Path

interface BanklineApi {
    @GET("transactions/{idAccount}")
    suspend fun findStatement(@Path("idAccount") accountHolderId: Int): List<Transaction>
}