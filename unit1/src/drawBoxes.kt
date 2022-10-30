//Reese Wadsworth, P1
object drawBoxes {
    fun main(args: Array<String?>?) {
        System.out.println("start:")
        drawBox()
        drawBox()
        drawBox()
        System.out.println("end.")
    }

    fun sides() {
        System.out.println("|       |\n|       |")
    }

    fun topBot() {
        System.out.println("+-------+")
    }

    fun drawBox() {
        topBot()
        sides()
        topBot()
    }
}