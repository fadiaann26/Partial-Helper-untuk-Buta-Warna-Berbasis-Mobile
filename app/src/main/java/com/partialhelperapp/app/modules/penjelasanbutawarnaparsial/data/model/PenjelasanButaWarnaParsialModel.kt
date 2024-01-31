package com.partialhelperapp.app.modules.penjelasanbutawarnaparsial.`data`.model

import com.partialhelperapp.app.R
import com.partialhelperapp.app.appcomponents.di.MyApp
import kotlin.String

data class PenjelasanButaWarnaParsialModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_apa_itu_buta_w2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_buta_warna_pars)

)
