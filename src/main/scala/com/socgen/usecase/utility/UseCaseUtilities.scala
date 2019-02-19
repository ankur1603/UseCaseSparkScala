package com.socgen.usecase.utility

import org.apache.spark.sql.SparkSession
import com.socgen.usecase.model.{Auth,AuthRdd}
import org.apache.spark.sql.Dataset
import org.apache.spark.rdd.RDD

object UseCaseUtilities {
    implicit val spark = SparkSession
			.builder
			.appName("UseCase")
			.master("local[*]")
			.config("spark.sql.warehouse.dir", "file:///C:/temp") // Necessary to work around a Windows bug in Spark 2.0.0; omit if you're not on Windows.
			.getOrCreate()
  
  def readCsvAndGetDS(path :String):Dataset[Auth]= {
    val df = spark.read.format("csv").option("header", "true").load(path).select("aua","sa","asa","res_state_name")
    import spark.implicits._
    df.as[Auth]
  }
  
  def readCsvAndGetRdd(path:String):RDD[AuthRdd]={
    val sc=spark.sparkContext
    val lines=sc.textFile(path)
    lines.map(getAuthRddObj)
   }
  
  //3,4,5,129
  private def getAuthRddObj(line:String):AuthRdd={
    val lineData=line.split(",")
    AuthRdd(lineData(2),lineData(3),lineData(4),lineData(128))
  }
}