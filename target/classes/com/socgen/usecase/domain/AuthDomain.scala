package com.socgen.usecase.domain

import org.apache.spark.sql.Dataset
import com.socgen.usecase.abstractdomain.AbstractAuthDomain
import com.socgen.usecase.model.Auth
import com.socgen.usecase.utility.UseCaseUtilities

class AuthDomain() extends AbstractAuthDomain{
  val path: Option[String]=None: Option[String]
  override def getResult():Dataset[Auth] =UseCaseUtilities.readCsvAndGetDS(path.getOrElse("INVALID_PATH")) 
}