package com.partialhelperapp.app.modules.pengobatanbutawarnaparsial.`data`.model

import com.partialhelperapp.app.R
import com.partialhelperapp.app.appcomponents.di.MyApp
import kotlin.String

data class PengobatanButaWarnaParsialModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPengobatanButa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pengobatan_but)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hingga_saat_ini)

)
