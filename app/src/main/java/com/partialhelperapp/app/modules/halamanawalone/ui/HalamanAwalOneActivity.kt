package com.partialhelperapp.app.modules.halamanawalone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.partialhelperapp.app.R
import com.partialhelperapp.app.appcomponents.base.BaseActivity
import com.partialhelperapp.app.databinding.ActivityHalamanAwalOneBinding
import com.partialhelperapp.app.modules.halamanawalone.`data`.model.GridapaitubutawaRowModel
import com.partialhelperapp.app.modules.halamanawalone.`data`.viewmodel.HalamanAwalOneVM
import com.partialhelperapp.app.modules.penjelasanbutawarnaparsial.ui.PenjelasanButaWarnaParsialActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HalamanAwalOneActivity :
    BaseActivity<ActivityHalamanAwalOneBinding>(R.layout.activity_halaman_awal_one) {
  private val viewModel: HalamanAwalOneVM by viewModels<HalamanAwalOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridapaitubutawaAdapter =
    GridapaitubutawaAdapter(viewModel.gridapaitubutawaList.value?:mutableListOf())
    binding.recyclerGridapaitubutawa.adapter = gridapaitubutawaAdapter
    gridapaitubutawaAdapter.setOnItemClickListener(
    object : GridapaitubutawaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridapaitubutawaRowModel) {
        onClickRecyclerGridapaitubutawa(view, position, item)
      }
    }
    )
    viewModel.gridapaitubutawaList.observe(this) {
      gridapaitubutawaAdapter.updateData(it)
    }
    binding.halamanAwalOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridapaitubutawa(
    view: View,
    position: Int,
    item: GridapaitubutawaRowModel
  ): Unit {
    when(view.id) {
      R.id.btnPenjelasan -> {
        val destIntent = PenjelasanButaWarnaParsialActivity.getIntent(this, null)
        startActivity(destIntent)
        this.overridePendingTransition(R.anim.fade_in ,R.anim.fade_out )
      }
    }
  }

  companion object {
    const val TAG: String = "HALAMAN_AWAL_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HalamanAwalOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
