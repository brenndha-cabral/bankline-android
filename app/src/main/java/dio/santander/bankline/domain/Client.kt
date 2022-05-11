package dio.santander.bankline.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Client(
    val id: Int
) : Parcelable
