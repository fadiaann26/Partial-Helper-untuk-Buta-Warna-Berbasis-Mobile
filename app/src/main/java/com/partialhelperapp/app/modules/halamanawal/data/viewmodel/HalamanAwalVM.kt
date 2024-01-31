package com.partialhelperapp.app.modules.halamanawal.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.partialhelperapp.app.modules.halamanawal.`data`.model.HalamanAwalModel
import org.koin.core.KoinComponent

class HalamanAwalVM : ViewModel(), KoinComponent {
  val halamanAwalModel: MutableLiveData<HalamanAwalModel> = MutableLiveData(HalamanAwalModel())

  var navArguments: Bundle? = null
}
