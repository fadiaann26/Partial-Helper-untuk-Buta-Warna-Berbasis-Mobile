package com.partialhelperapp.app.modules.penyebabbutawarnaparsial.ui

import androidx.activity.viewModels
import com.partialhelperapp.app.R
import com.partialhelperapp.app.appcomponents.base.BaseActivity
import com.partialhelperapp.app.databinding.ActivityPenyebabButaWarnaParsialBinding
import com.partialhelperapp.app.modules.halamanawalone.ui.HalamanAwalOneActivity
import com.partialhelperapp.app.modules.penyebabbutawarnaparsial.`data`.viewmodel.PenyebabButaWarnaParsialVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PenyebabButaWarnaParsialActivity :
    BaseActivity<ActivityPenyebabButaWarnaParsialBinding>(R.layout.activity_penyebab_buta_warna_parsial)
    {
  private val viewModel: PenyebabButaWarnaParsialVM by viewModels<PenyebabButaWarnaParsialVM>()

  private val REQUEST_CODE_HALAMAN_AWAL_ONE_ACTIVITY: Int = 203

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.penyebabButaWarnaParsialVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnKembali.setOnClickListener {
      val destIntent = HalamanAwalOneActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HALAMAN_AWAL_ONE_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "PENYEBAB_BUTA_WARNA_PARSIAL_ACTIVITY"

  }
}
