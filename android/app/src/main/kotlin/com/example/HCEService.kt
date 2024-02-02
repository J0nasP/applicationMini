



class HCEService : HostApduService() {
    override fun processCommandApdu(commandApdu: ByteArray?, extras: Bundle?) : ByteArray {
        if (commandApdu != null) {
            val success: Boolean = processCommand(commandApdu)
            forwardTheResult(success)
            return if (success) RESULT_SUCCESS.toByteArray() else RESULT_FAILURE.toByteArray()
        }
        return RESULT_EMPTY.toByteArray()
    }

    private fun forwardTheResult() {
        startActivity(
            Intent(this, MainActivity::class.java)
            .apply{
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                putExtra("succes", true)
            }
        )
    }

}