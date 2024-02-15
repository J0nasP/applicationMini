import android.nfc.cardemulation.HostApduService
import android.os.bundle
import android.util.Log

class HceApduService : HostApduServiceService() {
    
    override fun processCommandApdu(commandApdu: ByteArray?, extras: Bundle?): ByteArray {
        Log.d("HCE", "processCommand")
        Log.d("HCE", Arrays.toString(commandApdu))

        return "Hello".toByteArray()
    }

    override fun onDeactivated(reason: Int) 
    Log.d("HCE", "Deavtivated: $reason")

    private fun forwardResult(){
        startActivity(
            Intent(this, MainActivity::class.java)
            .apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                putExtra("success", true)
            }
        )
    }
}