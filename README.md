# spark-hands-on

* 安裝 SBT
  * Linux
    * [一般安裝介紹](http://www.scala-sbt.org/0.13/docs/Installing-sbt-on-Linux.html)
    * [手動安裝 SBT](http://www.scala-sbt.org/0.13/docs/Manual-Installation.html#Unix)
    * 使用 [sbt runner](https://github.com/paulp/sbt-extras)
  * Mac OS X
    * [一般安裝介紹](http://www.scala-sbt.org/0.13/docs/Installing-sbt-on-Mac.html)
    * [手動安裝](http://www.scala-sbt.org/0.13/docs/Manual-Installation.html#Unix)
    * 使用 [sbt runner](https://github.com/paulp/sbt-extras)
  * Windows
    * [一般安裝介紹](http://www.scala-sbt.org/0.13/docs/Installing-sbt-on-Windows.html)
    * [手動安裝](http://www.scala-sbt.org/0.13/docs/Manual-Installation.html#Windows)

* Editor/IDE
  * 唯一推薦 IDE: [Intellij IDEA Community](https://www.jetbrains.com/idea/download/)
  * 任何你喜歡的 editor

* Branches
  * [empty](https://github.com/spark-hsinchu/spark-hands-on/tree/empty)
     * Hands on 的起點
     * 只有兩個檔案: `sbt` 及 `.gitignore`
  * [helloworld](https://github.com/spark-hsinchu/spark-hands-on/tree/helloworld)
     * 使用 scala + sbt
     * 實作 HelloWorld 程式
     * 整合 Intellij IDEA
  * [wordcount](https://github.com/spark-hsinchu/spark-hands-on/tree/wordcount)
     * 實作 WordCount 程式
     * sbt 操作
     * 整合 Intellij IDEA

* Commands
  * HelloWorld
```
$ git clone -b helloworld https://github.com/spark-hsinchu/spark-hands-on.git helloworld
$ git clone -b empty https://github.com/spark-hsinchu/spark-hands-on.git myhelloworld
$ cd myhelloworld
$ vim build.sbt
```
  * WorldCount
```
$ git clone -b wordcount https://github.com/spark-hsinchu/spark-hands-on.git wordcount
$ git clone -b empty https://github.com/spark-hsinchu/spark-hands-on.git mywordcount
$ cd mywordcount
$ mkdir -p src/main/scala/spark/driver
$ vim build.sbt
```
