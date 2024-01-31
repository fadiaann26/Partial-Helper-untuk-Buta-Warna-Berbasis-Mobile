package com.partialhelperapp.app.modules.penjelasanbutawarnaparsial.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.partialhelperapp.app.R
import com.partialhelperapp.app.appcomponents.base.BaseActivity
import com.partialhelperapp.app.databinding.ActivityPenjelasanButaWarnaParsialBinding
import com.partialhelperapp.app.modules.halamanawalone.ui.HalamanAwalOneActivity
import com.partialhelperapp.app.modules.penjelasanbutawarnaparsial.`data`.viewmodel.PenjelasanButaWarnaParsialVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PenjelasanButaWarnaParsialActivity :
    BaseActivity<ActivityPenjelasanButaWarnaParsialBinding>(R.layout.activity_penjelasan_buta_warna_parsial)
    {
  private val viewModel: PenjelasanButaWarnaParsialVM by viewModels<PenjelasanButaWarnaParsialVM>()

  private val REQUEST_CODE_HALAMAN_AWAL_ONE_ACTIVITY: Int = 364

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.penjelasanButaWarnaParsialVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnKembali.setOnClickListener {
      val destIntent = HalamanAwalOneActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HALAMAN_AWAL_ONE_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "PENJELASAN_BUTA_WARNA_PARSIAL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PenjelasanButaWarnaParsialActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
