package com.partialhelperapp.app.modules.penjelasanbutawarnaparsial.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.partialhelperapp.app.modules.penjelasanbutawarnaparsial.`data`.model.PenjelasanButaWarnaParsialModel
import org.koin.core.KoinComponent

class PenjelasanButaWarnaParsialVM : ViewModel(), KoinComponent {
  val penjelasanButaWarnaParsialModel: MutableLiveData<PenjelasanButaWarnaParsialModel> =
      MutableLiveData(PenjelasanButaWarnaParsialModel())

  var navArguments: Bundle? = null
}
