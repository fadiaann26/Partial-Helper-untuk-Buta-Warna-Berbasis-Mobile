package com.partialhelperapp.app.modules.penyebabbutawarnaparsial.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.partialhelperapp.app.modules.penyebabbutawarnaparsial.`data`.model.PenyebabButaWarnaParsialModel
import org.koin.core.KoinComponent

class PenyebabButaWarnaParsialVM : ViewModel(), KoinComponent {
  val penyebabButaWarnaParsialModel: MutableLiveData<PenyebabButaWarnaParsialModel> =
      MutableLiveData(PenyebabButaWarnaParsialModel())

  var navArguments: Bundle? = null
}
