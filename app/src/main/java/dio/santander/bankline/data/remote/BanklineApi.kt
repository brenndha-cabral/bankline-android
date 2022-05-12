package dio.santander.bankline.data.remote

import dio.santander.bankline.domain.Transition
import retrofit2.http.GET
import retrofit2.http.Path

interface BanklineApi {
    @GET("transitions/{idAccount}")
    suspend fun findStatement(@Path("idAccount") accountHolderId: Int): List<Transition>
}