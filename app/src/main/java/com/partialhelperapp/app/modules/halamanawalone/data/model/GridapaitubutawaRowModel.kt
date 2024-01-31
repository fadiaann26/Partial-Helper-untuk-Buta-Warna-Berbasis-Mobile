package com.partialhelperapp.app.modules.halamanawalone.`data`.model

import com.partialhelperapp.app.R
import com.partialhelperapp.app.appcomponents.di.MyApp
import kotlin.String

data class GridapaitubutawaRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtApaituButaWa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_apa_itu_buta_w)

)
