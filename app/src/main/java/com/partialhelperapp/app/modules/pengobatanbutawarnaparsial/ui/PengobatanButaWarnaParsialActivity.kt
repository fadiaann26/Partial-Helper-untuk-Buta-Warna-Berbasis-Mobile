package com.partialhelperapp.app.modules.pengobatanbutawarnaparsial.ui

import androidx.activity.viewModels
import com.partialhelperapp.app.R
import com.partialhelperapp.app.appcomponents.base.BaseActivity
import com.partialhelperapp.app.databinding.ActivityPengobatanButaWarnaParsialBinding
import com.partialhelperapp.app.modules.halamanawalone.ui.HalamanAwalOneActivity
import com.partialhelperapp.app.modules.pengobatanbutawarnaparsial.`data`.viewmodel.PengobatanButaWarnaParsialVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PengobatanButaWarnaParsialActivity :
    BaseActivity<ActivityPengobatanButaWarnaParsialBinding>(R.layout.activity_pengobatan_buta_warna_parsial)
    {
  private val viewModel: PengobatanButaWarnaParsialVM by viewModels<PengobatanButaWarnaParsialVM>()

  private val REQUEST_CODE_HALAMAN_AWAL_ONE_ACTIVITY: Int = 117

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pengobatanButaWarnaParsialVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnKembali.setOnClickListener {
      val destIntent = HalamanAwalOneActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HALAMAN_AWAL_ONE_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "PENGOBATAN_BUTA_WARNA_PARSIAL_ACTIVITY"

  }
}
