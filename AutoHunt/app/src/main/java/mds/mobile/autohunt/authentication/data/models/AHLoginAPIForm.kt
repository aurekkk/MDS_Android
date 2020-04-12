package mds.mobile.autohunt.authentication.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AHLoginAPIForm(
    @SerializedName("email")
    @Expose val email: String,

    @SerializedName("password")
    @Expose val password: String
)