package wetickets.wescanapp.presentation.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import wetickets.wescanapp.R
import wetickets.wescanapp.domain.models.requests.ActionListTicketsResponseModel

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val apiController = wetickets.wescanapp.application.volley.ApiController()
        apiController.actionListTickets(
                "https://admin.wetickets.ws",
                "ZATERDAG",
                "Test",
                { response -> onLoginSuccess(response) },
                { title, message -> onLoginError(title, message) }
        )
    }

    private fun onLoginSuccess(response: ActionListTicketsResponseModel) {
        var xxx: Int = 10
        xxx++
        xxx++
    }

    private fun onLoginError(title: String, message: String) {
        var xxx: Int = 10
        xxx++
        xxx++
    }
}