class Contact(val id: Int, var email: String)

class Contact(val id: Int, var email: String) {
    val category: String = ""
}

class Contact(val id: Int, var email: String = "example@gmail.com") {
    val category: String = "work"
}