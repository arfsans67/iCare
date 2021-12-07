package com.arfsans.icare.data.response

import com.arfsans.icare.data.model.ModelResults
import com.google.gson.annotations.SerializedName

class ModelResultNearby {

    @SerializedName("results")
    val modelResults: List<ModelResults> = emptyList()
}