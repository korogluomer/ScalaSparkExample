/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package spark.WordCount

import java.util

import org.apache.spark.{SparkConf, SparkContext}

class WordCount(var appName: String, var master: String, var path: String) {

  def getAppName(): String = appName

  def getMaster(): String = master

  def getPath(): String = path

  def setAppName(s: String) = (appName = s)

  def setMaster(s: String) = (master = s)

  def setPath(s: String) = (path = s)


  def count() = {

    val conf = new SparkConf().setAppName(getAppName()).setMaster(getMaster())
    val context = new SparkContext(conf)
    val data = context.textFile(getPath(),4)

    var wordCount = data.map(line => {
      var stats = line.split(",")
      stats(2)+" "+stats(3)
    }).flatMap(line=>line.split(" ")).map(word=>(word,1)).reduceByKey(_ + _)
    wordCount.collect()
    wordCount.foreach(f => println(f._1+" türünden "+f._2+" pokemon bulunmaktadır."))
  }
}

object WordCount {
  def main(args: Array[String]): Unit = {
    val wordCount: WordCount = new WordCount("pokemonCount", "local[4]", "..\\SparkLearn\\Pokemon.csv")
    wordCount.count()
  }

}
