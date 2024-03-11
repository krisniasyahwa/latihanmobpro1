package org.d3if3087.mobpro1.model

import androidx.annotation.DrawableRes
import java.sql.RowId

data class Hewan(
    val nama: String,
    @DrawableRes val imageResId: Int
)
