package com.partialhelperapp.app.modules.halamanawal.`data`.model

import com.partialhelperapp.app.R
import com.partialhelperapp.app.appcomponents.di.MyApp
import kotlin.String

data class HalamanAwalModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_bantuan_warna)

)
