package com.partialhelperapp.app.modules.pengobatanbutawarnaparsial.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.partialhelperapp.app.modules.pengobatanbutawarnaparsial.`data`.model.PengobatanButaWarnaParsialModel
import org.koin.core.KoinComponent

class PengobatanButaWarnaParsialVM : ViewModel(), KoinComponent {
  val pengobatanButaWarnaParsialModel: MutableLiveData<PengobatanButaWarnaParsialModel> =
      MutableLiveData(PengobatanButaWarnaParsialModel())

  var navArguments: Bundle? = null
}
