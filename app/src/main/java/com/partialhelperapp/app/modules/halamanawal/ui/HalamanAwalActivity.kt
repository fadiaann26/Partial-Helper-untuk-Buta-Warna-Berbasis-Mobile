package com.partialhelperapp.app.modules.halamanawal.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.partialhelperapp.app.R
import com.partialhelperapp.app.appcomponents.base.BaseActivity
import com.partialhelperapp.app.databinding.ActivityHalamanAwalBinding
import com.partialhelperapp.app.modules.halamanawal.`data`.viewmodel.HalamanAwalVM
import com.partialhelperapp.app.modules.halamanawalone.ui.HalamanAwalOneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HalamanAwalActivity : BaseActivity<ActivityHalamanAwalBinding>(R.layout.activity_halaman_awal)
    {
  private val viewModel: HalamanAwalVM by viewModels<HalamanAwalVM>()

  private val REQUEST_CODE_HALAMAN_AWAL_ONE_ACTIVITY: Int = 377

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.halamanAwalVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = HalamanAwalOneActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.imageRectangleSixtyNine.setOnClickListener {
        val destIntent = HalamanAwalOneActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_HALAMAN_AWAL_ONE_ACTIVITY)
      }
      binding.txtLanguage.setOnClickListener {
        val destIntent = HalamanAwalOneActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_HALAMAN_AWAL_ONE_ACTIVITY)
      }
    }

    companion object {
      const val TAG: String = "HALAMAN_AWAL_ACTIVITY"

    }
  }
