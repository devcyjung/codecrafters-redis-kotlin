import java.net.ServerSocket

fun main(args: Array<String>) {
    val serverSocket = ServerSocket(6379)

    // Since the tester restarts your program quite often, setting SO_REUSEADDR
    // ensures that we don't run into 'Address already in use' errors
    serverSocket.reuseAddress = true
    println("server started at port 6379")

    // Wait for connection from client.
    serverSocket.accept()
    println("accepted new connection")
}
