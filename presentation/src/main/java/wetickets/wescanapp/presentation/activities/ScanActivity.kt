package wetickets.wescanapp.presentation.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import wetickets.wescanapp.R
import wetickets.wescanapp.domain.viewModelFactories.views.BottomBarVMF

class ScanActivity(
        val bottomBarVMF: BottomBarVMF = BottomBarVMF()
) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}