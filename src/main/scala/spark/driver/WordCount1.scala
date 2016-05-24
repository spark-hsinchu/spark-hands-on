package spark.driver

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object WordCount1 {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("WordCount").setMaster("local")
    val sc = new SparkContext(conf)

    val rddFileContent: RDD[String] = sc.textFile("programming-guide.md")

    val rddWord: RDD[String] = rddFileContent.flatMap( (line:String) => line.split(" ") )
//    val rddWord: RDD[String] = rddFileContent.flatMap{ (line:String) => line.split(" ") }
//    val rddWord: RDD[String] = rddFileContent.flatMap( line => line.split(" ") )
//    val rddWord: RDD[String] = rddFileContent.flatMap(_.split(" "))


    val rddWordCount: RDD[(String, Int)] = rddWord.map(word => (word, 1)).reduceByKey(_ + _)
//    val rddWordCount: RDD[(String, Int)] = rddWord.map(word => (word, 1)).reduceByKey((v1: Int, v2: Int) => v1 + v2)
//    val rddWordCount: RDD[(String, Int)] = rddWord.map((_, 1)).reduceByKey(_ + _)


// *** all in the same line ***

//    val rddWordCount = sc.textFile("programming-guide.md")
//                          .flatMap(line => line.split(" "))
//                          .map(word => (word, 1))
//                          .reduceByKey(_ + _)


    // print result
    rddWordCount.foreach { case (w, c) => println(s"$w($c)") }

    // save to file
//    rddWordCount.map{case(w,c)=> w + "\t" + c}.saveAsTextFile("wordcount.result")

    println("=" * 60)
    sc.stop()
  }

}
