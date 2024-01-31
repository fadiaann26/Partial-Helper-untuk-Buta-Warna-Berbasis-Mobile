package com.partialhelperapp.app.modules.jenisbutawarnaparsial.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.partialhelperapp.app.modules.jenisbutawarnaparsial.`data`.model.JenisButaWarnaParsialModel
import org.koin.core.KoinComponent

class JenisButaWarnaParsialVM : ViewModel(), KoinComponent {
  val jenisButaWarnaParsialModel: MutableLiveData<JenisButaWarnaParsialModel> =
      MutableLiveData(JenisButaWarnaParsialModel())

  var navArguments: Bundle? = null
}
