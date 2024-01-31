package com.partialhelperapp.app.modules.halamanawalone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.partialhelperapp.app.modules.halamanawalone.`data`.model.GridapaitubutawaRowModel
import com.partialhelperapp.app.modules.halamanawalone.`data`.model.HalamanAwalOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HalamanAwalOneVM : ViewModel(), KoinComponent {
  val halamanAwalOneModel: MutableLiveData<HalamanAwalOneModel> =
      MutableLiveData(HalamanAwalOneModel())

  var navArguments: Bundle? = null

  val gridapaitubutawaList: MutableLiveData<MutableList<GridapaitubutawaRowModel>> =
      MutableLiveData(mutableListOf())
}
