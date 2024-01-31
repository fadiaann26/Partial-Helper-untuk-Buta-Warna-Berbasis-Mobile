package com.partialhelperapp.app.modules.jenisbutawarnaparsial.ui

import androidx.activity.viewModels
import com.partialhelperapp.app.R
import com.partialhelperapp.app.appcomponents.base.BaseActivity
import com.partialhelperapp.app.databinding.ActivityJenisButaWarnaParsialBinding
import com.partialhelperapp.app.modules.halamanawalone.ui.HalamanAwalOneActivity
import com.partialhelperapp.app.modules.jenisbutawarnaparsial.`data`.viewmodel.JenisButaWarnaParsialVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class JenisButaWarnaParsialActivity :
    BaseActivity<ActivityJenisButaWarnaParsialBinding>(R.layout.activity_jenis_buta_warna_parsial) {
  private val viewModel: JenisButaWarnaParsialVM by viewModels<JenisButaWarnaParsialVM>()

  private val REQUEST_CODE_HALAMAN_AWAL_ONE_ACTIVITY: Int = 790

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.jenisButaWarnaParsialVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnKembali.setOnClickListener {
      val destIntent = HalamanAwalOneActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HALAMAN_AWAL_ONE_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "JENIS_BUTA_WARNA_PARSIAL_ACTIVITY"

  }
}
