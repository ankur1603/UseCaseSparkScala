package com.socgen.usecase.main

import org.apache.log4j.Level
import org.apache.log4j.Logger
import com.socgen.usecase.domain.withlayers.AuthDomainWithLayersVED
import com.socgen.usecase.domain.withlayers.AuthRddDomainWithLayersVED
import scala.tools.nsc.typechecker.Implicits


object UseCaseMain {
  def main(Args:Array[String]):Unit= {
    
    Logger.getLogger("org").setLevel(Level.FATAL)
    implicit def getStringOption(str:String) = Option(str)
		
    val path:String= Args(0)
    
		val result=(AuthDomainWithLayersVED(path)).getResult()
		result.select("aua").toJSON.show()
    result.show()
    println(result.count())
    
    
    
    val resultRDD=(AuthRddDomainWithLayersVED(path)).getResult()
    resultRDD.collect().foreach(println)
    println(resultRDD.count())
    
  }
}