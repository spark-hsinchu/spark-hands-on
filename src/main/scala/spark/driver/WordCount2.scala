package spark.driver

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object WordCount2 {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("WordCount").setMaster("local")
    val sc = new SparkContext(conf)

    val keyword = "spark"
    val fileContent: RDD[String] = sc.textFile("programming-guide.md")
    val keywordCount: RDD[String] = fileContent.flatMap(line => line.split(" "))
                                        .filter{ case(w) => w.toLowerCase == keyword}

//    val keywordCount: RDD[String] = fileContent.flatMap{ line =>
//      val words = line.split(" ")
//      words.filter(_.toLowerCase==keyword)
//    }

    println(s"keyword '$keyword' count=" + keywordCount.count() )
    println( "=" * 60 )

    sc.stop()
  }

}
