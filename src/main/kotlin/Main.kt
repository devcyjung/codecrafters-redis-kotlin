import java.net.ServerSocket

const val PORT = 6379
const val PONG_MESSAGE = "+PONG\r\n"

fun main(args: Array<String>) {
    val serverSocket = ServerSocket(PORT)
    serverSocket.reuseAddress = true
    println("server started at port 6379")

    // Wait for connection from client.
    val clientSocket = serverSocket.accept()
    println("accepted new connection from ${clientSocket.remoteSocketAddress}")

    val output = clientSocket.getOutputStream()

    output.write(PONG_MESSAGE.toByteArray())
}
