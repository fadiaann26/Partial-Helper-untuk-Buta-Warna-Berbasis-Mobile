package com.partialhelperapp.app.modules.penyebabbutawarnaparsial.`data`.model

import com.partialhelperapp.app.R
import com.partialhelperapp.app.appcomponents.di.MyApp
import kotlin.String

data class PenyebabButaWarnaParsialModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPenyebabButaW: String? =
      MyApp.getInstance().resources.getString(R.string.msg_penyebab_buta2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_penyakit_kronis)

)
