package beyondbanking.com.bestbank.activities

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceIdService
import com.google.firebase.iid.FirebaseInstanceId



class MyFirebaseInstanceIDService : FirebaseInstanceIdService() {

    override fun onTokenRefresh() {
        super.onTokenRefresh()

        val refreshedToken = FirebaseInstanceId.getInstance().token
        Log.d("thomas", "Refreshed token: " + refreshedToken!!)
    }
}