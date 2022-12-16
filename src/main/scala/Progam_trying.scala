object Progam_trying {
  def main(args: Array[String]): Unit = {
    val i: Int = 2
    val result = i match {
      case 1 => "one"
      case 2 => "two"
      case _ => "not 1 or 2"
    }
    println(result)
    val bool: Boolean = true
    val booleanAsString = bool match {
      case true => "true"
      case false => "false"
    }
    println(booleanAsString)



  }

}
