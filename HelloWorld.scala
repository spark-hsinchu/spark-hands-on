
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object HelloWorld {
  
  def main(args: Array[String]): Unit = {
    val logger = LoggerFactory.getLogger(this.getClass)
    println("HelloWorld !")
    logger.info("HelloWorld finished !")
  }

}

