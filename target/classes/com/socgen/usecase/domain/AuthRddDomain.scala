package com.socgen.usecase.domain

import org.apache.spark.rdd.RDD

import com.socgen.usecase.abstractdomain.AbstractAuthRddDomain
import com.socgen.usecase.model.AuthRdd
import com.socgen.usecase.utility.UseCaseUtilities

class AuthRddDomain() extends AbstractAuthRddDomain {
  val path: Option[String]=None: Option[String]
  override def getResult():RDD[AuthRdd] =UseCaseUtilities.readCsvAndGetRdd(path.getOrElse("INVALID_PATH")) 
}