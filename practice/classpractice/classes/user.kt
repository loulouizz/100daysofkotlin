package classes

data class User(val id: Int, var name: String, var email: String, var testList: MutableList<Int>) {
    /* override fun hashCode(): Int {
        return id + name.hashCode() + email.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (other is User) {
            if (hashCode() == other.hashCode()) {
                return true
            } else {
                return false
            }
        } else {
            return false
        }
    } */

}
