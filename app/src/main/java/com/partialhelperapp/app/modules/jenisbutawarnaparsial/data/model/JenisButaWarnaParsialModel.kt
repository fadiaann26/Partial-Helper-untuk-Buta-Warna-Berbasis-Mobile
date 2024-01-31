package com.partialhelperapp.app.modules.jenisbutawarnaparsial.`data`.model

import com.partialhelperapp.app.R
import com.partialhelperapp.app.appcomponents.di.MyApp
import kotlin.String

data class JenisButaWarnaParsialModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJenisButaWarn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jenis_buta_warn)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_buta_warna_mera)

)
